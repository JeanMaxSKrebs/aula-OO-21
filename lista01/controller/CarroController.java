package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Carro;

public class CarroController {
	public static void main(String[] args) {
		
		
		Carro carro_1 = new Carro(1, "Chevrolet", "Camaro", 2015);		
		Carro carro_2 = new Carro(2, "Volkswagen", "Fox", 2014);
		Carro carro_3 = new Carro(3, "Volkswagen", "Fusca", 1955);
		Carro carro_4 = new Carro(4, "Chevrolet", "Onix", 2013);
		Carro carro_5 = new Carro(5, "Fiat", "Uno", 2000);
		
		System.out.println(carro_1);
		List<Carro> carros = new ArrayList<>();
		
		carros.add(carro_1);
		carros.add(carro_2);
		carros.add(carro_3);
		carros.add(carro_4);
		carros.add(carro_5);
		
		System.out.println("_____ Lista Ordenada _____");
		System.out.println(carros);
		
		System.out.println("_____ Busca por Id_____");		
		Carro carroBusca = carros.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(carroBusca);
		
		Map<Integer, Carro> carrosMap = new HashMap<>();
		carrosMap.put(carro_1.getId(), carro_1);
		carrosMap.put(carro_2.getId(), carro_2);
		carrosMap.put(carro_3.getId(), carro_3);
		carrosMap.put(carro_4.getId(), carro_4);
		carrosMap.put(carro_5.getId(), carro_5);
		System.out.println("_____ Lista MAP _____");
		System.out.println(carrosMap);
		
		System.out.println();
		System.out.println("_____ Busca por MAP_____");		
		System.out.println(carrosMap.get(3));
		
	}
}
