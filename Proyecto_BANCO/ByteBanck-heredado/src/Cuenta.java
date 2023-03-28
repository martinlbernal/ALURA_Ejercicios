
public abstract class Cuenta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public Cuenta() {

	};

	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permiten numeros negativos");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Aqui nace la cuenta numero " + total);

	}

	public abstract void depositar(double valor);

	public void retirar(double valor) throws SaldoInsuficienteExcepction{
		if (this.saldo<valor) {
			throw new SaldoInsuficienteExcepction("No tiene saldo");			
		}
			this.saldo -= valor;
			
	
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteExcepction e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
