package marketPlace.Poo.Dois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class PrincipalMKT {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		 Scanner dados1 = new Scanner(System.in);
		 Scanner dados2 = new Scanner(System.in);
		 Scanner dados3 = new Scanner(System.in);
		
		 produtoControle produtoController = new produtoControle();
		    Cadastro produto1 = new Cadastro(null, 0, 0, 0);
		
			String titulo="";
			int codigo=0;
			double preco=0;
			double valorFrete=0;
			
			System.out.println(
		            "Opçoes\n 1-Cadastrar produto\n 2-Remover produto\n 3-Verificar produto\n0-Encerrar\n");
		    int numopc ;

		    System.out.print(
		            "nº: ");

		    numopc = dados.nextInt();

		    while (numopc
		            != 0) {

		        switch (numopc) {

		            case 1:
		            	System.out.println("Nome do produto: ");
		                titulo = dados1.nextLine();
		                produto1.setTitulo(titulo);

		                System.out.println("Codigo do produto: ");
		                codigo = dados2.nextInt();
		                produto1.setCodigo(codigo);

		                System.out.println("Valor do frete do produto: ");
		                valorFrete = dados3.nextDouble();
		                produto1.setValorFrete(valorFrete);

		                System.out.println("Preço do produto: ");
		                preco = dados.nextDouble();
		                produto1.setPreco(preco);

		                System.out.println("\n Cadastrar mais produtos?\n  1-Sim\n  0-Não\n");
		                numopc = dados.nextInt();

		                produtoController.adicionar(produto1);
		                produto1 = new Cadastro(titulo, valorFrete, preco, codigo);
		                break;

		            case 2:
		            	try {
							//System.out.println("erro ,tirara duvida na aula");
							/*while(!produtos.isEmpty()){
			                    System.out.println(produtos.remove(0));
			                }*/
						} catch (Exception e) {
							System.out.println("Erro no sistema,ação não efetuada ");
						}
		            	break;
		            case 3:
		            	break;
		            case 4:
		            		System.out.println("Obrigado pelo acesso ,você encerrou a operação.");
		            		break;
					
		        }
		       

		    }

		    produtoControle produtoControle = new produtoControle();
			produtoControle.listaProdutos();
		
	}
	
}
