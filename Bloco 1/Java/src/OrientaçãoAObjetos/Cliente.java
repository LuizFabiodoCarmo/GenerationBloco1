package OrientaçãoAObjetos;



public class Cliente {

			// ATRIBUTOS
		
		String nome;
		String produto;
		boolean compra;
		
		
		   // MÉTODO
		
		public void comprar() {
			if (compra == true) {
				System.out.println("Você vai amar esse produto"+nome+"ele chegará logo!");
				System.out.println("Obrigada pela compra! Volte sempre");
			} else {
				System.out.println("Aproveite nossos descontos "+nome+", "
						+ "essa oferta está imperdível!!");
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
			System.out.println("Olá " + this.nome + "! O que você deseja comprar? " + this.produto);
			System.out.println("Você deseja finalizar a compra? " + this.compra);
		}
	}
	
		
		