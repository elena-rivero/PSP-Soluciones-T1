package ejercicio5;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class LanzaPreguntaNombre {

	public static void main(String[] args) {
		String[] comando = { "java", "ejercicio5.PreguntaNombre" };
		ProcessBuilder pb = new ProcessBuilder(comando);
		pb.directory(new File("D:\\Servicios\\LanzaProceso\\bin"));

		pb.redirectOutput(Redirect.INHERIT);
		pb.redirectInput(new File("D:\\Servicios\\LanzaProceso\\src\\ejercicio5\\entrada.txt"));
		
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
