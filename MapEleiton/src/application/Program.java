package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import models.entities.Candidate;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter File full path: ");
		String path = sc.next();//C:\Users\OSASSP01\Desktop\murilo\java\exercícios\exercicios-java\MapEleiton\\candidates.csv
		
		List<Candidate> cadidates = new ArrayList<>();
		Map<Candidate, Integer> votesByCandidate = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer qtdVotes = Integer.parseInt(fields[1]);
				
				Candidate candidate = new Candidate(name, qtdVotes);
				
				Boolean contaisCandidate = votesByCandidate.containsKey(candidate);
				if(contaisCandidate) {
					Integer votesCounted = votesByCandidate.get(candidate);
					votesCounted += qtdVotes;
					votesByCandidate.put(candidate, votesCounted);
				}
				else {
					votesByCandidate.put(candidate, qtdVotes);
				}
				
				System.out.println(line);				
				line = br.readLine();
			}
			System.out.println("\nVOTES: ");
			for(Candidate candidate: votesByCandidate.keySet()) {
				System.out.println(candidate.getName()+": "+votesByCandidate.get(candidate));
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
