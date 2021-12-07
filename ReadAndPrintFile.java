import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class ReadAndPrintFile {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Scanner readFile = null;
		FileInputStream file = null;
		String fileName = "";
		String currentWord;
		
		while (true) {
			try {
				System.out.println("What is the name of your file?");
				fileName = sc.nextLine();
				file = new FileInputStream("C:/Users/junio/eclipse-workspace/File/src/" + fileName);
				readFile = new Scanner(file);
				
				while (readFile.hasNext()) {
					currentWord = readFile.nextLine();
					System.out.println(currentWord);
				}
				
				readFile.close();
				break;
			} catch (Exception ee) {
				System.out.println("File Not Found " + fileName);
			} 
		}
	}
}