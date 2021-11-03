
public class Adminstrador extends Funcionario implements Autenticavel {


	private AutenticaUtil autenticador;
	
	public Adminstrador() {
		this.autenticador = new AutenticaUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
