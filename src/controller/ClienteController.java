package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Cliente;
import model.Marca;

public class ClienteController {
	public static void main(String[] args) {
		Cliente cliente_1 = new Cliente();
		Cliente cliente_2 = new Cliente("2", "Ana", "da Silva", "Rua das Flores, 10", "96000700", "5395551234", "ana@email.com"); //utilizando o construtor parametrizado
		Cliente cliente_3 = new Cliente("3", "Gabriel", "da Silva", "Rua das Flores, 10", "96000700", "5395554433", "gabriel@email.com");
		Cliente cliente_4 = new Cliente("4", "Antonia", "Soares", "Rua das Flores, 10", "96000700", "5395557890", "antonia@email.com");
		Cliente cliente_5 = new Cliente("4", "Antonha", "Soares", "Rua das Flores, 10", "96000700", "5395557890", "antonia@email.com");

		cliente_1.setCpf("1");
		cliente_1.setNome("Maria");
		cliente_1.setSobrenome("dos Santos");
		cliente_1.setEndereco("Rua dos Santos, 1");
		cliente_1.setCep("96700000");
		cliente_1.setTelefone("5395559876");
		cliente_1.setEmail("maria@email.com");
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente_1);
		clientes.add(cliente_2);
		clientes.add(cliente_3);
		clientes.add(cliente_4);
		clientes.add(cliente_5);
		System.out.println("_____ Lista Clientes _____");
		System.out.println(clientes);

		System.out.println("_____ Busca Cliente por Id_____");
		Cliente ClienteBusca = clientes.stream().filter(c -> c.getCpf().equals("3")).findAny().orElse(null);
		System.out.println(ClienteBusca);
		
		Map<String, Cliente> marcasMap = new HashMap<>();
		marcasMap.put(cliente_1.getCpf(), cliente_1);
		marcasMap.put(cliente_2.getCpf(), cliente_2);
		marcasMap.put(cliente_3.getCpf(), cliente_3);
		marcasMap.put(cliente_4.getCpf(), cliente_4);
		marcasMap.put(cliente_5.getCpf(), cliente_5);
		System.out.println("_____ MAP _____");
		System.out.println(marcasMap);

		
		System.out.println();
		System.out.println("_____ MAP busca por Id_____");
		System.out.println(marcasMap.get("3"));
	}
}
