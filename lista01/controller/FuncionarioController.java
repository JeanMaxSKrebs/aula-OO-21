package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Funcionario;

public class FuncionarioController {
	
	public static void main(String[] args) {
		Funcionario funcionario_1 = new Funcionario("José", 10000.00);		
		Funcionario funcionario_2 = new Funcionario("João", 10000.00);
		Funcionario funcionario_3 = new Funcionario("Pedro", 1000.00);
		Funcionario funcionario_4 = new Funcionario("Pietra", 3000.00);
		Funcionario funcionario_5 = new Funcionario("Manoela", 6000.00);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(funcionario_1);
		funcionarios.add(funcionario_2);
		funcionarios.add(funcionario_3);
		funcionarios.add(funcionario_4);
		funcionarios.add(funcionario_5);
		
		System.out.println("_____ Lista Original _____");
		System.out.println(funcionarios);
		
		funcionarios.sort(Comparator.comparing(Funcionario::getNome));
		
		System.out.println("_____ Lista Ordenada _____");
		System.out.println(funcionarios);
		
		System.out.println("_____ Pesquisa _____");
		
		funcionarios.forEach(f -> {
			if(f.getNome().equals("José")) {
				System.out.println(f);
			}
		});
		
		Funcionario funcionarioBusca = funcionarios.stream().filter(f-> f.getNome().equals("João")).findAny().orElse(null);
		System.out.println(funcionarioBusca);
	}
}
