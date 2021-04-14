package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Produto;

public class ProdutoController {

	public static void main(String[] args) {
	
	
		Produto produto_1 = new Produto("Arroz", 8.0, 100);		
		Produto produto_2 = new Produto("Feijão", 10.0, 100);
		Produto produto_3 = new Produto("Lentilha", 6.0, 100);
		Produto produto_4 = new Produto("Banana");
		Produto produto_5 = new Produto("Batata", 2.50, 60);
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(produto_1);
		produtos.add(produto_2);
		produtos.add(produto_3);
		produtos.add(produto_4);
		produtos.add(produto_5);
		
		System.out.println("_____ Lista Original _____");
		System.out.println(produtos);
		
		produtos.sort(Comparator.comparing(Produto::getNome));
		
		System.out.println("_____ Lista Ordenada _____");
		System.out.println(produtos);
		
		System.out.println("_____ Pesquisa _____");
		
		produtos.forEach(p -> {
			if(p.getNome().equals("Arroz")) {
				System.out.println(p);
			}
		});
		
		Produto produtoBusca = produtos.stream().filter(p-> p.getNome().equals("Arroz")).findAny().orElse(null);
		System.out.println(produtoBusca);

	}

}