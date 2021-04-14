package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,5,2,6,10,60);
		
		Stream<Integer>st1 = list.stream().map(x-> x*10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
								//0 elemento inicial, e depois uma função que recebe dois argumento e gera um resultado
		int sum = list.stream().reduce(0, (x,y)-> x+y);//reduce operação terminal
		
		System.out.println("Sum ="+ sum);
		
		List<Integer> newList = list.stream()
				.filter(x->x%2 ==0)
				.map(x-> x*10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
