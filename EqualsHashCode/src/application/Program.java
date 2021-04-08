package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		/*
		 * Client c1 = new Client("Maria", "marua@gmail.com"); Client c2= new
		 * Client("Maria", "marua@gmail.com");
		 * 
		 * String s1 = "test"; String s2 = "test"; String s3 = new String("test");
		 * 
		 * System.out.println(c1.hashCode()); System.out.println(c2.hashCode());
		 * System.out.println(c1.equals(c2)); System.out.println(c1 == c2);//false
		 * compara as referencias de memórias, como estao em posições de memórias
		 * diferentes ,será falso, (String daria igual)
		 * 
		 * System.out.println(s1 == s2);//true, mesma string fica com a mesma referencia
		 * de memória System.out.println(s1 == s3);//false, pois foi forçado a criar um
		 * endereço diferente
		 */

		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
				
				
	    //union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection - o que há em comum
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//diference - o que tem de diferente
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
