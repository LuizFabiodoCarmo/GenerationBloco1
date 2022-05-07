programa
{

/*
 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
 */
	
	funcao inicio()
	{    inteiro A, B, C, R, S, D
		
		escreva("\nDigite os três valores:")
		escreva("\nIsira o valor A:")
		leia(A)
		escreva("\nInsisra o valor B")
		leia(B)
		escreva("\nInsira o valor C:")
		leia(C)

          R= ((A+B)*(A+B))
          S= ((B+C)*(B+C))
          D= (R+S)/2

          escreva("\nO valor de D é:"+ D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */