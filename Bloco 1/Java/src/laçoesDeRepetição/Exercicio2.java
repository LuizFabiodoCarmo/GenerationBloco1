package la�oesDeRepeti��o;
/*
2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
   import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		 
		int n, par= 0, impar = 0;
		
		for (int x = 0; x<10; x++) {
		System.out.println("Por favor, digite um n�mero:");
		    n= scan.nextInt();
		    
		    if(n % 2 ==0) {
		    	par++;
		    }else	{
		    	impar++;
		    }
		}
		System.out.println("N�meros pares:"+par);
		System.out.println("N�meros impares:"+ impar);
	}

}
