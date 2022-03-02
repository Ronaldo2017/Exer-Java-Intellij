package application;

import entities.PF;
import entities.PJ;
import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer " + i + " data:");
			System.out.println("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if (ch  == 'i') {
				System.out.println("Número de funcionários: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new PJ(nome, rendaAnual, numeroDeFuncionarios));
			} else {
				System.out.println("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PF(nome, rendaAnual, gastoSaude));
			}
		}
		System.out.println();
		System.out.println("Imposto à pagar: ");
		for (Pessoa p : list) {
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.imposto()));
		}

		//soma de todas os gastos
		double sum = 0;
		for (Pessoa p : list) {
			sum += p.imposto();
		}
		System.out.printf("Total tax: %.2f%n", sum);
	}
}
