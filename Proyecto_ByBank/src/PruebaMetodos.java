
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cuenta nueva= new Cuenta();
		cuenta.depositar(300);
		System.out.println(cuenta.getSaldo());
				
		cuenta.retirar(200);
		System.out.println(cuenta.getSaldo());
		
		cuenta.transferir(400, nueva); 
		
		
		System.out.println(cuenta.getSaldo());
		System.out.println(nueva.getSaldo());
	}
}
