package ejercicio6;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class LanzaTicketCompra {

	public static void main(String[] args) {
		String[] comando = { "java", "ejercicio6.TicketCompra" };
		ProcessBuilder pb = new ProcessBuilder(comando);
		pb.directory(new File("D:\\Servicios\\LanzaProceso\\bin"));
		pb.redirectInput(Redirect.INHERIT);
		pb.redirectOutput(Redirect.appendTo(new File("D:\\Servicios\\ticket.txt")));
		try {
			Process p = pb.start();
			p.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
