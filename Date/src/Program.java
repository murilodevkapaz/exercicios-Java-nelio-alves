import java.text.ParseException;
import java.util.Scanner;

import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter with enum: ");
		String en = sc.next().toUpperCase();
	
		OrderStatus orderStatus = OrderStatus.valueOf(en);
		
		System.out.println(orderStatus);
}

}
