package Iphone;

	public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

		private String paginaWeb;
		private String musica;
		
		@Override
		public void tocar(String musica) {
			System.out.println("Tocando a música: " + this.musica);
			this.musica = musica;
		}

		@Override
		public void pausar(String musica) {
			System.out.println("Pausando a música: " + this.musica);
			this.musica = musica;
		}

		@Override
		public void selecionarMusica(String musica) {
			System.out.println("Selecionando a música: " + musica);
			this.musica = musica;
		}

		@Override
		public void adicionarNovaAba() {
			System.out.println("Carregando...Nova aba");
		}

		@Override
		public void exibirPagina(String paginaWeb) {
			System.out.println("Exibindo a página: " + paginaWeb);
			this.paginaWeb = paginaWeb;
		}

		@Override
		public void atualizarPagina() {
			System.out.println("Atualizando a página: " + this.paginaWeb);
		}

		
		@Override
		public void ligar(String telefone) {
			System.out.println("Ligando para o número: " + telefone);
		}

		@Override
		public void atender(String telefone) {
			System.out.println("Atendendo chamada de:" + telefone);
		}

		@Override
		public void iniciarCorreioVoz() {
			System.out.println("Inicializando o seu correio de voz...");
		}

	}