programa
{

/*
 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */
	
	funcao inicio()
	{
	   real vC,vN,vE
	   escreva("\ninsira o tatol de horas trabalhadas:")
	   leia(vN)

	   se(vN>50)
        {escreva("\nVocê excedeu as horas de trabalho")
        vE=(vN-50)*20
        vC=500 + vE
        escreva("\nO salário total é de:" , vC)

        escreva("\nO valor excedente a ser pago é de:" , vE)
         }
        senao se(vN<50){
        escreva("\nAs horas de trabalho não foram excedidas")	
       }
		
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 822; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */