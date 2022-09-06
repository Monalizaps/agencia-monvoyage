package monvoyage;

import java.util.Scanner;

public class Crud_Passagens {
	
	String Origem;
	String Destino;
	
	Scanner teclado = new Scanner (System.in);
	System.out.println("Digite a Origem: ");
	Origem = teclado.nextLine();
	System.out.println("Selecione o Destino da sua Viagem = 1 - São Paulo, 2 - Rio de Janeiro, 3 - Minas Gerais");
	Destino = teclado.nextLine();
	switch (Destino){
		case 1:
			System.out.println("Você escolheu São Paulo");
			break;
		case 2:
			System.out.println("Você escolheu Rio de Janeiro");
			break;
		case 3:
			System.out.println("Você escolheu Minas Gerais");
			break;
	}
	

}

