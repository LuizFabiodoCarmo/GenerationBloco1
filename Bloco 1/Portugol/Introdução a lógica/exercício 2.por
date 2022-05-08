programa
{

/*	
2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
	
	funcao inicio()
	{

		inteiro ano = 365
		inteiro meses = 12
		inteiro anos, dias, nDeDias
		
		escreva("\nSua idade em dias(365 dias, vezes sua idade): ")
		leia(nDeDias)

		anos = nDeDias / 365
		meses = ( nDeDias / 30)
		dias = (nDeDias * 12 + 120 )
		


		escreva(nDeDias + " dias equivale a " + anos + " anos, " + meses + " meses e " + dias + " dias")

          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */