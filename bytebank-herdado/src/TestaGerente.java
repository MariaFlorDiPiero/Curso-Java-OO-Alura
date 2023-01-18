
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente ();
		
		gerente.setNome("Maria");
		gerente.setCpf(12121212);
		gerente.setSalario(4500.00);
		
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(3333);
		boolean autenticou = gerente.autentica(3333);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());
	

	}

}
