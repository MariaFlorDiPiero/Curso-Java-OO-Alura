
public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {

		return 0;
	}

	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		
		this.autenticador = new AutenticacaoUtil();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		
		return this.autenticador.autentica(senha);

	}
}
