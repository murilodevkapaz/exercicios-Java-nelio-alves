package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import models.entities.Course;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Course> courseA = new HashSet<>();
		Set<Course> courseB = new HashSet<>();
		Set<Course> courseC = new HashSet<>();

		courseA = addList(sc, 'A');
		courseB = addList(sc, 'B');
		courseC = addList(sc, 'C');

		Set<Course> totalStudents = new HashSet<>();
		totalStudents.addAll(courseA);
		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);
		
		System.out.println("\nTotal students: " + totalStudents.size());
	}

	static Set<Course> addList(Scanner sc, char nameCourse) {
		Set<Course> course = new HashSet<>();
		System.out.printf("How many students for course %s ? ", nameCourse);
		int qtdStudents = sc.nextInt();

		for(int i=0; i<qtdStudents;i++) {
			Integer idStudent = sc.nextInt();
			course.add(new Course(idStudent));
		}
		return course;
	}

}
