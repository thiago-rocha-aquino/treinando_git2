package superTrunfo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Playground {
	
	public static void main(String[] args) {
		Random gerar = new Random();
		Scanner leitor = new Scanner(System.in);
		int opc = 0;
		
		Card card1 = new Card("Pikachu", gerar.nextInt(11), gerar.nextInt(11), gerar.nextInt(11));
		Card card2 = new Card("Eve", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card3 = new Card("Miau", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card4 = new Card("Charizard", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card5 = new Card("Blastoise", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card6 = new Card("Snorlax", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card7 = new Card("Carbink", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card8 = new Card("Lord Savior Biduf", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card9 = new Card("Bulbassauro", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		Card card10 = new Card("Lopunny", gerar.nextInt(11) , gerar.nextInt(11),gerar.nextInt(11));
		
		ArrayList<Card> cartas = new ArrayList<Card>();
		cartas.add(card1);
		cartas.add(card2);
		cartas.add(card3);
		cartas.add(card4);
		cartas.add(card5);
		cartas.add(card6);
		cartas.add(card7);
		cartas.add(card8);
		cartas.add(card9);
		cartas.add(card10);
		
		Arbitro juiz = new Arbitro();
		juiz.pilha = cartas;
		
		Player jogador = new Player();
		jogador.nome = "rodolfo";
		jogador.pontuacao = 0;
		jogador.carta = juiz.darCarta();
		/*
		System.out.println("Sua carta:" +" \n" +
		"Nome: " + jogador.carta.nome  + " \n" +
		"Força: " + jogador.carta.forca  + " \n" +
		"Defesa: " + jogador.carta.defesa + " \n" +
		"Perspicacia: " + jogador.carta.perspicacia);
		*/
		Player adversario = new Player();
		adversario.nome = "InsetoKaiba";
		adversario.pontuacao = 0;
		adversario.carta = juiz.darCarta();
		/*
		juiz.comprarBatalha(1, jogador, adversario);
		System.out.println("Pontuação");
		System.out.println("Jogador: "+ jogador.pontuacao);
		System.out.println("Adversario: "+ adversario.pontuacao);
		
		System.out.println("Carta do adversário:" +" \n" +
				"Nome: " + adversario.carta.nome  + " \n" +
				"Força: " + adversario.carta.forca  + " \n" +
				"Defesa: " + adversario.carta.defesa + " \n" +
				"Perspicacia: " + adversario.carta.perspicacia);
		*/
		// Jogo interativo aqui
		System.out.println("Digite seu nome: ");
		jogador.nome = leitor.nextLine();
		
		System.out.println(jogador.nome);
		while (true) {
			System.out.println("O Juiz lhe deu uma carta");
			jogador.carta = juiz.darCarta();
			System.out.println("Sua carta:" +" \n" +
					"Nome: " + jogador.carta.nome  + " \n" +
					"Força: " + jogador.carta.forca  + " \n" +
					"Defesa: " + jogador.carta.defesa + " \n" +
					"Perspicacia: " + jogador.carta.perspicacia);
			System.out.println("O Juiz deu uma carta ao seu oponente");
			System.out.println("Qual atributo voce irá utilizar? \n1->forca\n2->defesa\n3->perspicacia");
			opc = leitor.nextInt();
			juiz.comprarBatalha(opc, jogador, adversario);
			System.out.println("Carta do adversário:" +" \n" +
					"Nome: " + adversario.carta.nome  + " \n" +
					"Força: " + adversario.carta.forca  + " \n" +
					"Defesa: " + adversario.carta.defesa + " \n" +
					"Perspicacia: " + adversario.carta.perspicacia);
			System.out.println();
			System.out.println("======== Pontuação ==========");
			System.out.println("Jogador: "+ jogador.pontuacao);
			System.out.println("Adversario: "+ adversario.pontuacao);
			System.out.println("=============================");
			System.out.println();
			System.out.println("Quer parar ? digite 4 ");
			opc = leitor.nextInt();
			if (opc == 4) {
				break;
			}
		}
		leitor.close();
	}
}
