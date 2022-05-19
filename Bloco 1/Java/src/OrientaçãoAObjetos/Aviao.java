package OrientaçãoAObjetos;

/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
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
				System.out.println("Metade dos assentos já foram oculpados!");
			
			} else if (this.NAssentos <100){
				System.out.println("A quantidade de assentos disponíves neste avião,"
						+ " está acabando! ");	
		}
		
		public void estadoAtual() {
			System.out.println("Qual é o número total de assentos neste avião? " + NAssentos);
			System.out.println("Qual o total de passageiros deste voo? " + totalPassageiros);
			System.out.println("Assentos: " + .NAssentos + " % cheio");
		}
	}

