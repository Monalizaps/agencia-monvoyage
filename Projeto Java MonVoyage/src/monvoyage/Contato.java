package monvoyage;

public class Contato
{
	public String Nome;
	public String Email;
	public String Mensagem;
	
	
	public Contato(String Nome, String Email, String Mensagem){
		this.Nome = Nome;
		this.Email = Email;
		this.Mensagem = Mensagem;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getMensagem() {
		return Mensagem;
	}

	public void setMensagem(String Mensagem) {
		this.Mensagem = Mensagem;
	}
}