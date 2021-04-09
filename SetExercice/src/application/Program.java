package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import models.entities.User;

public class Program {

	public static void main(String[] args) {
		// String path =
		// "C:\\Users\\OSASSP01\\Desktop\\murilo\\java\\exercícios\\exercicios-java\\SetExercice\\logUsers.txt";
		Set<User> users = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(" ");
				String name = fields[0];
				Date date = Date.from(Instant.parse(fields[1]));

				users.add(new User(name, date));

				System.out.println(line);

				line = br.readLine();
			}

			System.out.println("\nTotal users: " + users.size());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
