package monvoyage;
import java.sql.Date;

public class Promocoes
{
	
	public int Cod_pedido;
	public Date Data_venda;
	public int Desconto;


	public Promocoes(int Cod_pedido, Date Data_venda, int Desconto){
		this.Cod_pedido = Cod_pedido;
		this.Data_venda = Data_venda;
		this.Desconto = Desconto;
	}
	
	public int getCod_pedido() {
		return Cod_pedido;
	}

	public void setCod_pedido(int Cod_pedido) {
		this.Cod_pedido = Cod_pedido;
	}
	
	public Date getData_venda() {
		return Data_venda;
	}

	public void setData_venda(Date Data_venda) {
		this.Data_venda = Data_venda;
	}
	
	public int getDesconto() {
		return Desconto;
	}

	public void setDesconto(int Desconto) {
		this.Desconto = Desconto;
	}
}
