package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Modelo;

public class ModeloController {
	public static void main(String[] args) {
		
		Modelo modelo_1 = new Modelo();
		Modelo modelo_2 = new Modelo(1, "Uno");
		Modelo modelo_3 = new Modelo(2, "Uno");
		Modelo modelo_4 = new Modelo(3, "C3");
		Modelo modelo_5 = new Modelo(4, "C3");
	
		List<Modelo> modelos = new ArrayList<>();
		modelos.add(modelo_1);
		modelos.add(modelo_2);
		modelos.add(modelo_3);
		modelos.add(modelo_4);
		modelos.add(modelo_5);
		System.out.println("_____ Lista Modelos _____");
		System.out.println(modelos);
		
		System.out.println("_____ Busca Modelos por Id_____");
		Modelo modeloBusca = modelos.stream().filter(m -> m.getId() == 3).findAny().orElse(null);
		System.out.println(modeloBusca);
		
		Map<Integer, Modelo> modelosMap = new HashMap<>();
		modelosMap.put(modelo_1.getId(), modelo_1);
		modelosMap.put(modelo_2.getId(), modelo_2);
		modelosMap.put(modelo_3.getId(), modelo_3);
		modelosMap.put(modelo_4.getId(), modelo_4);
		modelosMap.put(modelo_5.getId(), modelo_5);

		System.out.println("_____ MAP _____");
		System.out.println(modelosMap);

		
		System.out.println();
		System.out.println("_____ MAP busca por Id_____");
		System.out.println(modelosMap.get(3));
		
	}
}
