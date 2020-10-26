package service;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoService {

	
	public Produto GetProduto(int indice) {
		ProdutoRepository repository = new ProdutoRepository();
		Produto produto = repository.GetProduto(indice);
		produto.Valor = ((produto.Custo * produto.Imposto) / 100) + produto.Valor;
		return produto;		
	}
	
	
	public void SetProduto(Produto produto) {
		ProdutoRepository repository = new ProdutoRepository();
		produto.Valor = ((produto.Custo * produto.Imposto) / 100) + produto.Valor;
		repository.SetProduto(produto);
	}
	
	
	
}
