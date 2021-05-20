package control;


import java.util.ArrayList;
import java.util.List;

import model.AnimalP;
import model.CachorroP;
import model.PassaroP;
import model.PeixeP;

public class AnimalControllerP {
	public static void main(String[] args) {
	
		PeixeP peixe1 = new PeixeP();
		PeixeP peixe2 = new PeixeP(2, 2, 2);
		PeixeP peixe3 = new PeixeP(1, 1, 1);
		
		CachorroP cao1 = new CachorroP();
		CachorroP cao2 = new CachorroP(2, 2);
		CachorroP cao3 = new CachorroP(3, 3);
		
		PassaroP passaro1 = new PassaroP();
		PassaroP passaro2 = new PassaroP(1, 1, 1);
		PassaroP passaro3 = new PassaroP(2, 2, 2);
		
		List<AnimalP> animais = new ArrayList<>();
		animais.add(peixe1);
		animais.add(peixe2);
		animais.add(peixe3);
		animais.add(cao1);
		animais.add(cao2);
		animais.add(cao3);
		animais.add(passaro1);
		animais.add(passaro2);
		animais.add(passaro3);
		System.out.print("A_______ Lista Animais  _______\n\n");
		System.out.println(animais);
		
		System.out.print("B_______ Lista Animais Movimentados _______\n\n");
		animais.forEach(a -> {
			a.mover(2.0, 2.0);
			a.desenhar();
			System.out.print(a);
		});
		
		System.out.print("C_______ Lista Cachorros Movimentados _______\n\n");
		animais.forEach(a -> {
			if(a instanceof CachorroP) {
				a.mover(8.0, 8.0);
				a.desenhar();
				System.out.print(a);
			}
		});
		
		System.out.print("D_______ Lista Peixes e Passaros Movimentados _______\n\n");
		animais.forEach(a -> {
			if(a instanceof PeixeP) {
				//downcasting
				((PeixeP) a).mover(5.0, 5.0, 5.0);
				a.desenhar();
				System.out.print(a);
			} else if(a instanceof PassaroP) {
				if(a instanceof PassaroP) {
					//downcasting
					((PassaroP) a).mover(5.0, 5.0, 5.0);
					a.desenhar();
					System.out.print(a);
				}
			}
		});
	}
}
