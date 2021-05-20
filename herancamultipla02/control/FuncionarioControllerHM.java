package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.ClienteHM;
import model.DesenvolvedorHM;
import model.FuncionarioHM;
import model.GerenteHM;
import model.InvestidorHM;

public class FuncionarioControllerHM {
	public static void main(String[] args) {
		//a
		DesenvolvedorHM dev1 = new DesenvolvedorHM("Elis", 2500.00);
		DesenvolvedorHM dev2 = new DesenvolvedorHM("João", 2500.00);
		DesenvolvedorHM dev3 = new DesenvolvedorHM("Mario", 2500.00);
		DesenvolvedorHM dev4 = new DesenvolvedorHM("José", 2500.00);
		DesenvolvedorHM dev5 = new DesenvolvedorHM("Júlia", 2500.00);
		DesenvolvedorHM dev6 = new DesenvolvedorHM("Paula", 2500.00);
		List<DesenvolvedorHM> desenvolvedores = new ArrayList<>();
		desenvolvedores.add(dev1);
		desenvolvedores.add(dev2);
		desenvolvedores.add(dev3);
		desenvolvedores.add(dev4);
		desenvolvedores.add(dev5);
		desenvolvedores.add(dev6);
		System.out.println("A_____ Lista Desenvolvedores _____\n");
		System.out.println(desenvolvedores);		

		GerenteHM ger1 = new GerenteHM("Ana", 4500.00, "ALUP11", 500);
		GerenteHM ger2 = new GerenteHM("Rafal", 4500.00, "ALUP11", 1000);
		GerenteHM ger3 = new GerenteHM("Aline", 4500.00, "ALUP11", 1000);
		GerenteHM ger4 = new GerenteHM("Talita", 4500.00, "ALUP11", 1000);
		GerenteHM ger5 = new GerenteHM("Paulo", 6500.00, "ALUP11", 1000);
		GerenteHM ger6 = new GerenteHM("Cris", 6500.00, "ALUP11", 2000);
		List<GerenteHM> gerentes = new ArrayList<>();
		gerentes.add(ger1);
		gerentes.add(ger2);
		gerentes.add(ger3);
		gerentes.add(ger4);
		gerentes.add(ger5);
		gerentes.add(ger6);
		System.out.println("A_____ Lista Gerentes _____\n");
		System.out.println(gerentes);		
		
		ClienteHM cli1 = new ClienteHM(1, "João", "Dias", "ALUP11", 500);
		ClienteHM cli2 = new ClienteHM(2, "Tânia", "Pereira", "ALUP11", 1000);
		ClienteHM cli3 = new ClienteHM(3, "Mel", "Soares", "ALUP11", 1000);
		ClienteHM cli4 = new ClienteHM(4, "Luna", "Farias", "ALUP11", 1000);
		ClienteHM cli5 = new ClienteHM(5, "Maria", "Terra", "ALUP11", 1000);
		ClienteHM cli6 = new ClienteHM(6, "Pedro", "Santos", "ALUP11", 2000);
		List<ClienteHM> clientes = new ArrayList<>();
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		clientes.add(cli4);
		clientes.add(cli5);
		clientes.add(cli6);
		System.out.println("A_____ Lista Clientes _____\n");
		System.out.println(clientes);
		
		List<FuncionarioHM> funcionarios = new ArrayList<>();
		funcionarios.add(dev1);
		funcionarios.add(dev2);
		funcionarios.add(dev3);
		funcionarios.add(dev4);
		funcionarios.add(dev5);
		funcionarios.add(dev6);
		funcionarios.add(ger1);
		funcionarios.add(ger2);
		funcionarios.add(ger3);
		funcionarios.add(ger4);
		funcionarios.add(ger5);
		funcionarios.add(ger6);
		System.out.println("B_____ Lista Funcionarios _____\n");
		System.out.println(funcionarios);

		List<InvestidorHM> investidores = new ArrayList<>();
		investidores.add(cli1);
		investidores.add(cli2);
		investidores.add(cli3);
		investidores.add(cli4);
		investidores.add(cli5);
		investidores.add(cli6);
		investidores.add(ger1);
		investidores.add(ger2);
		investidores.add(ger3);
		investidores.add(ger4);
		investidores.add(ger5);
		investidores.add(ger6);
		System.out.println("B_____ Lista Investidores _____\n");
		System.out.println(investidores);
		
		funcionarios.sort(Comparator.comparing(FuncionarioHM::getSalario).reversed());
		System.out.println("C_____ Lista Funcionarios _____\n");
		System.out.println(funcionarios);
		
		System.out.println("C_____ Lista Clientes _____\n");
		investidores.sort(Comparator.comparing(InvestidorHM::getQuantidade).reversed());
		investidores.forEach(i -> {
			if(i instanceof ClienteHM) {
				System.out.print(i);
			}
		});
		
		System.out.println("C_____ Lista Investidores _____\n");
		System.out.println(investidores);		
		
		System.out.println("D_____ Lista Funcionario maior salário _____\n");
		FuncionarioHM highest_salario = Collections.max(funcionarios, Comparator.comparing(FuncionarioHM::getSalario));
		funcionarios.forEach(f -> {
			if(f.getSalario() >= highest_salario.getSalario())
				System.out.print(f);
			
		});
		System.out.println("D_____ Lista Investidor com mais ações _____\n");
		InvestidorHM biggest_acoes = Collections.max(investidores, Comparator.comparing(InvestidorHM::getQuantidade));
		investidores.forEach(i -> {
			if(i.getQuantidade() >= biggest_acoes.getQuantidade())
				System.out.print(i);
			
		});
		
		
	}
}
