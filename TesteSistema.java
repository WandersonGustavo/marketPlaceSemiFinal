package marketPlace.Poo.Dois;

import java.util.List;
import java.util.Scanner;

public class TesteSistema {

List<User> listaUsuarios;
	
	Scanner entrada= new Scanner(System.in);
	TelaUser tUser=new TelaUser(this);
	TelaVendedorFrete tVF= new TelaVendedorFrete(this);
	User atual;


	//construtor
	public void TelaPrincipal(List<User> listaUsuarios) {
		this.listaUsuarios=listaUsuarios;
	}

	public User solicitarLogin() {

		entrada= new Scanner(System.in);
		String nomeDigitado="";
		String senhaDigitada="";	

		User usuarioAtual;

		do{
			System.out.println("Digite seu usuário(Nome) ou -1 para voltar:");

			nomeDigitado=entrada.nextLine();
			if(nomeDigitado.equals("-1")) {
				return null;
			}

			for(User u:listaUsuarios) {
				if(u.getNome().equals(nomeDigitado)) {
					//usuarioAtual=u;
					System.out.println("usuario encontrado");

					System.out.println("Digite sua senha ou -1 para voltar:");

					senhaDigitada=entrada.nextLine();

					if(senhaDigitada.equals("-1")) {
						return null;
					} else {
						if(u.getSenha().equals(senhaDigitada)) {
							return u;
						} else {
							System.out.println("senha incorreta, tente novamente");
						}
					}				

				}
			}
					System.out.println("usuario nao encontrado");
		
		}while(senhaDigitada!="-1" || nomeDigitado!="-1");

		return null;


	}

	public User cadastro() {
		
		boolean cadastrando = true;
		User u = new User();
		
		System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
		while (cadastrando) {
			
			System.out.println("Cadastro de Usuário");
			
			u.setNome(textInput("Nome:"));
			u.setSobrenome(textInput("Sobrenome:"));
			u.setCidade(textInput("Cidade:"));
			u.setCpf(textInput("CPF:"));
			u.setEmail(textInput("Email:"));
			u.setSenha(textInput("Senha:"));
			
			String cadastrar = textInput("Confirmar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				listaUsuarios.add(u);
				System.out.println("Cadastro adicionado !!!");
				cadastrando = false;
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOpção inválida \n");
			}	
		}	return null;
	}
	
	//metodo pra imprimir um texto e let string
	public String textInput(String label) {
		System.out.println(label);
		return entrada.next();
	}
	
	public void exibirTela() {

		int opcao=-1;

		do {
			
			System.out.println("Digite a opcao desejada:");
			System.out.println("Professor fiz alguma coisa que não consegui desfazer"
					+ "\nentão o login não ta funcionando mais(ontem estava),\n mas se cadastrar novo usuario ele funciona");
			System.out.println("1 para  logar:");
			System.out.println("2 para se cadastrar:");
			System.out.println("-1 para sair:");
			
			opcao=entrada.nextInt();
			
			switch (opcao) {
			case 1:
				User u=solicitarLogin();
				if(u!=null) {
					atual=u;
					tUser.exibirTela();
				}
					
				break;

			case 2:
				u =cadastro();
				if(u!=null) {
					atual=u;
					tUser.exibirTela();
				}
				break;
			case -1:
				System.out.println("Até mais");
				break;

			default:
				System.out.println("opcao nao existente, tente novamente");
				break;
			}
			
		}while(opcao!=-1);


	}


	private static void exibirMenuUser(User u) {
	
		TelaVendedorFrete tA=new TelaVendedorFrete(null);
		tA.exibirTela();
		
	}

	
	public List<User> getListaUsuarios() {
		return listaUsuarios;
	}

	
	public void setListaUsuarios(List<User> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	
	public Scanner getSc() {
		return entrada;
	}

	public void setSc(Scanner sc) {
		this.entrada = sc;
	}

	public TelaUser gettU() {
		return tUser;
	}

	public void settU(TelaUser tU) {
		this.tUser = tU;
	}

	
	public TelaVendedorFrete gettA() {
		return tVF;
	}

	
	public void settA(TelaVendedorFrete tA) {
		this.tVF = tA;
	}

	
	public User getuAtual() {
		return atual;
	}

	
	public void setuAtual(User uAtual) {
		this.atual = uAtual;
	}


	
}
