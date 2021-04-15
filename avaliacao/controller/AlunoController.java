package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aluno;

public class AlunoController {
	public static void main(String[] args) {
		
		Aluno aluno_1 = new Aluno();		
		Aluno aluno_2 = new Aluno();
		Aluno aluno_3 = new Aluno(3, "eu@gmail.com");
		Aluno aluno_4 = new Aluno(4, "ele@gmail.com");
		Aluno aluno_5 = new Aluno(5, 18995, "joel", "silva", "silvajoel@gmail.com");
		Aluno aluno_6 = new Aluno(6, 18996, "rosa", "silva", "silvarosa@gmail.com");

		
		aluno_1.setId(1);
		aluno_2.setId(2);
		aluno_1.setCpf(18991);
		aluno_2.setCpf(18992);
		aluno_3.setCpf(18993);
		aluno_4.setCpf(18994);
		aluno_1.setNome("jean");
		aluno_2.setNome("jana");
		aluno_3.setNome("jesus");
		aluno_4.setNome("juan");
		aluno_1.setSobrenome("juca");
		aluno_2.setSobrenome("banana");
		aluno_3.setSobrenome("filho de deus");
		aluno_4.setSobrenome("martines");
		aluno_1.setEmail("nos@gmail.com");
		aluno_2.setEmail("eles@gmail.com");



		
		int testeId = aluno_1.getId();
		int testeCpf = aluno_2.getCpf();
		String testeNome = aluno_3.getNome();
		String testeSobrenome = aluno_4.getSobrenome();
		String testeEmail = aluno_5.getEmail();
		int testeId2 = aluno_6.getId();
		
		System.out.println(testeId);
		System.out.println(testeCpf);
		System.out.println(testeNome);
		System.out.println(testeSobrenome);
		System.out.println(testeEmail);
		System.out.println(testeId2);
		
		
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(aluno_1);
		alunos.add(aluno_2);
		alunos.add(aluno_3);
		alunos.add(aluno_4);
		alunos.add(aluno_5);
		
		System.out.println("_____ Lista Alunos ordenada _____");
		System.out.println(alunos);
		
		System.out.println("_____ Busca por Id_____");		
		Aluno alunoBusca = alunos.stream().filter(a -> a.getId() == 5).findAny().orElse(null);
		System.out.println(alunoBusca);
		
		System.out.println("_____ Ordem decrescente por ID_____");		
		alunos.sort(Comparator.comparing(Aluno::getId).reversed());
		System.out.println(alunos);
		
		Map<Integer, Aluno> alunosMap = new HashMap<>();
		alunosMap.put(aluno_1.getId(), aluno_1);
		alunosMap.put(aluno_2.getId(), aluno_2);
		alunosMap.put(aluno_3.getId(), aluno_3);
		alunosMap.put(aluno_4.getId(), aluno_4);
		alunosMap.put(aluno_5.getId(), aluno_5);
		System.out.println("_____ Lista MAP _____");
		System.out.println(alunosMap);
		
		System.out.println();
		System.out.println("_____ Busca por MAP_____");		
		System.out.println(alunosMap.get(5));
	


	}
}
