package ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LanzaProcesoRuntime {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String[] comando = {"java", "-classpath", "D:\\Servicios\\LanzaProceso\\bin", "lanzaproceso.Proceso1"};
		
		try {
			Process p = r.exec(comando);
			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));
			
			String line = br.readLine();
			while(line!=null) {
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
			bw.close();
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
