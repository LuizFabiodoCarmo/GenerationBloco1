package laçosDeDecisao;

import java.util.Scanner;

public class teste {
/*
4- Faça um programa em que permita a entrada de um número qualquer e exiba este número é par ou ímpar.
  Se for par exiba também a raiz quadrada do mesmo;
   se for ímpar exiba o número elevado ao quadrado.
*/
	
	public  static  void  main ( String[] args) {
		Scanner  scan = new  Scanner ( System.in);
		 double valor = 0 ;
		
		try{
			System.out.println( "Insira um numero: " );
			valor = scan.nextDouble ();
		} catch ( Exception  e ) {
			System.out.println( "Insira somente números!" );
		}
		
		if ( valor % 2 == 0 ) {
			System.out.println( "Número é par!" );
			System.out.println( "Sua raiz é: " + ( valor = Math . sqrt ( valor )));
		} else {
			System.out.println("Número é único");
			System.out.println("O número elevado ao quadrado é: " + valor*valor);
		}
		
		scan.close();
	}
}
