package laçoesDeRepetição;
/*
2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
   import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		 
		int n, par= 0, impar = 0;
		
		for (int x = 0; x<10; x++) {
		System.out.println("Por favor, digite um número:");
		    n= scan.nextInt();
		    
		    if(n % 2 ==0) {
		    	par++;
		    }else	{
		    	impar++;
		    }
		}
		System.out.println("Números pares:"+par);
		System.out.println("Números impares:"+ impar);
	}

}
