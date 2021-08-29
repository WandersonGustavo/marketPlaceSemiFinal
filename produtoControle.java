package marketPlace.Poo.Dois;

import java.util.ArrayList;
import java.util.List;

public class produtoControle {

	List<Cadastro> produtos = new ArrayList<>();

	public void adicionar(Cadastro cp) {
	    produtos.add(cp);
	}

	public void listaProdutos() {
	    produtos.forEach((p) -> {
	        System.out.println("Nome: " + p.getTitulo());
	        System.out.println("Modelo: " + p.getCodigo());
	        System.out.println("Tamanho: " + p.getValorFrete());
	        System.out.println("Preço: " + p.getPreco());
	        System.out.println("-----------------------------");
	    });
	    
	}
	 public void removerProdutos(Cadastro cp) {
	    	produtos.remove(cp);
	    }
}
