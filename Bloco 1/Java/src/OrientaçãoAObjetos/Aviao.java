package Orienta��oAObjetos;

/*
2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
public class Aviao {

	
		int totalPassageiros;
		int Npassageiros;
		String NAssentos;
		

		public ModeloAviao() {
			this.NAssentos = 350;	
		}

		public void voar() {
			if (this.NAssentos >200) {
				System.out.println("Metade dos assentos j� foram oculpados!");
			
			} else if (this.NAssentos <100){
				System.out.println("A quantidade de assentos dispon�ves neste avi�o,"
						+ " est� acabando! ");	
		}
		
		public void estadoAtual() {
			System.out.println("Qual � o n�mero total de assentos neste avi�o? " + NAssentos);
			System.out.println("Qual o total de passageiros deste voo? " + totalPassageiros);
			System.out.println("Assentos: " + .NAssentos + " % cheio");
		}
	}

