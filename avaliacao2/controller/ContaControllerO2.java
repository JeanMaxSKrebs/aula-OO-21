package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Aluno;
import model.AssociadoO2;
import model.AssociadoVipO2;
import model.ContaCorrenteO2;
import model.ContaO2;
import model.ContaPoupancaO2;

public class ContaControllerO2 {
	public static void main(String[] args) {
		//a e b
		ContaPoupancaO2 conta_1p = new ContaPoupancaO2(10000);		
		ContaPoupancaO2 conta_2p = new ContaPoupancaO2(20000);
		ContaPoupancaO2 conta_3p = new ContaPoupancaO2(30000);
		ContaCorrenteO2 conta_1c = new ContaCorrenteO2(1000);
		ContaCorrenteO2 conta_2c = new ContaCorrenteO2(1000);
		ContaCorrenteO2 conta_3c = new ContaCorrenteO2(1000);
		AssociadoO2 conta_1a = new AssociadoO2("joao");
		AssociadoO2 conta_2a = new AssociadoO2("jose");
		AssociadoO2 conta_3a = new AssociadoO2("juan");
		
		List<ContaO2> contas = new ArrayList<>();
		List<AssociadoO2> associados = new ArrayList<>();
		
		contas.add(conta_1p);
		contas.add(conta_2p);
		contas.add(conta_3p);
		contas.add(conta_1c);
		contas.add(conta_2c);
		contas.add(conta_3c);
		associados.add(conta_1a);
		associados.add(conta_2a);
		associados.add(conta_3a);
		
		System.out.println("_____ Contas _____");
		System.out.println(contas);
		System.out.println("_____ Associados _____");
		System.out.println(associados);
		
		// c
		System.out.println(conta_1p);
	
		conta_1p.deposita(1000);
		System.out.println(conta_1p);
	
		conta_1p.atualiza(5);
		System.out.println(conta_1p);
	
		conta_1p.saca(50);
		System.out.println(conta_1p);
		
		// d
		System.out.println(conta_1c);
	
		conta_1c.deposita(500);
		System.out.println(conta_1c);
	
		conta_1c.saca(400);
		System.out.println(conta_1c);
		
		// e
		List<AssociadoVipO2> associadosVip = new ArrayList<>();
	
		associadosVip.add(conta_1c);
		associadosVip.add(conta_2c);
		associadosVip.add(conta_3c);
		associadosVip.add(conta_1a);
		associadosVip.add(conta_2a);
		associadosVip.add(conta_3a);
		
		conta_1c.setQdeCotas(100);
		conta_2c.setQdeCotas(400); 
		conta_3c.setQdeCotas(600);
		conta_1a.setQdeCotas(300);
		conta_2a.setQdeCotas(600);
		conta_3a.setQdeCotas(600);
		
		System.out.println("_____ Associados Vip _____");
		System.out.println(associadosVip);
		
		// f
		
		System.out.println("_____ Associados Vip Ordem decrescente por Cotas_____");		
		associadosVip.sort(Comparator.comparing(AssociadoVipO2::getQdeCotas).reversed());
		System.out.println(associadosVip);
	
		double resultado = 0;
		List<AssociadoVipO2> associadosVipMaiores = new ArrayList<>();

		for (int i = 0; i < associadosVip.size(); i++) {
			if(associadosVip.get(i).getQdeCotas() > resultado)
				resultado = associadosVip.get(i).getQdeCotas();
		}
		for (int i = 0; i < associadosVip.size(); i++) {
			if(associadosVip.get(i).getQdeCotas() == resultado)
				associadosVipMaiores.add(associadosVip.get(i));
		}
		System.out.println("_____ Maior Cota _____");
		System.out.println(resultado);
		System.out.println("_____ Associado(s) Vip com Maior Cota _____");
		System.out.println(associadosVipMaiores);
		
		
		// g
		
		System.out.println("_____ Contas Ordem decrescente por Saldo _____");
		contas.sort(Comparator.comparing(ContaO2::getSaldo).reversed());
		System.out.println(contas);
		
		System.out.println("_____ Associados _____");
		for (int i = 0; i < associados.size(); i++) {
			if(associados.get(i) instanceof AssociadoVipO2) {
				System.out.println(associados.get(i));
			}
		}
		resultado = 0;
		List<ContaO2> maioresSaldos = new ArrayList<>();

		for (int i = 0; i < contas.size(); i++) {
			if(contas.get(i).getSaldo() > resultado)
				resultado = contas.get(i).getSaldo();
		}
		for (int i = 0; i < contas.size(); i++) {
			if(contas.get(i).getSaldo() == resultado)
				maioresSaldos.add(contas.get(i));
		}
		
		System.out.println("_____ Maior Saldo _____");
		System.out.println(resultado);
		System.out.println("_____ Conta(s) com Maior Slado _____");
		System.out.println(maioresSaldos);
	}
}
