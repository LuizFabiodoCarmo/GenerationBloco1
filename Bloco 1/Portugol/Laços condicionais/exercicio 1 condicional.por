programa
{
	
	
/*
 * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
 */
         funcao inicio()
	{
	
		inteiro peso, excesso, multa
		escreva("Digite o peso de seu saco de tomates:")
		leia(peso)
		
		se(peso>50)
		{
           escreva("\nPeso excedente ao limite regulamentado!")

           excesso=(peso -50)
           escreva("\nExcesso de peso em" + excesso + "kg:")
           
           multa=(excesso*4)
           escreva("\nSua multa por exceder o limite é de:" + multa + )     }       
           
           senao se(peso<50)  
           escreva("\nNão há excesso de peso em seu saco de tomates.")   
           
          
           escreva(peso + "\npeso total" + multa + "\npeso excedente ")
                                                                          

	}
}


             


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */