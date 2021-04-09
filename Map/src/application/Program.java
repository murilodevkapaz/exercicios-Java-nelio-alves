package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username" ,"Maria");
		cookies.put("email" ,"maria@gmail.com");
		cookies.put("phone" ,"99711-1222");
		
		cookies.remove("email");
		cookies.put("phone", "99999-9999");//sobrescreve a chave phone
		
		Boolean containPhone = cookies.containsKey("phone"); //true
		System.out.println("Phone number: "+cookies.get("phone"));//Phone number: 99999-9999
		System.out.println("Phone naoexiste: "+cookies.get("naoexiste"));//null
		
		System.out.println("All cookies: ");
		
		for(String key:cookies.keySet()) {
			System.out.println(key + ": "+ cookies.get(key));
		}
/*		Phone naoexiste: null
		All cookies: 
		phone: 99999-9999
		username: Maria*/
	}

}
