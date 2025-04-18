# praticando Java 
Este projeto implementa o jogo Super Trunfo em Java, utilizando os principais conceitos de Programação Orientada a Objetos (POO).

🔍 Conceitos de POO aplicados

📦 <strong>Classes, Atributos e Métodos</strong>

Foram implementadas as seguintes classes:

Card
Atributos: nome, forca, defesa, perspicacia
Método: construtor Card(String n, int f, int d, int p)

Player
Atributos: nome, pontuacao, carta

Arbitro
Atributo: pilha (lista de Card)

Métodos:
darCarta() — distribui uma carta aleatória.
comprarBatalha(int tipo, Player player, Player cpu) — compara atributos das cartas e atualiza pontuações.

Playground
Método: main() — executa a lógica do jogo.

👥 <strong>Instanciação de Objetos</strong>

Os objetos são criados a partir das classes:

Card — para gerar cartas com atributos aleatórios.

Player — para representar os jogadores.

Arbitro — para controlar o jogo.

ArrayList<Card> — para armazenar a pilha de cartas.

Scanner — para leitura do teclado.

Random — para gerar valores aleatórios.

🔁 <strong>Relacionamento entre Objetos</strong>

Player possui uma Card.

Arbitro usa ArrayList<Card> como pilha.

Playground conecta e controla a interação entre Card, Player e Arbitro.

💪 <strong>Métodos Utilizados</strong>

Card(String, int, int, int) — construtor.

Arbitro.darCarta() — entrega uma carta aleatória.

Arbitro.comprarBatalha() — compara atributos de cartas.

Scanner.nextLine(), Scanner.nextInt() — capturam dados do jogador.

🌐 <strong>Construtores Utilizados</strong>

Card possui um construtor para inicializar os atributos.

📖 <strong>Função principal</strong>

 (Playground.java)

O método main() é responsável por:

Inicializar os objetos.

Controlar o loop de execução.

Exibir informações das cartas.

Capturar a escolha do jogador.

Controlar a lógica de parada.
