import java.util.Scanner;

import model.Produto;
import service.ProdutoService;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
				
		ProdutoService service = new ProdutoService();
		
		
		
		
//		System.out.println("Digite o índice do produto que você deseja obter: ");
//		Produto produto = service.GetProduto(leitor.nextInt());		
//		System.out.println("Produto: " + produto.Nome + " ----- Valor: " + produto.Valor);
		
		
		
		Produto produto = new Produto();
		produto.Nome = "Farinha";
		produto.Imposto = 10;
		produto.Custo = 20;
		service.SetProduto(produto);
		
		
		
		leitor.close();
		

	}

}
