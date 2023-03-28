
public class Cuenta{
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total;
	public Cuenta() {
		
	}
	
	public Cuenta( int agencia) {
		if (agencia <= 0) {
			System.out.println("No se permiten numeros negativos");
			this.agencia=1;
			}else {
				this.agencia=agencia;
			}
		total++;
		System.out.println("Aqui nace la cuenta numero "+total);
		
	}
	public void depositar (double valor) {
		saldo += valor;
	}
	
	public boolean retirar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
			return false;
	    }
		
		
	public boolean transferir (double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
			}
				System.out.println("Fondos insuficientes");
				return false;
			}
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	
}


	
		
	
