
public class TestCuentaExceptionSaldo  {
public static void main(String[] args) {
	Cuenta cuenta =new CuentaAhorro(123,456);
	cuenta.depositar(200);
	try {
		cuenta.retirar(210);
	} catch (SaldoInsuficienteExcepction e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
