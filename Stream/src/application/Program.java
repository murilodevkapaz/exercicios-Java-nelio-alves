package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,34,2,53,3);
		
		Stream<Integer> st1 = list.stream().map(l-> l * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));//toarray operação terminal
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");//já cria o array aqui mesmo
		
		System.out.println(Arrays.toString(st2.toArray()));
		
									//0 é o primeiro elemento, e depois qua a função de iteração
		Stream<Integer> st3 = Stream.iterate(0, x->x+2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));//limite de 10 elementos
		//imprime [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		Stream<Long> fibonacci = Stream
				.iterate(new Long[] {0L, 1L}, p-> new Long[] {p[1], p[0]+p[1]})
				.map(p-> {
					return p[0];
				});
		System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));
		
		
	}

}
