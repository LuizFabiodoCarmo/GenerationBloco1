programa
{

/*
 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
	
	funcao inicio()
	{     inteiro tempoTS, hrs, mins, seg
		
		escreva(" \ndigite o tempo de duranção em segundos de seu envento:\n")
		leia(tempoTS)

		hrs= tempoTS / 3600
		mins= tempoTS / 60 
		seg= tempoTS

		escreva("\nO tempo total de horas é de:"+hrs, "\nminutos:"+mins,"\ne de:"+seg,"\nsegundos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */