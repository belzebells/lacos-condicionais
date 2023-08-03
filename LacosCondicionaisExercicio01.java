package javatech;

import java.util.Scanner;
public class LacosCondicionaisExercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, soma;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		
		soma = a + b;
		if(soma>c) {
			System.out.println("\no valor da soma de A + B é = " + soma + " e é maior que o valor de C");
		}
		
		else if(soma<c) {
			System.out.println("\nO valor da soma de A + B é = " + soma + " e é menor que o valor de C");
		}
		
		else{
			System.out.println("\nO valor da soma de A + B é = " + soma + " e é igual ao valor de C");
		}
		
		
		}
		
			
		}
		
		
		
		
	
	
		
		

