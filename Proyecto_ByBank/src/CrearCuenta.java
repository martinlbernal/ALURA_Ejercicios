
public class CrearCuenta{
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);
		
		System.out.println(primeraCuenta.getSaldo());
	}

}
