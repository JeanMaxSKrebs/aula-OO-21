package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Veiculo;

public class VeiculoController {
	public static void main(String[] args) {
		Veiculo veiculo_1 = new Veiculo("123456", "III1234", "Branco", 4, "gasolina/alcool", 10000, "ABC12345", 110.00);
		Veiculo veiculo_2 = new Veiculo("654321", "III1235", "Branco", 4, "gasolina/alcool", 10000, "ABC12346", 90.00);
		Veiculo veiculo_3 = new Veiculo("234567", "III1236", "Branco", 4, "gasolina/alcool", 10000, "ABC12347", 80.00);
		Veiculo veiculo_4 = new Veiculo("345678", "III1237", "Branco", 4, "gasolina/alcool", 10000, "ABC12348", 100.00);
		Veiculo veiculo_5 = new Veiculo("456789", "III1238", "Branco", 4, "gasolina/alcool", 10000, "ABC12349", 150.00);

		List<Veiculo> veiculos= new ArrayList<>();
		veiculos.add(veiculo_1);
		veiculos.add(veiculo_2);
		veiculos.add(veiculo_3);
		veiculos.add(veiculo_4);
		veiculos.add(veiculo_5);
		
		System.out.println("_____ Lista Veículos _____");
		System.out.println(veiculos);
		
		veiculos.sort(Comparator.comparing(Veiculo::getPlaca));
		
		System.out.println("_____ Lista Veículos por Placa _____");
		System.out.println(veiculos);
		
		Veiculo veiculosBusca = veiculos.stream().filter(v -> v.getPlaca().equals("III1237")).findAny().orElse(null);
		System.out.println(veiculosBusca);
		
		//Map

		Map<String, Veiculo> veiculosMap = new HashMap<>();
		veiculosMap.put(veiculo_1.getRenavam(), veiculo_1);
		veiculosMap.put(veiculo_2.getRenavam(), veiculo_2);
		veiculosMap.put(veiculo_3.getRenavam(), veiculo_3);
		veiculosMap.put(veiculo_4.getRenavam(), veiculo_4);
		veiculosMap.put(veiculo_5.getRenavam(), veiculo_5);

		System.out.println("_____ MAP _____");
		System.out.println(veiculosMap);
		
		System.out.println("Localiza no MAP");
		System.out.println(veiculosMap.get(veiculo_3.getRenavam()));
		
		
		
		
		
		
		
		
		
		
		
	}
}
