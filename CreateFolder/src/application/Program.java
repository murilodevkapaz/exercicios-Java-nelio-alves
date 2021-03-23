package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
										//só lista quem for diretorio dentro da pasta selecionada
		File[] folders = path.listFiles(File::isDirectory);
										//somente files
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("\nFoders: ");
		
		for(File f: folders) {
			System.out.println(f);
		}
		
		System.out.println("\nFILES:");
		for(File f : files) {
			System.out.println(f);
		}
		
		//para criar uma pasta
		boolean success = new File(strPath + "\\testFolder").mkdir();
		System.out.println("Directory created successfully "+ success);
		
		sc.close();
	}
}
