package control;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.AutomovelHM;
import model.BicicletaHM;
import model.CarroHM;
import model.FuncionarioHS;
import model.Veiculo;
import model.VeiculoHM;
import model.CaminhaoHM;

public class VeiculoControllerHM {

	public static void main(String[] args) {

		
		BicicletaHM bicicleta_1 = new BicicletaHM();
		BicicletaHM bicicleta_2 = new BicicletaHM(20, "humana", "Caloi", "Super aaa", 2021, 29, "aa123456");
		BicicletaHM bicicleta_3 = new BicicletaHM(20, "humana", "Caloi", "Super aab", 2021, 29, "aa123456");
		BicicletaHM bicicleta_4 = new BicicletaHM(20, "elétrica", "Monark", "Super aaa", 2021, 29, "aa123456");
		BicicletaHM bicicleta_5 = new BicicletaHM(15, "2000");
		
		CarroHM carro_1 = new CarroHM();
		CarroHM carro_2 = new CarroHM(10, "5000", "2000", "ABC3592");
		CarroHM carro_3 = new CarroHM(10, "5000", "2000", "ABC3592");
		CarroHM carro_4 = new CarroHM(10, "5000", "2000", "ABC3592");
		CarroHM carro_5 = new CarroHM(10, "5000", "2000", "ABC3592");
		
		CaminhaoHM caminhao_1 = new CaminhaoHM();		

		CaminhaoHM caminhao_2 = new CaminhaoHM(5, "Diesel", "Scania", "CCC", 2012, 45, "043213", "AAA245FDE", "IAA6789");
		CaminhaoHM caminhao_3 = new CaminhaoHM(5, "Diesel", "Scania", "CCC", 2012, 45, "043213", "AAA245FDE", "IAA6789");
		CaminhaoHM caminhao_4 = new CaminhaoHM(5, "Diesel", "Scania", "CCC", 2012, 45, "043213", "AAA245FDE", "IAA6789");
		CaminhaoHM caminhao_5 = new CaminhaoHM(10, "5000", "2000", "ABC3592");
		
		List<VeiculoHM> veiculos = new ArrayList<>();
		veiculos.add(bicicleta_1);
		veiculos.add(bicicleta_2);
		veiculos.add(bicicleta_3);
		veiculos.add(bicicleta_4);
		veiculos.add(bicicleta_5);
		veiculos.add(carro_1);
		veiculos.add(carro_2);
		veiculos.add(carro_3);
		veiculos.add(carro_4);
		veiculos.add(carro_5);
		veiculos.add(caminhao_1);
		veiculos.add(caminhao_2);
		veiculos.add(caminhao_3);
		veiculos.add(caminhao_4);
		veiculos.add(caminhao_5);
		
		System.out.println("_____ Lista Veículos _____\n");
		System.out.println(veiculos);
		
//		System.out.println("_____ Lista Veículos _____\n");
//		for (int i = 0; i < funcionarios.size(); i++) {			
//			funcionarios.get(i).getBonus();
//		}
		
		veiculos.sort(Comparator.comparing(VeiculoHM::getAnoFabricacao));
		
		System.out.println("A_____ Lista Veículos por Ano Fabricação _____\n");
		System.out.println(veiculos);

		
		veiculos.sort(Comparator.comparing(VeiculoHM::getAnoFabricacao));
		List<VeiculoHM> veiculos_af = new ArrayList<>();
		int contBicicletas = 0;
		for (int i = 0; i < veiculos.size(); i++) {			
			if(veiculos.get(i) instanceof AutomovelHM) {
				veiculos_af.add(veiculos.get(i));
			} else
				contBicicletas++;
		}
		System.out.println("B_____ Lista Automóveis por Ano Fabricação _____\n");
		System.out.println(veiculos_af);
		System.out.println("Quantidade de Outros: "+contBicicletas);
		
		
		
		veiculos.sort(Comparator.comparing(VeiculoHM::getAnoFabricacao));
		veiculos_af = new ArrayList<>();
		int cont = 0;
		for (int i = 0; i < veiculos.size(); i++) {			
			if(veiculos.get(i) instanceof AutomovelHM) {
				cont++;
			} else
				veiculos_af.add(veiculos.get(i));
		}
		System.out.println("C_____ Lista Bicicletas por Ano Fabricação _____\n");
		System.out.println(veiculos_af);
		System.out.println("Quantidade de Outros: "+cont);

		
		System.out.println("D_____ Lista Automovel na busca por I ou i _____\n");

		veiculos.forEach(v -> {
			if (v instanceof AutomovelHM) {
				String a = ((AutomovelHM) v).getPlaca();
				if(a != null) {
					if( a.startsWith("I") || a.startsWith("i") ) {
						System.out.print(v);
					}	
				}
			}
		});

		
		
		
		
		
	}
}
