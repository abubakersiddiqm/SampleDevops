package basicjavaConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
public static void main(String[] args) throws IOException {
	File file=new File("./files/sample2.txt");
	
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	
	//System.out.println(br.readLine());
	String s;
	while ((s=br.readLine())!=null) {
		
		System.out.println(s);
	}
}
}
