
public class iPhone {
     public static void main(String[] args) {
		ReprodutorMusical rn = new ReprodutorMusical();
		//rn.selecionarMusica();
		rn.tocar();
		rn.pausar();
		
		NavegadorInternet ni = new NavegadorInternet();
		//ni.exibirPagina();
		ni.adicionarNovaAba();
		ni.atualizarPagina();
		
		AparelhoTelefonico at = new AparelhoTelefonico();
		//at.ligar();
		at.atender();
		at.iniciarCorreioVoz();
	}
}
