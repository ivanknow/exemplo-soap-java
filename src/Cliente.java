import localhost.axis.Dado_jws.DadoService;
import localhost.axis.Dado_jws.DadoServiceLocator;


public class Cliente {
public static void main(String[] args) {
	try {
		try {

			

			DadoService service = new DadoServiceLocator();
			localhost.axis.Dado_jws.Dado dado = service.getDado();

			//D6
			System.out.println(dado.cacular(6));
			
			//D10
			System.out.println(dado.cacular(10));
			
			//D20
			System.out.println(dado.cacular(10));
			
			

		} catch (Exception e) {

		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
