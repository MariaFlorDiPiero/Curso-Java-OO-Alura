package bytebank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		total++;
		System.out.println("Criando uma conta");
	}
	
	
	public void deposita (double valor) {
		this.setSaldo(this.getSaldo() + valor);
		}
	
	public boolean saca (double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	
	//Getter
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//Setter
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal(){
		return Conta.total;		
	}
		
}

