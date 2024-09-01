package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import controllers.Features;
import utils.Question;

public class QuestionInterface extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JLabel subtitleLabel;
    private JButton challengeButton;
    private JLabel imageLabel;
    private JTextArea characterListArea;
    private JLabel instructionLabel;
    private JLabel questionLabel;
    private JButton startButton;
    private JButton yesButton;
    private JButton noButton;
    private List<Features> originalCharacterList;
    private List<Features> currentCharacterList;
    private int questionsAsked;
    private Features discoveredCharacter;
    private List<Question> relevantQuestions;

    public QuestionInterface(List<Features> characters) {
        this.originalCharacterList = new ArrayList<>(characters);
        this.currentCharacterList = new ArrayList<>(characters);
        this.questionsAsked = 0;
        this.discoveredCharacter = null;

        setTitle("Mini Akinator");
        setSize(1200, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        titleLabel = new JLabel("MINI AKINATOR");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        subtitleLabel = new JLabel("Consigo adivinhar qualquer personagem em que você esteja pensando");
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        imageLabel = new JLabel();
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ImageIcon imageIcon = new ImageIcon("C:/Users/citap/Documents/Nova pasta/developers");
        imageLabel.setIcon(imageIcon);

        challengeButton = new JButton("Topa o desafio?");
        challengeButton.setFont(new Font("Arial", Font.PLAIN, 18));
        challengeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        challengeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startCharacterSelection();
            }
        });

        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(subtitleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(imageLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(challengeButton);
        mainPanel.add(Box.createVerticalGlue());

        add(mainPanel);
    }

    private void startCharacterSelection() {
        remove(mainPanel);
        showCharacterListScreen();
        revalidate();
        repaint();
    }

    private void showCharacterListScreen() {
        setLayout(new BorderLayout());

        characterListArea = new JTextArea();
        characterListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(characterListArea);
        add(scrollPane, BorderLayout.CENTER);

        instructionLabel = new JLabel("Clique em 'Start' quando estiver pronto para começar.");
        add(instructionLabel, BorderLayout.NORTH);

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        add(startButton, BorderLayout.SOUTH);

        displayCharacterList();
    }

    private void displayCharacterList() {
        StringBuilder sb = new StringBuilder("Personagens disponíveis:\n\n");
        for (int i = 0; i < currentCharacterList.size(); i++) {
            sb.append((i + 1)).append(". ").append(currentCharacterList.get(i).getName()).append("\n");
        }
        characterListArea.setText(sb.toString());
    }

    private void startGame() {
        this.questionsAsked = 0;
        this.discoveredCharacter = null;

        remove(characterListArea);
        remove(instructionLabel);
        remove(startButton);

        getContentPane().removeAll();

        setLayout(new GridLayout(3, 1));
        questionLabel = new JLabel();
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(questionLabel);

        JPanel buttonPanel = new JPanel();
        yesButton = new JButton("Sim");
        noButton = new JButton("Não");

        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        add(buttonPanel);

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processAnswer(true);
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processAnswer(false);
            }
        });

        relevantQuestions = Question.obterPerguntasRelevantes(currentCharacterList, questionsAsked,
                discoveredCharacter);
        askNextQuestion();

        revalidate();
        repaint();
    }

    private void askNextQuestion() {
        if (!relevantQuestions.isEmpty()) {
            Question currentQuestion = relevantQuestions.get(0);
            questionLabel.setText(currentQuestion.getPergunta());
            yesButton.setEnabled(true);
            noButton.setEnabled(true);
        } else {
            endGame();
        }
    }

    private void processAnswer(boolean answer) {
        if (!relevantQuestions.isEmpty()) {
            Question currentQuestion = relevantQuestions.get(0);
            controllers.Filter.filtrarPersonagens(currentCharacterList, currentQuestion.getFeatures(), answer);
            questionsAsked++;

            if (currentCharacterList.size() == 1 && discoveredCharacter == null) {
                discoveredCharacter = currentCharacterList.get(0);
                endGame();
            } else {
                relevantQuestions = Question.obterPerguntasRelevantes(currentCharacterList, questionsAsked,
                        discoveredCharacter);
                askNextQuestion();
            }
        }
    }

    private void endGame() {
        getContentPane().removeAll();
        if (discoveredCharacter != null) {
            String imagePath = "E:/Mini_Akinator/assets/img/" + discoveredCharacter.getName().toLowerCase() + ".jpeg";

            try {
                ImageIcon characterImage = new ImageIcon(imagePath);

                Image image = characterImage.getImage();
                Image resizedImage = image.getScaledInstance(152, 332, Image.SCALE_SMOOTH);
                characterImage = new ImageIcon(resizedImage);

                if (characterImage.getIconWidth() == -1) {
                    System.err.println("Imagem não encontrada: " + imagePath);
                    characterImage = new ImageIcon("E:\\Mini_Akinator\\assets\\img\\gohan.jpeg");
                }

                JPanel resultPanel = new JPanel();

                JLabel characterImageLabel = new JLabel();
                characterImageLabel.setIcon(characterImage);
                resultPanel.add(characterImageLabel);
                add(resultPanel, BorderLayout.CENTER);

            } catch (Exception e) {
                System.err.println("Erro ao carregar a imagem: " + e.getMessage());
            }

            JPanel resultPanel = new JPanel();
            resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));
            resultPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel characterImageLabel = new JLabel();
            characterImageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel resultLabel = new JLabel(
                    "O personagem em que você está pensando é " + discoveredCharacter.getName() + "!");
            resultLabel.setFont(new Font("Arial", Font.BOLD, 24));
            resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            resultPanel.add(characterImageLabel);
            resultPanel.add(Box.createRigidArea(new Dimension(0, 20)));
            resultPanel.add(resultLabel);

            add(resultPanel, BorderLayout.CENTER);
        } else if (currentCharacterList.isEmpty()) {
            JLabel resultLabel = new JLabel("Não há personagens que correspondam às características fornecidas.");
            resultLabel.setFont(new Font("Arial", Font.BOLD, 24));
            add(resultLabel, BorderLayout.CENTER);
        } else {
            StringBuilder remainingCharacters = new StringBuilder(
                    "Não foi possível determinar o personagem com certeza. Os personagens restantes são:\n");
            for (Features p : currentCharacterList) {
                remainingCharacters.append(p.getName()).append("\n");
            }
            JTextArea remainingCharactersArea = new JTextArea(remainingCharacters.toString());
            remainingCharactersArea.setFont(new Font("Arial", Font.PLAIN, 18));
            remainingCharactersArea.setEditable(false);
            add(new JScrollPane(remainingCharactersArea), BorderLayout.CENTER);
        }

        JButton playAgainButton = new JButton("Jogar Novamente?");
        playAgainButton.setFont(new Font("Arial", Font.PLAIN, 18));
        playAgainButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });

        add(playAgainButton, BorderLayout.SOUTH);

        revalidate();
        repaint();
    }

    private void restartGame() {
        this.questionsAsked = 0;
        this.discoveredCharacter = null;
        this.currentCharacterList = new ArrayList<>(this.originalCharacterList);

        getContentPane().removeAll();
        showCharacterListScreen();

        revalidate();
        repaint();
    }
}