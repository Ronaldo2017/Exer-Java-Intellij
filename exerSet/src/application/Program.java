package application;


import entities.Usuario;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Usuario> usuarios = new HashSet<>();

		int usuario = 0;
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			usuario = sc.nextInt();
			usuarios.add(new Usuario(usuario));
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			usuario = sc.nextInt();
			usuarios.add(new Usuario(usuario));
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			usuario = sc.nextInt();
			usuarios.add(new Usuario(usuario));
		}

		System.out.println("Total students: " + usuarios.size());

	}
}
