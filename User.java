package marketPlace.Poo.Dois;

public class User {

	//atributos
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String cidade;
	private String senha;
	
	//construtor com parametros
	public User(String nome, String sobrenome, 
			String cpf, String email, String cidade, String senha) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.email = email;
		this.cidade = cidade;
		this.senha = senha;
	
	}
	
	public User() {
	//construtor default	
	}
	
	//getters e setters
	
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
	
	
	
}
