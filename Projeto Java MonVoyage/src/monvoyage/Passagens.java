package monvoyage;

public class Passagens
{
	public int Cod_viagem;
	public String Origem;
	public String Destino;
	
	public Passagens(int Cod_viagem, String Origem, String Destino){
		this.Cod_viagem = Cod_viagem;
		this.Origem = Origem;
		this.Destino = Destino;
	}
	
	public int getCod_viagem() {
		return Cod_viagem;
	}

	public void setCod_viagem(int Cod_viagem) {
		this.Cod_viagem = Cod_viagem;
	}
	
	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String Origem) {
		this.Origem = Origem;
	}
	
	public String getDestino() {
		return Destino;
	}

	public void setDestino(String Destino) {
		this.Destino = Destino;
	}
}
	


