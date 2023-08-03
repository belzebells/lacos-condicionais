package javatech;

import java.util.Scanner;

public class LacosCondicionaisExercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra1, palavra2, palavra3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira palavra");
		palavra1 = ler.nextLine();
		System.out.println("\nEntre com a segunda palavra");
		palavra2 = ler.nextLine();
		System.out.println("\nEntre com a terceira palavra");
		palavra3 = ler.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma águia");
				} else {
					System.out.println("\nÉ uma pomba!");
				}
			} else {
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nÉ um ser humano!");
				} else {
					System.out.println("\nÉ uma vaca");
		
											
						
					}
					
				}
			
			
			}
		}
	}

}
