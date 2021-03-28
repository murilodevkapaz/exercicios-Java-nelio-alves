package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.services.PaymentService;
import entities.services.PaypalTax;
import model.entities.Contract;
import model.entities.Installment;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Enter contract data");
			System.out.print("Number: ");
			int number = sc.nextInt();

			System.out.print("Date (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.next());

			System.out.print("Contract Value: ");
			Double totalValue = sc.nextDouble();

			Contract contract = new Contract(number, date, totalValue);

			System.out.print("Enter number of installments: ");
			int numInstaments = sc.nextInt();

			PaymentService paymentService = new PaymentService(new PaypalTax());

			double valueInstallment = totalValue / numInstaments;

			Installment installment = new Installment(date, valueInstallment);
			List<Installment> installments = new ArrayList<>();

			for (int i = 1; i <= numInstaments; i++) {
				Installment inst = paymentService.taxService.tax(i, installment);
				installments.add(inst);
			}

			contract.setInstallment(installments);

			System.out.println("Installments:");
			for (Installment inst : contract.getInstallment()) {

				System.out.print(sdf.format(inst.getDueDate()));
				System.out.printf(" - %.2f%n", inst.getAmount());

			}
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
