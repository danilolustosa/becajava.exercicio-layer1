package repository;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoRepository {
	
	private List<Produto> Lista = new ArrayList<Produto>();
	
	
	public Produto GetProduto(int indice) {
		
		
		Produto produto = new Produto();
		produto.Nome = "Bolacha";
		produto.Custo = 10;
		produto.Imposto = 10;
		Lista.add(produto);
		
		produto = new Produto();
		produto.Nome = "Biscoito";
		produto.Custo = 15;
		produto.Imposto = 5;
		Lista.add(produto);
		
		produto = new Produto();
		produto.Nome = "Passatempo";
		produto.Custo = 5;
		produto.Imposto = 15;
		Lista.add(produto);
		
		produto = new Produto();
		produto.Nome = "Finni";
		produto.Custo = 20;
		produto.Imposto = 20;
		Lista.add(produto);
		
		produto = new Produto();
		produto.Nome = "Coca-cola";
		produto.Custo = 8;
		produto.Imposto = 35;
		Lista.add(produto);
		
		
		return Lista.get(indice);		
	}
	
	public void SetProduto(Produto produto) {
		Lista.add(produto);
	}

}
