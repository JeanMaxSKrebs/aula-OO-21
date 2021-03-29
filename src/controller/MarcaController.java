package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Marca;

public class MarcaController {
	public static void main(String[] args) {

		Marca marca_1 = new Marca();
		Marca marca_2 = new Marca(1, "Fiat");
		Marca marca_3 = new Marca(2, "Fiat");
		Marca marca_4 = new Marca(3, "Citroen");
		Marca marca_5 = new Marca(4, "Volkswagen");
	
		List<Marca> marcasList = new ArrayList<>();
		marcasList.add(marca_1);
		marcasList.add(marca_2);
		marcasList.add(marca_3);
		marcasList.add(marca_4);
		marcasList.add(marca_5);
		System.out.println("_____ Lista Marcas _____");
		System.out.println(marcasList);
		
		System.out.println("_____ Busca Marcas por Id _____");
		Marca marcaBusca = marcasList.stream().filter(m -> m.getId() == 3).findAny().orElse(null);
		System.out.println(marcaBusca);
		
		Map<Integer, Marca> marcasMap = new HashMap<>();
		marcasMap.put(marca_1.getId(), marca_1);
		marcasMap.put(marca_2.getId(), marca_2);
		marcasMap.put(marca_3.getId(), marca_3);
		marcasMap.put(marca_4.getId(), marca_4);
		marcasMap.put(marca_5.getId(), marca_5);
		System.out.println("_____ MAP _____");
		System.out.println(marcasMap);

		
		System.out.println();
		System.out.println("_____ MAP busca por Id_____");
		System.out.println(marcasMap.get(3));
	}
}
