package la�osDeDecisao;

import java.util.Scanner;

public class teste {
/*
4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba este n�mero � par ou �mpar.
  Se for par exiba tamb�m a raiz quadrada do mesmo;
   se for �mpar exiba o n�mero elevado ao quadrado.
*/
	
	public  static  void  main ( String[] args) {
		Scanner  scan = new  Scanner ( System.in);
		 double valor = 0 ;
		
		try{
			System.out.println( "Insira um numero: " );
			valor = scan.nextDouble ();
		} catch ( Exception  e ) {
			System.out.println( "Insira somente n�meros!" );
		}
		
		if ( valor % 2 == 0 ) {
			System.out.println( "N�mero � par!" );
			System.out.println( "Sua raiz �: " + ( valor = Math . sqrt ( valor )));
		} else {
			System.out.println("N�mero � �nico");
			System.out.println("O n�mero elevado ao quadrado �: " + valor*valor);
		}
		
		scan.close();
	}
}
