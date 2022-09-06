package monvoyage;

public class Clientes
{
	String CPF;
	String Nome;
	String Email;
	String Endereco;
	
	
	public Clientes(String CPF, String Nome, String Email, String Endereco){
		this.CPF = CPF;
		this.Nome = Nome;
		this.Email = Email;
		this.Endereco = Endereco;

	}
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getCpf() {
		return CPF;
	}

	public void setCpf(String CPF) {
		this.CPF = CPF;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}


	}

