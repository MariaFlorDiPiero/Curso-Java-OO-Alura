
public class Gerente extends Funcionario implements Autenticavel{
	 
	private AutenticacaoUtil autenticador; 
	
	Gerente () {
		
		this.autenticador = new AutenticacaoUtil();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	
	public boolean autentica(int senha) {
		
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		//return super.getBonificacao() + super.getSalario();
		System.out.println("Chamando o m�todo bonifica��o do gerente");
		return getSalario();
	}
	

}
