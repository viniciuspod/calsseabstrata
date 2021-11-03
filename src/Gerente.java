
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticaUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaUtil();
	}
	
	public double getBonificacao() {
		System.out.println("teste gerente");
		return super.getSalario();
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
