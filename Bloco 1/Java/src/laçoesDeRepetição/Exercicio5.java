package laçoesDeRepetição;
/*
 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */
 import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
	  Scanner scan= new Scanner(System.in);
	  
	  int n, soma = 0;
	  
	  do {
	  System.out.println("Por favor, digite um número:(O programa será encerrado"
	  		+ " e todos os valores digitados somados, ao digitar 0.)");
	   n= scan.nextInt();
	   soma = soma + n;
	  
	  }while (n >0);
	  System.out.println("A soma de todos os números digitados é:"+soma);
}
	
	
	
}
