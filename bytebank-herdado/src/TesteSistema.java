
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		SistemaInterno sistemainterno = new SistemaInterno();
		sistemainterno.autentica(gerente);;

	}

}
