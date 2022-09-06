package monvoyage;

import java.util.Scanner;

public class Crud_Clientes {

	public static void main(String[] args) {
	
		String Nome;
		String Cpf;
		String Email;
		String Endereco;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escreva seu nome: ");
		Nome = teclado.nextLine();
		System.out.println("Escreva seu Endereço: ");
		Endereco = teclado.nextLine();
		System.out.println("Escreva seu CPF: ");
		Cpf = teclado.nextLine();
		System.out.println("Escreva seu email: ");
		Email = teclado.nextLine();
		System.out.println("Cadastro feito com Sucesso!");
	}

}
