package la�oesDeRepeti��o;
/*
 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
 import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
	  Scanner scan= new Scanner(System.in);
	  
	  int n, soma = 0;
	  
	  do {
	  System.out.println("Por favor, digite um n�mero:(O programa ser� encerrado"
	  		+ " e todos os valores digitados somados, ao digitar 0.)");
	   n= scan.nextInt();
	   soma = soma + n;
	  
	  }while (n >0);
	  System.out.println("A soma de todos os n�meros digitados �:"+soma);
}
	
	
	
}
