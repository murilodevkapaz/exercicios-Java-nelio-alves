import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<String> list = new ArrayList<>();
		
		list.add("Murilo");
		list.add("Carlos");
		list.add("Diego");
		list.add(2, "Maria");
		list.add("Maria");
		list.add("Ana");
		
		//.remove("Maria");
		list.removeIf(s-> s.charAt(0) == 'M');
		
		for(String l : list) System.out.println(l);
		
		System.out.println(list.size());
		
		System.out.println("Posicao de Carlos "+ list.indexOf("Carlos"));
		
		List<String> listFilter = list.stream().filter(x-> x.charAt(0) == 'D').collect(Collectors.toList());
		
		String filterFirst = list
					.stream()
					.filter(x->x.charAt(0) == 'A')
					.findFirst()
					.orElse(null);
		System.out.println(filterFirst);
		for(String l : listFilter) System.out.println(l);
	}

}
