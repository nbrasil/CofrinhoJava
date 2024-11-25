package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Cofrinho cofrinho = new Cofrinho();	
	
	Scanner teclado = new Scanner(System.in);
	int opcao; 
	int tipoMoeda;
	double valor;
	Moeda m;
	
	System.out.println("Menu:");
	System.out.println("1 - Adicionar moeda");
	System.out.println("2 - Remover moeda");
	System.out.println("3 - Lista de moedas");
	System.out.println("4 - Total convertido");
	System.out.println("0 - Encerrar");
	
	opcao = teclado.nextInt();
	
	//utilizando while e switch case para implementar o loop do programa e implementação dos métodos definidos na classe Cofrinho
	
	while (opcao!=0) {
		
		switch (opcao) {
		
		case 1:
			tipoMoeda = 0;
			while(tipoMoeda > 3 || tipoMoeda <= 0) {
				System.out.println("1 - Dólar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				tipoMoeda = teclado.nextInt();
			}
		
			System.out.println("Digite o valor: ");
			valor = teclado.nextDouble();
			
			m = null;
			if(tipoMoeda==1) {
				m = new Dolar(valor);
			}
			if (tipoMoeda==2) {
				m = new Euro(valor);
			}
			if (tipoMoeda==3) {
				m = new Real(valor);
			}
			
			cofrinho.adicionar(m);
			System.out.println("Moeda adicionada com sucesso!");
			System.out.print("Digite a próxima opção: ");
			opcao = teclado.nextInt();
			break;
			
		case 2:
			tipoMoeda = 0;
			while(tipoMoeda > 3 || tipoMoeda <= 0) {
				System.out.println("1 - Dólar");
				System.out.println("2 - Euro");
				System.out.println("3 - Real");
				tipoMoeda = teclado.nextInt();
			}
		
			System.out.println("Digite o valor: ");
			valor = teclado.nextDouble();
			
			m = null;
			if(tipoMoeda==1) {
				m =  new Dolar(valor);
			}
			if (tipoMoeda==2) {
				m = new Euro(valor);
			}
			if (tipoMoeda==3) {
				m = new Real(valor);
			}
			cofrinho.remover(m);
			System.out.print("Digite a próxima opção: ");
			opcao = teclado.nextInt();
			break;
		
		case 3:
			cofrinho.listagemMoedas();
			System.out.print("Digite a próxima opção: ");
			opcao = teclado.nextInt();
			break;
		
		case 4:
			cofrinho.totalConvertido();
			System.out.print("Digite a próxima opção: ");
			opcao = teclado.nextInt();
			break;
		
		default:
			System.out.println("Opção inválida! Tente novamente.");
			opcao = teclado.nextInt();
			break;
		}
		
	}
	
	
	
	

	}

}
