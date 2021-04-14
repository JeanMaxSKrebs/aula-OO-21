package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Locacao;
import model.Veiculo;

public class LocacaoController {
	public static void main(String[] args) {
		Locacao locacao_1= new Locacao(1, new GregorianCalendar(2021, 2, 10, 10, 00), new GregorianCalendar(2021, 2, 17, 18, 00), 10000, 0.00, 180.00, true);
		Locacao locacao_2= new Locacao(2, new GregorianCalendar(2021, 2, 10, 10, 00), new GregorianCalendar(2021, 2, 17, 18, 00), 10000, 0.00, 10.00, true);
		Locacao locacao_3= new Locacao(3, new GregorianCalendar(2021, 2, 10, 10, 00), new GregorianCalendar(2021, 2, 17, 18, 00), 10000, 0.00, 190.00, true);
		Locacao locacao_4= new Locacao(4, new GregorianCalendar(2021, 2, 10, 10, 00), new GregorianCalendar(2021, 2, 17, 18, 00), 10000, 0.00, 20.00, true);
		Locacao locacao_5= new Locacao(5, new GregorianCalendar(2021, 2, 10, 10, 00), new GregorianCalendar(2021, 2, 17, 18, 00), 10000, 0.00, 100.00, true);
		List<Locacao> locacoes= new ArrayList<>();
		locacoes.add(locacao_1);
		locacoes.add(locacao_2);
		locacoes.add(locacao_3);
		locacoes.add(locacao_4);
		locacoes.add(locacao_5);
		
		System.out.println("_____ Lista de Locacões _____");
		System.out.println(locacoes);
				
		locacoes.sort(Comparator.comparing(Locacao::getValorLocacao));
		System.out.println("_____ Lista Locacões por Valor _____");
		System.out.println(locacoes);
		
		System.out.println("_____ Busca por Id _____");
		Locacao locacoesBusca = locacoes.stream().filter(v -> v.getId().equals(5)).findAny().orElse(null);
		System.out.println(locacoesBusca);
		
		//Map

		Map<Integer, Locacao> locacoesMap = new HashMap<>();
		locacoesMap.put(locacao_1.getId(), locacao_1);
		locacoesMap.put(locacao_2.getId(), locacao_2);
		locacoesMap.put(locacao_3.getId(), locacao_3);
		locacoesMap.put(locacao_4.getId(), locacao_4);
		locacoesMap.put(locacao_5.getId(), locacao_5);

		System.out.println("_____ MAP _____");
		System.out.println(locacoesMap);
		
		System.out.println("Localiza no MAP");
		System.out.println(locacoesMap.get(locacao_3.getId()));
		
		
	}

}
