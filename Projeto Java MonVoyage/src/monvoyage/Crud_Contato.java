package monvoyage;

import java.util.Scanner;

public class Crud_Contato {
public static void main(String[] args) {
		
		String Nome;
		String Cpf;
		String Mensagem;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escreva seu nome: ");
		Nome = teclado.nextLine();
		System.out.println("Escreva seu CPF: ");
		Cpf = teclado.nextLine();
		System.out.println("Escreva a mensagem: ");
		Mensagem = teclado.nextLine();
		System.out.println("Mensagem enviada com sucesso");
	}
}