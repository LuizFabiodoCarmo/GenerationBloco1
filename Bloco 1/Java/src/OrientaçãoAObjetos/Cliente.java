package Orienta��oAObjetos;



public class Cliente {

			// ATRIBUTOS
		
		String nome;
		String produto;
		boolean compra;
		
		
		   // M�TODO
		
		public void comprar() {
			if (compra == true) {
				System.out.println("Voc� vai amar esse produto"+nome+"ele chegar� logo!");
				System.out.println("Obrigada pela compra! Volte sempre");
			} else {
				System.out.println("Aproveite nossos descontos "+nome+", "
						+ "essa oferta est� imperd�vel!!");
			}
		}
		
		public void compra() {
			this.compra = true;
		}
		
		public void naoCompra() {
			this.compra = false;
		}
		
		public void estadoAtual() {
			System.out.println("Qual seu nome? " + this.nome);
			System.out.println("Ol� " + this.nome + "! O que voc� deseja comprar? " + this.produto);
			System.out.println("Voc� deseja finalizar a compra? " + this.compra);
		}
	}
	
		
		