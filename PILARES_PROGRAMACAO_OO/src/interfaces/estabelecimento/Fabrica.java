package interfaces.estabelecimento;


import interfaces.equipamentos.impressora.*;
import interfaces.equipamentos.multifuncional.*;
import interfaces.equipamentos.digitalizadora.*;
import interfaces.equipamentos.copiadora.*;

public class Fabrica {

	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Deskjet deskjet = new Deskjet();
		
		Impressora novaImpressora = deskjet;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		novaImpressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
