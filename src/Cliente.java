
public class Cliente implements Autenticavel {

	private AutenticaUtil autenticador;
	
	public Cliente () {
		this.autenticador = new AutenticaUtil();
	}
	
	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}



}
