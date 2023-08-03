package javatech;

import java.util.Scanner;

public class LacoSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resposta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("n\t\tMenu de elogios");
		System.out.println("\n1 - pessoal incrível");
		System.out.println("\n2 - pessoal empolgado");
		System.out.println("\n3 - pessoal gentil");
		System.out.println("\n4 - pessoal empático");
		resposta=ler.nextInt();
		
		switch(resposta) {
		case 1:
			System.out.println("\npessoal incrível");
			break;
		case 2:
			System.out.println("\npessoal empolgado");
			break;
		case 3:
			System.out.println("\npessoal gentil");
			break;
		case 4:
			System.out.println("\npessoal empático");
			break;
		default: 
			System.out.println("\nopção inválida!");
		
		}
		
		
	}

}
