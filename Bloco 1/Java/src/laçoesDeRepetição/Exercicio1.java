package la�oesDeRepeti��o;
/*
1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 
obtemos o resto =5. (FOR)
 */

public class Exercicio1 {
	public static void main(String[] args) {
		
	   System.out.println(" Os n�meros divisiveis por 11 e que tem o resto 5 s�o:");
	   

	for(int n= 1000; n <= 2000; n++) {
		if(n % 11== 5) {
			System.out.println(n);
		}
	  }
	}
}
