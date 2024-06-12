package polimorfismo;

import heranca.ServicoMensagemInstantanea;
import messeger.MSNMesseger;
import fb_messeger.FBMesseger;
import heranca.telegram.*;

public class computadorLuiz {

	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "fbm";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMesseger();
		if(appEscolhido.equals("fbm"))
			smi = new FBMesseger();
		if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
