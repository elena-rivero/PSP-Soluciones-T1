package ejercicio7;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

public class ProcesosTuberia {

	public static void main(String[] args) {
		ProcessBuilder pb1 = new ProcessBuilder("java", "lanzaproceso.Proceso1");
//		pb1.inheritIO();
		ProcessBuilder pb2 = new ProcessBuilder("java", "lanzaproceso.Proceso2");
		ProcessBuilder pb3 = new ProcessBuilder("java", "lanzaproceso.Proceso3");
		pb1.directory(new File("D:\\Servicios\\LanzaProceso\\bin"));
		pb2.directory(new File("D:\\Servicios\\LanzaProceso\\bin"));
		pb3.directory(new File("D:\\Servicios\\LanzaProceso\\bin"));
//	
		List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
		lpb.add(pb1);
		lpb.add(pb2);
		lpb.add(pb3);
//		pb3.redirectOutput(Redirect.INHERIT);
		pb1.redirectError(Redirect.INHERIT);
		pb2.redirectError(Redirect.INHERIT);
		pb3.redirectError(Redirect.INHERIT);
		
		pb3.redirectOutput(new File("salida.txt"));
		try {
			List<Process> lProcess = ProcessBuilder.startPipeline(lpb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
