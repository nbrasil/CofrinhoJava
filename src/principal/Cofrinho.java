package main;

import java.util.ArrayList;

public class Cofrinho {
	//lista de moedas
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	//get e set para lista privada
	public ArrayList<Moeda> getListaMoedas() {
		return listaMoedas;
	}


	public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	//método adicionar
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
		}
	
	//método para remover
	public boolean remover(Moeda m) {
		if (listaMoedas.isEmpty()) {
		   System.out.println("O cofrinho está vazio!");
		   return false;
		} else if (listaMoedas.contains(m)) {
		    listaMoedas.remove(m);
		    System.out.println("Moeda removida com sucesso!");
		    return true;
		} else {
		    System.out.println("Moeda não encontrada no cofrinho.");
		    return false;
		    }
		}
		
	
	//método para lista de moedas
	public void listagemMoedas() {
		
		for(Moeda m : listaMoedas) {
			System.out.println(m);
		}
		
	}
	
	//método para apresentar o valor total em real
	public void totalConvertido() {
		double total = 0;
        for (Moeda m : listaMoedas) {
            total += m.conversao();
        }
        System.out.println("Total convertido em Reais: R$" + total);

	}
	
	

}
