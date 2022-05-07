programa
{

/*
 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
 */
	
	funcao inicio()
	{  inteiro n1, n2
	   
		escreva("\nDigite os dois números para efetuar a soma:")
		leia(n1,n2)

         enquanto(n2!=0)
		{  
		 escreva("\nO resultado é;",n1+n2)
	      escreva("\nDigite dois números para efetuar a soma")
		 leia(n1,n2)
		}
		  escreva("\nO número inserido é um número negativo,fim do programa!!")
           
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 617; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */