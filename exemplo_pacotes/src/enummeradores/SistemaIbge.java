package enummeradores;

public class SistemaIbge {

	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
//			System.out.println(e.getNome() + "-" + e.getSigla());
		}
		EstadoBrasileiro eb =  EstadoBrasileiro.SAO_PAULO;
		System.out.println("Estado: " + eb.getNome());
		System.out.println("Sigla: " + eb.getSigla());
		System.out.println("Maiúscula: " + eb.getNomeMaiusculo());
		System.out.println("cod ibge: " + eb.getIbge());
	}
}
