package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enterr the data into the file");
		String str= sc.nextLine();
		byte[] data= str.getBytes();
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("C:\\FileHandling\\Queen.txt");
			fout.write(data);
			System.out.println("Data is written successfully into the file");
			fout.close();
		} catch (FileNotFoundException e) {
			System.err.println("path of the file is incorrect");
		}catch (Exception e) {
			System.err.println("something went wrong");
		}
		
	}
}
