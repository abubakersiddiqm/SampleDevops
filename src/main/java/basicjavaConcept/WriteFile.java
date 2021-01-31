package basicjavaConcept;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args) throws IOException {
		File file=new File("./files/sample2.txt");
		file.createNewFile();
		
		//writing text
		FileWriter fw =new FileWriter(file);
		/*
		 * fw.write("ramya"); fw.close();
		 */
		BufferedWriter br=new BufferedWriter(fw);
		br.write("Abu");
		br.newLine();
		br.write("meena");
		br.close();
		fw.close();
	}

}
