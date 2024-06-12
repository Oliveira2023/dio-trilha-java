package messeger;

import fb_messeger.FBMesseger;
import heranca.telegram.*;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		FBMesseger fb = new FBMesseger();
		Telegram tlg = new Telegram();
		MSNMesseger msn = new MSNMesseger();
		
	
		msn.enviarMensagem();
		msn.receberMensagem();
		

		fb.enviarMensagem();
		fb.receberMensagem();


		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
