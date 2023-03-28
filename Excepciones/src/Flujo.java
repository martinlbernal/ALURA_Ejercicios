


	public class Flujo {

		  public static void main(String[] args) {
		    System.out.println("Inicio do main");
		    try {
				metodo1();
			} catch (MiException e) {
				System.out.println("ATRAPADAAA");
				e.printStackTrace();
			}
		    System.out.println("Fim do main");
		  }
		  public static void metodo1() throws MiException{
		    System.out.println("Inicio do metodo1");
		
		    	metodo2();	
			
				
			}
		    
		    
		  public static void metodo2()throws MiException{
		    System.out.println("Inicio do metodo2");
		    throw new MiException("Mi excepcion fue lanzada");
		    
		  }
		}

