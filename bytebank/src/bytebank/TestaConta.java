package bytebank;

public class TestaConta {
	
	public static void main(String[] args) {
		
		/* Código antes do encapsulamento 
		  
		Conta contaDaFlor = new Conta();
		
		contaDaFlor.titular = new Cliente();
		
		contaDaFlor.titular.nome = "Maria Flor";
		
		System.out.println(contaDaFlor.titular.nome);*/
	
	
	Conta conta = new Conta (123, 456);	
	Cliente contaDaFlor = new Cliente ();
	contaDaFlor.setNome("Maria Flor");
	
	conta.setTitular(contaDaFlor);
	
	System.out.println(conta.getTitular().getNome());
	
	}
	
	

}
