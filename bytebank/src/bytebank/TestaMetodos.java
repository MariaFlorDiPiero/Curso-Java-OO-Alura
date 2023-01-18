package bytebank;

public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaDaFlor = new Conta(123, 456);
		contaDaFlor.setSaldo(100);
		contaDaFlor.deposita(200);
		System.out.println(contaDaFlor.getSaldo());
		
		boolean conseguiuRetirar = contaDaFlor.saca(50);
		System.out.println(contaDaFlor.getSaldo());
		System.out.println(conseguiuRetirar);
		
		Conta contaDoAle = new Conta(123, 456);
		contaDoAle.deposita(1000);
		System.out.println(contaDoAle.getSaldo());
		
		if (contaDoAle.transfere(3000, contaDaFlor)) {
			System.out.println("transferência feita com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaFlor.getSaldo());
		System.out.println(contaDoAle.getSaldo());
	}

}
