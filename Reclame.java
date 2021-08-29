package marketPlace.Poo.Dois;

public class Reclame {

	private User userAnunciante;
	private String descricao;
	private int codigo;
	Books bk;
	
	
	
	public Reclame() {
		
	}
	
	public Reclame(User u,Books b,String descricao) {
		this.userAnunciante=u;
	}

	public User getUserAnunciante() {
		return userAnunciante;
	}

	public void setUserAnunciante(User userAnunciante) {
		this.userAnunciante = userAnunciante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Books getBk() {
		return bk;
	}

	public void setBk(Books bk) {
		this.bk = bk;
	}
	
	@Override
	public String toString() {
		
		return "Informações :"+userAnunciante + "\n Descrição:"
				+descricao + "\n codigo"+codigo;
	}
	
	
}
