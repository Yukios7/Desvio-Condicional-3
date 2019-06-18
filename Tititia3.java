package EDNA3;

import java.util.Scanner;

public class Tititia3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner he = new Scanner(System.in);
		int nintendo = he.nextInt();
		switch (nintendo) {
		case 0:
			System.out.println("Hoje é domingo");
		break;
		case 1:
			System.out.println("Hoje é segunda");
		break;
		case 2:
			System.out.println("Hoje é terça");
		break;
		case 3:
			System.out.println("Hoje é quarta");
		break;
		case 4:
			System.out.println("Hoje é quinta");
		break;
		case 5:
			System.out.println("Hoje é sexta");
		break;
		case 6:
			System.out.println("Hoje é Sabado cavalo");
		break;
		default  :
			System.out.println("Não é nenhum dia seu debil");
		break;
		}
		
	}

}
