package EDNA3;

import java.util.Scanner;

public class Tititia3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner he = new Scanner(System.in);
		int nintendo = he.nextInt();
		switch (nintendo) {
		case 0:
			System.out.println("Hoje � domingo");
		break;
		case 1:
			System.out.println("Hoje � segunda");
		break;
		case 2:
			System.out.println("Hoje � ter�a");
		break;
		case 3:
			System.out.println("Hoje � quarta");
		break;
		case 4:
			System.out.println("Hoje � quinta");
		break;
		case 5:
			System.out.println("Hoje � sexta");
		break;
		case 6:
			System.out.println("Hoje � Sabado cavalo");
		break;
		default  :
			System.out.println("N�o � nenhum dia seu debil");
		break;
		}
		
	}

}
