
public class TestGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setClave("AluraCursosOnline");
		gerente.setSalario(6000);
		gerente.setTipo(1);
		
		
		System.out.println(gerente.getSalario());
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
		System.out.println(gerente.getBonificacion());
		
	}

}
