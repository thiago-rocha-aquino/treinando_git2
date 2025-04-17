package superTrunfo;

import java.util.ArrayList;
import java.util.Random;

public class Arbitro {

	ArrayList<Card> pilha;
	
	public Card darCarta(){
		Random gerar = new Random();
		Card carta;
		carta = pilha.get(gerar.nextInt(pilha.size()));
		return carta;
	}
	
	public void comprarBatalha(int tipo, Player player, Player cpu) {
		switch(tipo) {
		case 1: // forca
			if (player.carta.forca > cpu.carta.forca) {
				player.pontuacao += 1;
			}
			else {
				cpu.pontuacao += 1;
			}
			break;
		case 2:// defesa
			if (player.carta.defesa > cpu.carta.defesa) {
				player.pontuacao += 1;
			}
			else {
				cpu.pontuacao += 1;
			}
			break;
		case 3:// perspicacia
			if (player.carta.perspicacia > cpu.carta.perspicacia) {
				player.pontuacao += 1;
			}
			else {
				cpu.pontuacao += 1;
			}
			break;
		default: System.out.println("Tipo invalido");
				break;
		}
	}
}
