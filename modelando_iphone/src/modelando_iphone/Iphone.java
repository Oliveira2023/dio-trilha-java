package modelando_iphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	public static void main(String[] args) {
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina da internet");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba no navegador");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina da web");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica...");
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada -> " + musica);
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o telefone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando uma conversa");
	}
}
