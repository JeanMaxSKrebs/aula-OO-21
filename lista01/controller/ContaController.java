package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Conta;

public class ContaController {
	public static void main(String[] args) {
	
		Conta conta_1 = new Conta(1, 1.00);		
		Conta conta_2 = new Conta(2, 2000);
		Conta conta_3 = new Conta(3, 20000);
		Conta conta_4 = new Conta(4, 10000);
		Conta conta_5 = new Conta(5, 2000);
		
		System.out.println(conta_1);
		List<Conta> contas = new ArrayList<>();
		
		contas.add(conta_1);
		contas.add(conta_2);
		contas.add(conta_3);
		contas.add(conta_4);
		contas.add(conta_5);
		
		System.out.println("_____ Lista Ordenada _____");
		System.out.println(contas);
		
		System.out.println("_____ Busca por Id_____");		
		Conta contaBusca = contas.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
		System.out.println(contaBusca);
		
		Map<Integer, Conta> contasMap = new HashMap<>();
		contasMap.put(conta_1.getId(), conta_1);
		contasMap.put(conta_2.getId(), conta_2);
		contasMap.put(conta_3.getId(), conta_3);
		contasMap.put(conta_4.getId(), conta_4);
		contasMap.put(conta_5.getId(), conta_5);
		System.out.println("_____ Lista MAP _____");
		System.out.println(contasMap);
		
		System.out.println();
		System.out.println("_____ Busca por MAP_____");		
		System.out.println(contasMap.get(1));

		System.out.println(conta_1.getSaldo());
		conta_1.saca(1);
		conta_1.saca(1);
		System.out.println(conta_1.getSaldo());
		
	}
}
