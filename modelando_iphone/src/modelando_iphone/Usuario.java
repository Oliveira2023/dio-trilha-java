package modelando_iphone;


public class Usuario {

	public static void main(String[] args) {
		
		Iphone newphone = new Iphone(); 
		
		System.out.println("------------Telefone------------");
		newphone.ligar("11987654321");
		newphone.atender();
		newphone.iniciarCorreioVoz();
		System.out.println("------------Musica--------------");
		newphone.selecionarMusica("U2");
		newphone.tocar();
		newphone.pausar();
		System.out.println("-------------Web----------------");
		newphone.adicionarNovaAba();
		newphone.exibirPagina("www.dio.me");
		newphone.atualizarPagina();
		
	}
}
