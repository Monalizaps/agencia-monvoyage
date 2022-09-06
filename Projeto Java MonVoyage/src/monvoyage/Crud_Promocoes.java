package monvoyage;

import java.sql.Date;
import java.util.Scanner;

public class Crud_Promocoes {
	
	public static void main(String[] args) {
		int Cod_pedido = 0;
		String Data_venda = "";
		int Desconto = 0;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o código do seu pedido: ");
		Cod_pedido = teclado.nextInt();
		System.out.println("Digite a data da venda: ");
		Data_venda = teclado.nextLine();
		System.out.println("Este é o seu desconto!");
		Desconto = teclado.nextInt();
		
	}
	
}