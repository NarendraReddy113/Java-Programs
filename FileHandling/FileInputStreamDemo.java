package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("C:\\Filehandling\\King.txt");
			System.out.println(fin.available());
			System.out.println((char) fin.read());
			int r = fin.read();
			while (r != -1) {
				System.out.print((char) r);
				r = fin.read();
			}
			fin.close();
		} catch (FileNotFoundException e) {
			System.err.println("path of the file is incorrect");
		} catch (Exception e) {
			System.err.println("Something went wrong");
		}

	}
}
