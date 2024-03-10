package n1exercici3.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterUtils {

	public static void escriureArxius(String text, String path, String fileName) {
		
		BufferedWriter bw = null;
		 
		try {
			File file = new File(path + fileName);
			bw = new BufferedWriter(new FileWriter(file, true));
			bw.write(text);
			System.out.println("L'arxiu s'ha escrit correctament.");	
		}catch(IOException e){
			System.out.println("Error a l'escriure a l'arxiu.");
			System.out.println(e);
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
