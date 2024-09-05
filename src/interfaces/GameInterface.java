package src.interfaces;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.List;

import src.controllers.Features;
import src.utils.GameLogic;

public class GameInterface extends JFrame {
  private static final int WINDOW_WIDTH = 1200;
  private static final int WINDOW_HEIGHT = 750;
  private static final String TITLE = "Mini Akinator";
  private static final String IMAGE_PATH = "E:/Mini_Akinator/src/assets/img/";
  private static final Color BACKGROUND_COLOR = new Color(240, 240, 255);
  private static final Color BUTTON_COLOR = new Color(100, 150, 255);
  private static final Color TEXT_COLOR = new Color(50, 50, 150);
  private static final Font TITLE_FONT = new Font("Arial", Font.BOLD, 48);
  private static final Font SUBTITLE_FONT = new Font("Arial", Font.PLAIN, 22);
  private static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 20);
  private static final Font QUESTION_FONT = new Font("Arial", Font.BOLD, 24);
  private static final Font CHARACTER_LIST_FONT = new Font("Arial", Font.PLAIN, 16);

  private JPanel mainPanel;
  private JLabel questionLabel;
  private JButton yesButton;
  private JButton noButton;

  private GameLogic gameLogic;

  public GameInterface(List<Features> characters) {
    this.gameLogic = new GameLogic(characters);
    initializeUI();
  }

  private void initializeUI() {
    setTitle(TITLE);
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setContentPane(createMainPanel());
    setVisible(true);
  }

  private JPanel createMainPanel() {
    mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.setBackground(BACKGROUND_COLOR);
    mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

    mainPanel.add(Box.createVerticalGlue());
    mainPanel.add(createTitleLabel());
    mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
    mainPanel.add(createSubtitleLabel());
    mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
    mainPanel.add(createImageLabel());
    mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
    mainPanel.add(createStartButton());
    mainPanel.add(Box.createVerticalGlue());

    return mainPanel;
  }

  private JLabel createTitleLabel() {
    return createStyledLabel("MINI AKINATOR", TITLE_FONT, TEXT_COLOR);
  }

  private JLabel createSubtitleLabel() {
    return createStyledLabel("Consigo adivinhar qualquer personagem em que você esteja pensando", SUBTITLE_FONT,
        Color.DARK_GRAY);
  }

  private JLabel createImageLabel() {
    JLabel label = new JLabel();
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    ImageIcon imageIcon = new ImageIcon("C:/Users/citap/Documents/Nova pasta/developers");
    Image image = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
    label.setIcon(new ImageIcon(image));
    return label;
  }

  private JButton createStartButton() {
    return createStyledButton("Topa o desafio?", BUTTON_COLOR, e -> startGame());
  }

  private JLabel createStyledLabel(String text, Font font, Color color) {
    JLabel label = new JLabel(text, SwingConstants.CENTER);
    label.setFont(font);
    label.setForeground(color);
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    return label;
  }

  private JButton createStyledButton(String text, Color bgColor, java.awt.event.ActionListener action) {
    JButton button = new JButton(text) {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.dispose();
        super.paintComponent(g);
      }
    };
    button.setFont(BUTTON_FONT);
    button.setBackground(bgColor);
    button.setForeground(Color.WHITE);
    button.setBorderPainted(false);
    button.setFocusPainted(false);
    button.setContentAreaFilled(false);
    button.addActionListener(action);
    button.setAlignmentX(Component.CENTER_ALIGNMENT);
    button.setPreferredSize(new Dimension(250, 60));

    // Add hover effect
    button.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        button.setBackground(bgColor.brighter());
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
      }

      @Override
      public void mouseExited(MouseEvent e) {
        button.setBackground(bgColor);
        button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
      }
    });

    // Add scale effect on press
    button.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        button.setSize(new Dimension((int) (button.getWidth() * 0.95), (int) (button.getHeight() * 0.95)));
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        button.setSize(new Dimension((int) (button.getWidth() / 0.95), (int) (button.getHeight() / 0.95)));
      }
    });

    return button;
  }

  private void startGame() {
    gameLogic.resetGame();
    setContentPane(createGamePanel());
    askNextQuestion();
    revalidate();
    repaint();
  }

  private JPanel createGamePanel() {
    JPanel panel = new JPanel(new BorderLayout(20, 20));
    panel.setBackground(BACKGROUND_COLOR);

    questionLabel = createStyledLabel("", QUESTION_FONT, TEXT_COLOR);
    panel.add(questionLabel, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
    yesButton = createStyledButton("Sim", new Color(100, 200, 100), e -> processAnswer(true));
    noButton = createStyledButton("Não", new Color(200, 100, 100), e -> processAnswer(false));
    buttonPanel.add(yesButton);
    buttonPanel.add(noButton);
    panel.add(buttonPanel, BorderLayout.SOUTH);

    return panel;
  }

  private void processAnswer(boolean answer) {
    gameLogic.processAnswer(answer);
    if (gameLogic.isGameOver()) {
      showResult();
    } else {
      askNextQuestion();
    }
  }

  private void askNextQuestion() {
    if (gameLogic.canAskMoreQuestions()) {
      String question = gameLogic.getNextQuestion();
      questionLabel.setText(question);
    } else {
      showResult();
    }
  }

  private void showResult() {
    JPanel resultPanel;
    if (gameLogic.hasDiscoveredCharacter()) {
      resultPanel = createDiscoveredCharacterPanel();
    } else if (gameLogic.getRemainingCharacters().size() > 1) {
      resultPanel = createMultipleCharactersPanel();
    } else {
      resultPanel = createRemainingCharactersPanel();
    }

    JPanel endGamePanel = new JPanel(new BorderLayout());
    endGamePanel.setBackground(BACKGROUND_COLOR);
    endGamePanel.add(resultPanel, BorderLayout.CENTER);
    endGamePanel.add(createStyledButton("Jogar Novamente", BUTTON_COLOR, e -> startGame()), BorderLayout.SOUTH);

    setContentPane(endGamePanel);
    revalidate();
    repaint();
  }

  private JPanel createMultipleCharactersPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBackground(BACKGROUND_COLOR);
    panel.setBorder(new EmptyBorder(20, 20, 20, 20));

    JLabel titleLabel = createStyledLabel("Não foi possível definir um único personagem.", QUESTION_FONT, TEXT_COLOR);
    titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(titleLabel);

    panel.add(Box.createRigidArea(new Dimension(0, 20)));

    JLabel subtitleLabel = createStyledLabel("Os personagens mais próximos são:", SUBTITLE_FONT, TEXT_COLOR);
    subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(subtitleLabel);

    panel.add(Box.createRigidArea(new Dimension(0, 20)));

    JPanel charactersPanel = new JPanel();
    charactersPanel.setLayout(new BoxLayout(charactersPanel, BoxLayout.Y_AXIS));
    charactersPanel.setBackground(BACKGROUND_COLOR);

    List<Features> remainingCharacters = gameLogic.getRemainingCharacters();
    for (Features character : remainingCharacters) {
      JLabel characterLabel = createStyledLabel("• " + character.getName(), CHARACTER_LIST_FONT, TEXT_COLOR);
      characterLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
      charactersPanel.add(characterLabel);
      charactersPanel.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    JScrollPane scrollPane = new JScrollPane(charactersPanel);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());
    scrollPane.setBackground(BACKGROUND_COLOR);
    scrollPane.getViewport().setBackground(BACKGROUND_COLOR);
    panel.add(scrollPane);

    // Adicionar informação sobre o número de personagens restantes
    JLabel countLabel = createStyledLabel("Total de personagens restantes: " + remainingCharacters.size(),
        SUBTITLE_FONT, TEXT_COLOR);
    countLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(Box.createRigidArea(new Dimension(0, 20)));
    panel.add(countLabel);

    return panel;
  }

  private JPanel createDiscoveredCharacterPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.setBackground(BACKGROUND_COLOR);
    panel.setBorder(new EmptyBorder(20, 20, 20, 20));

    try {
      panel.add(createCharacterImageLabel());
    } catch (Exception e) {
      System.err.println("Erro ao carregar a imagem: " + e.getMessage());
    }

    panel.add(Box.createRigidArea(new Dimension(0, 20)));
    String characterName = gameLogic.getDiscoveredCharacter().getName();
    panel.add(createStyledLabel("O personagem em que você está pensando é " + characterName + "!",
        QUESTION_FONT, TEXT_COLOR));

    return panel;
  }

  private JLabel createCharacterImageLabel() {
    String characterName = gameLogic.getDiscoveredCharacter().getName().toLowerCase();
    String[] possibleExtensions = { ".jpeg", ".jpg", ".png" };
    String imagePath = null;

    for (String extension : possibleExtensions) {
      String potentialPath = IMAGE_PATH + characterName + extension;
      if (new File(potentialPath).exists()) {
        imagePath = potentialPath;
        break;
      }
    }

    if (imagePath == null) {
      System.err.println("No image found for character: " + characterName);
      imagePath = IMAGE_PATH + "default.png";
    }

    ImageIcon characterImage = new ImageIcon(imagePath);
    Image image = characterImage.getImage();
    Image resizedImage = image.getScaledInstance(300, 400, Image.SCALE_SMOOTH);
    characterImage = new ImageIcon(resizedImage);

    JLabel characterImageLabel = new JLabel();
    characterImageLabel.setIcon(characterImage);
    characterImageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    return characterImageLabel;
  }

  private JPanel createRemainingCharactersPanel() {
    JPanel panel = new JPanel(new BorderLayout());
    panel.setBackground(BACKGROUND_COLOR);

    JTextArea remainingCharactersArea = new JTextArea();
    remainingCharactersArea.setFont(CHARACTER_LIST_FONT);
    remainingCharactersArea.setEditable(false);
    remainingCharactersArea.setBackground(BACKGROUND_COLOR);

    StringBuilder sb = new StringBuilder(
        "Não foi possível determinar o personagem com certeza. Os personagens restantes são:\n\n");
    for (Features character : gameLogic.getRemainingCharacters()) {
      sb.append("- ").append(character.getName()).append("\n");
    }
    remainingCharactersArea.setText(sb.toString());

    JScrollPane scrollPane = new JScrollPane(remainingCharactersArea);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());
    panel.add(scrollPane, BorderLayout.CENTER);

    return panel;
  }
}