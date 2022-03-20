package application;

import entities.Contract;
import entities.Intallment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, data, totalValue);

		//processar o contrato
		ContractService cs = new ContractService(new PaypalService());
		System.out.println("Enter number of installments: ");
		int n = sc.nextInt();
		cs.processContract(contract, n);

		System.out.println("Intallments: ");
		for (Intallment it : contract.getIntallments()) {
			System.out.println(it);
		}


	}
}
