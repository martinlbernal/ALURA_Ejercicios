
public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(); 
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
		
		 
	}

}
