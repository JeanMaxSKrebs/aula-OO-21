package control;

import java.util.ArrayList;
import java.util.List;

import model.DesenvolvedorHS;
import model.DesenvolvedorJuniorHS;
import model.DesenvolvedorPlenoHS;
import model.DesenvolvedorSeniorHS;
import model.FuncionarioHS;
import model.GerenteDesenvolvimentoHS;
import model.GerenteGeralHS;
import model.GerenteHS;

public class FuncionarioController {
	public static void main(String[] args) {
		DesenvolvedorHS funcionarioD_1 = new DesenvolvedorHS("Pedro", 5000);
		DesenvolvedorHS funcionarioD_2 = new DesenvolvedorHS();
		GerenteHS funcionarioG_1 = new GerenteHS("Maria", 4000);
		GerenteHS funcionarioG_2 = new GerenteHS();

		funcionarioD_2.setNome("João");
		funcionarioG_2.setNome("James");
		
		funcionarioD_2.setSalario(10000);
		funcionarioG_2.setSalario(8000);
			
		List<FuncionarioHS> funcionarios = new ArrayList<>();
		funcionarios.add(funcionarioD_1);
		funcionarios.add(funcionarioD_2);
		funcionarios.add(funcionarioG_1);
		funcionarios.add(funcionarioG_2);
		
		System.out.println("_____ Lista Funcionarios _____\n");
		System.out.println(funcionarios);
		
		System.out.println("_____ Lista Bonus dos Funcionarios _____\n");
		for (int i = 0; i < funcionarios.size(); i++) {			
			funcionarios.get(i).getBonus();
		}
		
		
		//2
		
		funcionarioG_1 = new GerenteGeralHS("Maria", 6500);
		funcionarioG_2 = new GerenteDesenvolvimentoHS("Diego", 4500);

		funcionarioD_1 = new DesenvolvedorSeniorHS("Sergio", 3500);
		funcionarioD_2 = new DesenvolvedorSeniorHS("Sergio", 3500);
		
		DesenvolvedorHS funcionarioD_3 = new DesenvolvedorSeniorHS("Sergio", 3500);
		DesenvolvedorHS funcionarioD_4 = new DesenvolvedorSeniorHS("Sergio", 3500);
		DesenvolvedorHS funcionarioD_5 = new DesenvolvedorSeniorHS("Sergio", 3500);
		DesenvolvedorHS funcionarioD_6 = new DesenvolvedorSeniorHS("Sergio", 3500);
		
		DesenvolvedorHS funcionarioD_7 = new DesenvolvedorPlenoHS("Pedro", 2500);
		DesenvolvedorHS funcionarioD_8 = new DesenvolvedorPlenoHS("Pedro", 2500);
		DesenvolvedorHS funcionarioD_9 = new DesenvolvedorPlenoHS("Pedro", 2500);
		DesenvolvedorHS funcionarioD_10 = new DesenvolvedorPlenoHS("Pedro", 2500);
		DesenvolvedorHS funcionarioD_11 = new DesenvolvedorPlenoHS("Pedro", 2500);
		DesenvolvedorHS funcionarioD_12 = new DesenvolvedorPlenoHS("Pedro", 2500);
		
		DesenvolvedorHS funcionarioD_13 = new DesenvolvedorJuniorHS("Jr", 1800);
		DesenvolvedorHS funcionarioD_14 = new DesenvolvedorJuniorHS("Jr", 1800);
		DesenvolvedorHS funcionarioD_15 = new DesenvolvedorJuniorHS("Jr", 1800);
		DesenvolvedorHS funcionarioD_16 = new DesenvolvedorJuniorHS("Jr", 1800);
		DesenvolvedorHS funcionarioD_17 = new DesenvolvedorJuniorHS("Jr", 1800);
		DesenvolvedorHS funcionarioD_18 = new DesenvolvedorJuniorHS("Jr", 1800);
		
		
		funcionarios.clear();
		funcionarios.add(funcionarioG_1);
		funcionarios.add(funcionarioG_2);
		
		funcionarios.add(funcionarioD_1);
		funcionarios.add(funcionarioD_2);
		funcionarios.add(funcionarioD_3);
		funcionarios.add(funcionarioD_4);
		funcionarios.add(funcionarioD_5);
		funcionarios.add(funcionarioD_6);
		funcionarios.add(funcionarioD_7);
		funcionarios.add(funcionarioD_8);
		funcionarios.add(funcionarioD_9);
		funcionarios.add(funcionarioD_10);
		funcionarios.add(funcionarioD_11);
		funcionarios.add(funcionarioD_12);
		funcionarios.add(funcionarioD_13);
		funcionarios.add(funcionarioD_14);
		funcionarios.add(funcionarioD_15);
		funcionarios.add(funcionarioD_16);
		funcionarios.add(funcionarioD_17);
		funcionarios.add(funcionarioD_18);

		
		System.out.println("_____ Lista Funcionarios _____\n");
		System.out.println(funcionarios);
		
		System.out.println("_____ Lista Bonus dos Funcionarios _____\n");
		for (int i = 0; i < funcionarios.size(); i++) {			
			funcionarios.get(i).getBonus();
		}
		
		System.out.println("_____ Lista Reajuste dos Funcionarios _____\n");
		for (int i = 0; i < funcionarios.size(); i++) {			
			funcionarios.get(i).reajuste(5);
		}
		
		
	}
}
