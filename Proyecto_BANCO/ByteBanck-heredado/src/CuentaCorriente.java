
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteExcepction {
		double comision = 0.2;
		super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
