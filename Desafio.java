import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leitor = new Scanner (System.in);
		
		int casa;
		
		System.out.println("Movimentos de uma torre em um tabuleiro de xadrez");
		
		System.out.println("  1 2 3 4 5 6 7 8 ");
		System.out.println("1 - - - - - - - - ");
		System.out.println("2 - - - - - - - - ");
		System.out.println("3 - - - - - - - - ");
		System.out.println("4 - - - - - - - - ");
		System.out.println("5 - - - - - - - - ");
		System.out.println("6 - - - - - - - - ");
		System.out.println("7 - - - - - - - - ");
		System.out.println("8 - - - - - - - - ");
		
		System.out.println("Digite em qual casa deseja posicionar a torre: (Ex.: 06 > linha 1 - coluna 1)");
		
		casa=leitor.nextInt();
		
		
		switch(casa) {
		
		case 11:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 T x x x x x x x ");
			System.out.println("2 x - - - - - - - ");
			System.out.println("3 x - - - - - - - ");
			System.out.println("4 x - - - - - - - ");
			System.out.println("5 x - - - - - - - ");
			System.out.println("6 x - - - - - - - ");
			System.out.println("7 x - - - - - - - ");
			System.out.println("8 x - - - - - - - ");
			break;
		case 12:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x T x x x x x x ");
			System.out.println("2 - x - - - - - - ");
			System.out.println("3 - x - - - - - - ");
			System.out.println("4 - x - - - - - - ");
			System.out.println("5 - x - - - - - - ");
			System.out.println("6 - x - - - - - - ");
			System.out.println("7 - x - - - - - - ");
			System.out.println("8 - x - - - - - - ");
			break;
		case 13:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x x T x x x x x ");
			System.out.println("2 - - x - - - - - ");
			System.out.println("3 - - x - - - - - ");
			System.out.println("4 - - x - - - - - ");
			System.out.println("5 - - x - - - - - ");
			System.out.println("6 - - x - - - - - ");
			System.out.println("7 - - x - - - - - ");
			System.out.println("8 - - x - - - - - ");
			break;
		case 14:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x x x T x x x x ");
			System.out.println("2 - - - x - - - - ");
			System.out.println("3 - - - x - - - - ");
			System.out.println("4 - - - x - - - - ");
			System.out.println("5 - - - x - - - - ");
			System.out.println("6 - - - x - - - - ");
			System.out.println("7 - - - x - - - - ");
			System.out.println("8 - - - x - - - - ");
			break;
		case 15:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x x x x T x x x ");
			System.out.println("2 - - - - x - - - ");
			System.out.println("3 - - - - x - - - ");
			System.out.println("4 - - - - x - - - ");
			System.out.println("5 - - - - x - - - ");
			System.out.println("6 - - - - x - - - ");
			System.out.println("7 - - - - x - - - ");
			System.out.println("8 - - - - x - - - ");
			break;
		case 16:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x x x x x T x x ");
			System.out.println("2 - - - - - x - - ");
			System.out.println("3 - - - - - x - - ");
			System.out.println("4 - - - - - x - - ");
			System.out.println("5 - - - - - x - - ");
			System.out.println("6 - - - - - x - - ");
			System.out.println("7 - - - - - x - - ");
			System.out.println("8 - - - - - x - - ");
			break;
		case 17:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x x x x x x T x ");
			System.out.println("2 - - - - - - x - ");
			System.out.println("3 - - - - - - x - ");
			System.out.println("4 - - - - - - x - ");
			System.out.println("5 - - - - - - x - ");
			System.out.println("6 - - - - - - x - ");
			System.out.println("7 - - - - - - x - ");
			System.out.println("8 - - - - - - x - ");
			break;
		case 18:
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x x x x x x x T ");
			System.out.println("2 - - - - - - - x ");
			System.out.println("3 - - - - - - - x ");
			System.out.println("4 - - - - - - - x ");
			System.out.println("5 - - - - - - - x ");
			System.out.println("6 - - - - - - - x ");
			System.out.println("7 - - - - - - - x ");
			System.out.println("8 - - - - - - - x ");
			break;
		
		case 21:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x - - - - - - - ");
			System.out.println("2 T x x x x x x x ");
			System.out.println("3 x - - - - - - - ");
			System.out.println("4 x - - - - - - - ");
			System.out.println("5 x - - - - - - - ");
			System.out.println("6 x - - - - - - - ");
			System.out.println("7 x - - - - - - - ");
			System.out.println("8 x - - - - - - - ");
		break;
		case 22:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - x - - - - - - ");
			System.out.println("2 x T x x x x x x ");
			System.out.println("3 - x - - - - - - ");
			System.out.println("4 - x - - - - - - ");
			System.out.println("5 - x - - - - - - ");
			System.out.println("6 - x - - - - - - ");
			System.out.println("7 - x - - - - - - ");
			System.out.println("8 - x - - - - - - ");
		break;
		
		case 23:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - x - - - - - ");
			System.out.println("2 x x T x x x x x ");
			System.out.println("3 - - x - - - - - ");
			System.out.println("4 - - x - - - - - ");
			System.out.println("5 - - x - - - - - ");
			System.out.println("6 - - x - - - - - ");
			System.out.println("7 - - x - - - - - ");
			System.out.println("8 - - x - - - - - ");
		break;
		
		case 24:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - x - - - - ");
			System.out.println("2 x x x T x x x x ");
			System.out.println("3 - - - x - - - - ");
			System.out.println("4 - - - x - - - - ");
			System.out.println("5 - - - x - - - - ");
			System.out.println("6 - - - x - - - - ");
			System.out.println("7 - - - x - - - - ");
			System.out.println("8 - - - x - - - - ");
		break;
		
		case 25:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - x - - - ");
			System.out.println("2 x x x x T x x x ");
			System.out.println("3 - - - - x - - - ");
			System.out.println("4 - - - - x - - - ");
			System.out.println("5 - - - - x - - - ");
			System.out.println("6 - - - - x - - - ");
			System.out.println("7 - - - - x - - - ");
			System.out.println("8 - - - - x - - - ");
		break;
		
		case 26:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - x - - ");
			System.out.println("2 x x x x x T x x ");
			System.out.println("3 - - - - - x - - ");
			System.out.println("4 - - - - - x - - ");
			System.out.println("5 - - - - - x - - ");
			System.out.println("6 - - - - - x - - ");
			System.out.println("7 - - - - - x - - ");
			System.out.println("8 - - - - - x - - ");
		break;
		
		case 27:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - x - ");
			System.out.println("2 x x x x x x T x ");
			System.out.println("3 - - - - - - x - ");
			System.out.println("4 - - - - - - x - ");
			System.out.println("5 - - - - - - x - ");
			System.out.println("6 - - - - - - x - ");
			System.out.println("7 - - - - - - x - ");
			System.out.println("8 - - - - - - x - ");
		break;
		
		case 28:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - - x ");
			System.out.println("2 x x x x x x x T ");
			System.out.println("3 - - - - - - - x ");
			System.out.println("4 - - - - - - - x ");
			System.out.println("5 - - - - - - - x ");
			System.out.println("6 - - - - - - - x ");
			System.out.println("7 - - - - - - - x ");
			System.out.println("8 - - - - - - - x ");
		break;
		
		case 31:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x - - - - - - - ");
			System.out.println("2 x - - - - - - - ");
			System.out.println("3 T x x x x x x x ");
			System.out.println("4 x - - - - - - - ");
			System.out.println("5 x - - - - - - - ");
			System.out.println("6 x - - - - - - - ");
			System.out.println("7 x - - - - - - - ");
			System.out.println("8 x - - - - - - - ");
		break;
		case 32:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - x - - - - - - ");
			System.out.println("2 - x - - - - - - ");
			System.out.println("3 x T x x x x x x ");
			System.out.println("4 - x - - - - - - ");
			System.out.println("5 - x - - - - - - ");
			System.out.println("6 - x - - - - - - ");
			System.out.println("7 - x - - - - - - ");
			System.out.println("8 - x - - - - - - ");
		break;
		case 33:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - x - - - - - ");
			System.out.println("2 - - x - - - - - ");
			System.out.println("3 x x T x x x x x ");
			System.out.println("4 - - x - - - - - ");
			System.out.println("5 - - x - - - - - ");
			System.out.println("6 - - x - - - - - ");
			System.out.println("7 - - x - - - - - ");
			System.out.println("8 - - x - - - - - ");
		break;
		
		case 34:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - x - - - - ");
			System.out.println("2 - - - x - - - - ");
			System.out.println("3 x x x T x x x x ");
			System.out.println("4 - - - x - - - - ");
			System.out.println("5 - - - x - - - - ");
			System.out.println("6 - - - x - - - - ");
			System.out.println("7 - - - x - - - - ");
			System.out.println("8 - - - x - - - - ");
		break;
		
		case 35:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - x - - - ");
			System.out.println("2 - - - - x - - - ");
			System.out.println("3 x x x x T x x x ");
			System.out.println("4 - - - - x - - - ");
			System.out.println("5 - - - - x - - - ");
			System.out.println("6 - - - - x - - - ");
			System.out.println("7 - - - - x - - - ");
			System.out.println("8 - - - - x - - - ");
		break;
		
		case 36:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - x - - ");
			System.out.println("2 - - - - - x - - ");
			System.out.println("3 x x x x x T x x ");
			System.out.println("4 - - - - - x - - ");
			System.out.println("5 - - - - - x - - ");
			System.out.println("6 - - - - - x - - ");
			System.out.println("7 - - - - - x - - ");
			System.out.println("8 - - - - - x - - ");
		break;
		
		case 37:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - x - ");
			System.out.println("2 - - - - - - x - ");
			System.out.println("3 x x x x x x T x ");
			System.out.println("4 - - - - - - x - ");
			System.out.println("5 - - - - - - x - ");
			System.out.println("6 - - - - - - x - ");
			System.out.println("7 - - - - - - x - ");
			System.out.println("8 - - - - - - x - ");
		break;
		
		case 38:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - - x ");
			System.out.println("2 - - - - - - - x ");
			System.out.println("3 x x x x x x x T ");
			System.out.println("4 - - - - - - - x ");
			System.out.println("5 - - - - - - - x ");
			System.out.println("6 - - - - - - - x ");
			System.out.println("7 - - - - - - - x ");
			System.out.println("8 - - - - - - - x ");
		break;
		
		case 41:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x - - - - - - - ");
			System.out.println("2 x - - - - - - - ");
			System.out.println("3 x - - - - - - - ");
			System.out.println("4 T x x x x x x x ");
			System.out.println("5 x - - - - - - - ");
			System.out.println("6 x - - - - - - - ");
			System.out.println("7 x - - - - - - - ");
			System.out.println("8 x - - - - - - - ");
		break;
		case 42:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - x - - - - - - ");
			System.out.println("2 - x - - - - - - ");
			System.out.println("3 - x - - - - - - ");
			System.out.println("4 x T x x x x x x ");
			System.out.println("5 - x - - - - - - ");
			System.out.println("6 - x - - - - - - ");
			System.out.println("7 - x - - - - - - ");
			System.out.println("8 - x - - - - - - ");
		break;
		case 43:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - x - - - - - ");
			System.out.println("2 - - x - - - - - ");
			System.out.println("3 - - x - - - - - ");
			System.out.println("4 x x T x x x x x ");
			System.out.println("5 - - x - - - - - ");
			System.out.println("6 - - x - - - - - ");
			System.out.println("7 - - x - - - - - ");
			System.out.println("8 - - x - - - - - ");
		break;
		
		case 44:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - x - - - - ");
			System.out.println("2 - - - x - - - - ");
			System.out.println("3 - - - x - - - - ");
			System.out.println("4 x x x T x x x x ");
			System.out.println("5 - - - x - - - - ");
			System.out.println("6 - - - x - - - - ");
			System.out.println("7 - - - x - - - - ");
			System.out.println("8 - - - x - - - - ");
		break;
		
		case 45:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - x - - - ");
			System.out.println("2 - - - - x - - - ");
			System.out.println("3 - - - - x - - - ");
			System.out.println("4 x x x x T x x x ");
			System.out.println("5 - - - - x - - - ");
			System.out.println("6 - - - - x - - - ");
			System.out.println("7 - - - - x - - - ");
			System.out.println("8 - - - - x - - - ");
		break;
		
		case 46:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - x - - ");
			System.out.println("2 - - - - - x - - ");
			System.out.println("3 - - - - - x - - ");
			System.out.println("4 x x x x x T x x ");
			System.out.println("5 - - - - - x - - ");
			System.out.println("6 - - - - - x - - ");
			System.out.println("7 - - - - - x - - ");
			System.out.println("8 - - - - - x - - ");
		break;
		case 47:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - x - ");
			System.out.println("2 - - - - - - x - ");
			System.out.println("3 - - - - - - x - ");
			System.out.println("4 x x x x x x T x ");
			System.out.println("5 - - - - - - x - ");
			System.out.println("6 - - - - - - x - ");
			System.out.println("7 - - - - - - x - ");
			System.out.println("8 - - - - - - x - ");
		break;
		
		case 48:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - - x ");
			System.out.println("2 - - - - - - - x ");
			System.out.println("3 - - - - - - - x ");
			System.out.println("4 x x x x x x x T ");
			System.out.println("5 - - - - - - - x ");
			System.out.println("6 - - - - - - - x ");
			System.out.println("7 - - - - - - - x ");
			System.out.println("8 - - - - - - - x ");
		break;
		
		case 51:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x - - - - - - - ");
			System.out.println("2 x - - - - - - - ");
			System.out.println("3 x - - - - - - - ");
			System.out.println("4 x - - - - - - - ");
			System.out.println("5 T x x x x x x x ");
			System.out.println("6 x - - - - - - - ");
			System.out.println("7 x - - - - - - - ");
			System.out.println("8 x - - - - - - - ");
		break;
		
		case 52:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - x - - - - - - ");
			System.out.println("2 - x - - - - - - ");
			System.out.println("3 - x - - - - - - ");
			System.out.println("4 - x - - - - - - ");
			System.out.println("5 x T x x x x x x ");
			System.out.println("6 - x - - - - - - ");
			System.out.println("7 - x - - - - - - ");
			System.out.println("8 - x - - - - - - ");
		break;
		
		case 53:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - x - - - - - ");
			System.out.println("2 - - x - - - - - ");
			System.out.println("3 - - x - - - - - ");
			System.out.println("4 - - x - - - - - ");
			System.out.println("5 x x T x x x x x ");
			System.out.println("6 - - x - - - - - ");
			System.out.println("7 - - x - - - - - ");
			System.out.println("8 - - x - - - - - ");
		break;
		case 54:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - x - - - - ");
			System.out.println("2 - - - x - - - - ");
			System.out.println("3 - - - x - - - - ");
			System.out.println("4 - - - x - - - - ");
			System.out.println("5 x x x T x x x x ");
			System.out.println("6 - - - x - - - - ");
			System.out.println("7 - - - x - - - - ");
			System.out.println("8 - - - x - - - - ");
		break;
		case 55:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - x - - - ");
			System.out.println("2 - - - - x - - - ");
			System.out.println("3 - - - - x - - - ");
			System.out.println("4 - - - - x - - - ");
			System.out.println("5 x x x x T x x x ");
			System.out.println("6 - - - - x - - - ");
			System.out.println("7 - - - - x - - - ");
			System.out.println("8 - - - - x - - - ");
		break;
		case 56:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - x - - ");
			System.out.println("2 - - - - - x - - ");
			System.out.println("3 - - - - - x - - ");
			System.out.println("4 - - - - - x - - ");
			System.out.println("5 x x x x x T x x ");
			System.out.println("6 - - - - - x - - ");
			System.out.println("7 - - - - - x - - ");
			System.out.println("8 - - - - - x - - ");
		break;
		case 57:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - x - ");
			System.out.println("2 - - - - - - x - ");
			System.out.println("3 - - - - - - x - ");
			System.out.println("4 - - - - - - x - ");
			System.out.println("5 x x x x x x T x ");
			System.out.println("6 - - - - - - x - ");
			System.out.println("7 - - - - - - x - ");
			System.out.println("8 - - - - - - x - ");
		break;
		case 58:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - - x ");
			System.out.println("2 - - - - - - - x ");
			System.out.println("3 - - - - - - - x ");
			System.out.println("4 - - - - - - - x ");
			System.out.println("5 x x x x x x x T ");
			System.out.println("6 - - - - - - - x ");
			System.out.println("7 - - - - - - - x ");
			System.out.println("8 - - - - - - - x ");
		break;
		case 61:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x - - - - - - - ");
			System.out.println("2 x - - - - - - - ");
			System.out.println("3 x - - - - - - - ");
			System.out.println("4 x - - - - - - - ");
			System.out.println("5 x - - - - - - - ");
			System.out.println("6 T x x x x x x x ");
			System.out.println("7 x - - - - - - - ");
			System.out.println("8 x - - - - - - - ");
		break;
		
		case 62:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - x - - - - - - ");
			System.out.println("2 - x - - - - - - ");
			System.out.println("3 - x - - - - - - ");
			System.out.println("4 - x - - - - - - ");
			System.out.println("5 - x - - - - - - ");
			System.out.println("6 x T x x x x x x ");
			System.out.println("7 - x - - - - - - ");
			System.out.println("8 - x - - - - - - ");
		break;
		case 63:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - x - - - - - ");
			System.out.println("2 - - x - - - - - ");
			System.out.println("3 - - x - - - - - ");
			System.out.println("4 - - x - - - - - ");
			System.out.println("5 - - x - - - - - ");
			System.out.println("6 x x T x x x x x ");
			System.out.println("7 - - x - - - - - ");
			System.out.println("8 - - x - - - - - ");
		break;
		case 64:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - x - - - - ");
			System.out.println("2 - - - x - - - - ");
			System.out.println("3 - - - x - - - - ");
			System.out.println("4 - - - x - - - - ");
			System.out.println("5 - - - x - - - - ");
			System.out.println("6 x x x T x x x x ");
			System.out.println("7 - - - x - - -  ");
			System.out.println("8 - - - x - - - - ");
		break;
		case 65:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - x - - - ");
			System.out.println("2 - - - - x - - - ");
			System.out.println("3 - - - - x - - - ");
			System.out.println("4 - - - - x - - - ");
			System.out.println("5 - - - - x - - - ");
			System.out.println("6 x x x x T x x x ");
			System.out.println("7 - - - - x - - - ");
			System.out.println("8 - - - - x - - - ");
		break;
		case 66:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - x - - ");
			System.out.println("2 - - - - - x - - ");
			System.out.println("3 - - - - - x - - ");
			System.out.println("4 - - - - - x - - ");
			System.out.println("5 - - - - - x - - ");
			System.out.println("6 x x x x x T x x ");
			System.out.println("7 - - - - - x - - ");
			System.out.println("8 - - - - - x - - ");
		break;
		
		case 67:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - x - ");
			System.out.println("2 - - - - - - x - ");
			System.out.println("3 - - - - - - x - ");
			System.out.println("4 - - - - - - x - ");
			System.out.println("5 - - - - - - x - ");
			System.out.println("6 x x x x x x T x ");
			System.out.println("7 - - - - - - x - ");
			System.out.println("8 - - - - - - x - ");
		break;
		case 68:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - - x ");
			System.out.println("2 - - - - - - - x ");
			System.out.println("3 - - - - - - - x ");
			System.out.println("4 - - - - - - - x ");
			System.out.println("5 - - - - - - - x ");
			System.out.println("6 x x x x x x x T ");
			System.out.println("7 - - - - - - - x ");
			System.out.println("8 - - - - - - - x ");
		break;
		
		case 71:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x - - - - - - - ");
			System.out.println("2 x - - - - - - - ");
			System.out.println("3 x - - - - - - - ");
			System.out.println("4 x - - - - - - - ");
			System.out.println("5 x - - - - - - - ");
			System.out.println("6 x - - - - - - - ");
			System.out.println("7 T x x x x x x x ");
			System.out.println("8 x - - - - - - - ");
		break;
		case 72:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - x - - - - - - ");
			System.out.println("2 - x - - - - - - ");
			System.out.println("3 - x - - - - - - ");
			System.out.println("4 - x - - - - - - ");
			System.out.println("5 - x - - - - - - ");
			System.out.println("6 - x - - - - - - ");
			System.out.println("7 x T x x x x x x ");
			System.out.println("8 - x - - - - - - ");
		break;
		case 73:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - x - - - - - ");
			System.out.println("2 - - x - - - - - ");
			System.out.println("3 - - x - - - - - ");
			System.out.println("4 - - x - - - - - ");
			System.out.println("5 - - x - - - - - ");
			System.out.println("6 - - x - - - - - ");
			System.out.println("7 x x T x x x x x ");
			System.out.println("8 - - x - - - - - ");
		break;
		case 74:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - x - - - - ");
			System.out.println("2 - - - x - - - - ");
			System.out.println("3 - - - x - - - - ");
			System.out.println("4 - - - x - - - - ");
			System.out.println("5 - - - x - - - - ");
			System.out.println("6 - - - x - - - - ");
			System.out.println("7 x x x T x x x x ");
			System.out.println("8 - - - x - - - - ");
		break;
		case 75:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - x - - - ");
			System.out.println("2 - - - - x - - - ");
			System.out.println("3 - - - - x - - - ");
			System.out.println("4 - - - - x - - - ");
			System.out.println("5 - - - - x - - - ");
			System.out.println("6 - - - - x - - - ");
			System.out.println("7 x x x x T x x x ");
			System.out.println("8 - - - - x - - - ");
		break;
		case 76:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - x - - ");
			System.out.println("2 - - - - - x - - ");
			System.out.println("3 - - - - - x - - ");
			System.out.println("4 - - - - - x - - ");
			System.out.println("5 - - - - - x - - ");
			System.out.println("6 - - - - - x - - ");
			System.out.println("7 x x x x x T x x ");
			System.out.println("8 - - - - - x - - ");
		break;
		case 77:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - x - ");
			System.out.println("2 - - - - - - x - ");
			System.out.println("3 - - - - - - x - ");
			System.out.println("4 - - - - - - x - ");
			System.out.println("5 - - - - - - x - ");
			System.out.println("6 - - - - - - x - ");
			System.out.println("7 x x x x x x T x ");
			System.out.println("8 - - - - - - x - ");
		break;
		case 78:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - - x ");
			System.out.println("2 - - - - - - - x ");
			System.out.println("3 - - - - - - - x ");
			System.out.println("4 - - - - - - - x ");
			System.out.println("5 - - - - - - - x ");
			System.out.println("6 - - - - - - - x ");
			System.out.println("7 x x x x x x x T ");
			System.out.println("8 - - - - - - - x ");
		break;
		case 81:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 x - - - - - - - ");
			System.out.println("2 x - - - - - - - ");
			System.out.println("3 x - - - - - - - ");
			System.out.println("4 x - - - - - - - ");
			System.out.println("5 x - - - - - - - ");
			System.out.println("6 x - - - - - - - ");
			System.out.println("7 x - - - - - - - ");
			System.out.println("8 T x x x x x x x ");
		break;
		case 82:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - x - - - - - - ");
			System.out.println("2 - x - - - - - - ");
			System.out.println("3 - x - - - - - - ");
			System.out.println("4 - x - - - - - - ");
			System.out.println("5 - x - - - - - - ");
			System.out.println("6 - x - - - - - - ");
			System.out.println("7 - x - - - - - - ");
			System.out.println("8 x T x x x x x x ");
		break;
		case 83:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - x - - - - - ");
			System.out.println("2 - - x - - - - - ");
			System.out.println("3 - - x - - - - - ");
			System.out.println("4 - - x - - - - - ");
			System.out.println("5 - - x - - - - - ");
			System.out.println("6 - - x - - - - - ");
			System.out.println("7 - - x - - - - - ");
			System.out.println("8 x x T x x x x x ");
		break;
		case 84:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - x - - - - ");
			System.out.println("2 - - - x - - - - ");
			System.out.println("3 - - - x - - - - ");
			System.out.println("4 - - - x - - - - ");
			System.out.println("5 - - - x - - - - ");
			System.out.println("6 - - - x - - - - ");
			System.out.println("7 - - - x - - - - ");
			System.out.println("8 x x x T x x x x ");
		break;
		case 85:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - x - - - ");
			System.out.println("2 - - - - x - - - ");
			System.out.println("3 - - - - x - - - ");
			System.out.println("4 - - - - x - - - ");
			System.out.println("5 - - - - x - - - ");
			System.out.println("6 - - - - x - - - ");
			System.out.println("7 - - - - x - - - ");
			System.out.println("8 x x x x T x x x ");
		break;
		case 86:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - x - - ");
			System.out.println("2 - - - - - x - - ");
			System.out.println("3 - - - - - x - - ");
			System.out.println("4 - - - - - x - - ");
			System.out.println("5 - - - - - x - - ");
			System.out.println("6 - - - - - x - - ");
			System.out.println("7 - - - - - x - - ");
			System.out.println("8 x x x x x T x x ");
		break;
		case 87:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - x - ");
			System.out.println("2 - - - - - - x - ");
			System.out.println("3 - - - - - - x - ");
			System.out.println("4 - - - - - - x - ");
			System.out.println("5 - - - - - - x - ");
			System.out.println("6 - - - - - - x - ");
			System.out.println("7 - - - - - - x - ");
			System.out.println("8 x x x x x x T x ");
		break;
		case 88:	
			System.out.println("  1 2 3 4 5 6 7 8 ");
			System.out.println("1 - - - - - - - x ");
			System.out.println("2 - - - - - - - x ");
			System.out.println("3 - - - - - - - x ");
			System.out.println("4 - - - - - - - x ");
			System.out.println("5 - - - - - - - x ");
			System.out.println("6 - - - - - - - x ");
			System.out.println("7 - - - - - - - x ");
			System.out.println("8 x x x x x x x T ");
		break;
		
		default: 
			System.out.println("Essa posiçăo năo é disponível.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}

}
