package la�osDeDecisao;

import java.util.Scanner;

public class Exercicio3 {
	
	/*
	 3-	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade=0;
		
		System.out.println("Digite sua idade para saber sua categoria"
				+ "(insira apenas n�meros inteiros):");
		idade=scan.nextInt();
		
	    if (idade<=9)
	    	System.out.println("Esta idade n�o pertence a nenhuma categoria!");
		
	    else if (idade>= 10 && idade<=14);
			 System.out.println("de acordo com sua idade, "+idade+ "sua categoria � infantil");	 
			 	 	 
			 if (idade>= 15 && idade<= 17);{
			 System.out.println("de acordo com sua idade, "+idade+" sua categoria � juvenill");
			 
			 } if (idade>= 18 && idade<= 25);
			 System.out.println("de acordo com sua idade ,"+idade+" sua categoria � adulto");
			 
		
		
	} 	

}
