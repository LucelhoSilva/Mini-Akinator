# Mini Akinator

## Descrição do Projeto

Mini Akinator é um jogo de adivinhação de personagens inspirado no famoso jogo Akinator. Neste jogo interativo, o computador tenta adivinhar um personagem que o jogador está pensando, fazendo uma série de perguntas de sim ou não. É uma demonstração divertida de como um algoritmo pode "adivinhar" informações com base em perguntas estratégicas.

## Funcionalidades Principais

1. **Interface Gráfica Intuitiva**: Desenvolvida com Swing, oferece uma experiência de usuário amigável e atraente.
2. **Base de Dados Diversificada**: Inclui personagens de vários universos populares como Marvel, DC, Harry Potter, Dragon Ball, e outros.
3. **Sistema de Perguntas Inteligente**: Utiliza um algoritmo baseado em entropia de informação para fazer as perguntas mais relevantes.
4. **Adivinhação Eficiente**: Capaz de adivinhar personagens em 15 perguntas ou menos na maioria dos casos.

## Como o Jogo Funciona

1. **Início do Jogo**: O jogador pensa em um personagem da base de dados do jogo.
2. **Fase de Perguntas**: O jogo faz uma série de perguntas sobre as características do personagem.
3. **Respostas do Jogador**: Para cada pergunta, o jogador responde "Sim" ou "Não".
4. **Processamento de Dados**: Com base nas respostas, o jogo filtra dinamicamente a lista de personagens possíveis.
5. **Adivinhação**: O processo continua até que o jogo adivinhe o personagem ou esgote o número máximo de perguntas (15).
6. **Resultado**: O jogo apresenta sua adivinhação ou, se não conseguir, mostra os personagens mais prováveis.

## Requisitos do Sistema

- Java JDK 11 ou superior
- IDE compatível com Java (o projeto foi desenvolvido e testado no Visual Studio Code)

## Configuração do Ambiente de Desenvolvimento

1. **Instalação do Java**: Certifique-se de ter o Java JDK 11 ou superior instalado em seu sistema.

2. **Configuração do Visual Studio Code**:

   - Instale a extensão "Extension Pack for Java" no VS Code.
   - Configure o Java Development Kit (JDK) nas configurações do VS Code.

3. **Clonando o Repositório**:

   ```
   git clone https://github.com/seu-usuario/mini-akinator.git
   cd mini-akinator
   ```

4. **Abrindo o Projeto**:
   - Abra o Visual Studio Code
   - Vá para File > Open Folder e selecione a pasta do projeto mini-akinator

## Como Executar o Jogo

1. **No Visual Studio Code**:

   - Abra o arquivo `Main.java`.
   - Execute o codigo.

## Estrutura do Projeto

- `src/controllers/`: Classes de controle como `Features` e `Filter`.
- `src/interfaces/`: Contém `GameInterface` para a interface gráfica.
- `src/utils/`: Classes utilitárias como `GameLogic` e `Question`.
- `src/characters/`: Classes para diferentes universos de personagens.
- `Main.java`: Ponto de entrada do programa.

## Como Jogar

1. Inicie o jogo e pense em um personagem da base de dados.
2. Responda às perguntas clicando nos botões "Sim" ou "Não".
3. Continue respondendo até que o jogo adivinhe ou faça 15 perguntas.
4. No final, veja se o jogo adivinhou corretamente seu personagem!

## Contribuindo para o Projeto

Contribuições são muito bem-vindas! Se você tem ideias para melhorar o jogo, siga estes passos:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/SuaNovaFeature`).
3. Faça commit das suas mudanças (`git commit -m 'Adicionei uma nova feature'`).
4. Push para a branch (`git push origin feature/SuaNovaFeature`).
5. Abra um Pull Request.

## CASO A EXPLICAÇÃO ACIMA NÃO TENHA SIDO SUFICIENTE, SEGUE ABAIXO UM PASSO A PASSO MAIS DETALHADO:

- BAIXAR PDF -> [PROJETO MINI - AKINATOR](./PROJETO%20MINI%20-%20AKINATOR.pdf)

## Contato e Suporte

- Desenvolvedor: [Lucelho Silva]
- Email: [lucelhosilva@elystech.com.br]
- GitHub: [https://github.com/lucelhosilva](https://github.com/lucelhosilva)

Para reportar bugs ou sugerir novas funcionalidades, por favor, abra uma issue no GitHub do projeto.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo `LICENSE` para detalhes.
