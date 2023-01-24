package Uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		System.out.println("Cofrinho:");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular Total Convertido para Real");
		System.out.println("0 - Encerrar");
		opcao = teclado.nextInt();
		
		Cofrinho cofrinho = new Cofrinho();
		
		int tipoDeMoeda;
		Moeda cof;
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				tipoDeMoeda = 0;
				while(tipoDeMoeda > 3 || tipoDeMoeda <= 0) {
					System.out.println("Escolha Moeda:");
					System.out.println("1 - Real:");
					System.out.println("2 - Dolar:");
					System.out.println("3 - Euro:");
					tipoDeMoeda = teclado.nextInt();
				}
				
				cof = null;
				if(tipoDeMoeda == 1) {
					System.out.println("Digite o Valor:");
					double valor = teclado.nextDouble();
					cof = new Real(valor);
				}
				if(tipoDeMoeda == 2) {
					System.out.println("Digite o Valor:");
					double valor = teclado.nextDouble();
					cof = new Dolar(valor);
				}
				if(tipoDeMoeda == 3) {
					System.out.println("Digite o Valor:");
					double valor = teclado.nextDouble();
					cof = new Euro(valor);
				}
				
				cofrinho.adicionar(cof);
				
				break;
			case 2:
				tipoDeMoeda = 0;
				while(tipoDeMoeda > 3 || tipoDeMoeda <= 0) {
					System.out.println("Escolha Moeda:");
					System.out.println("1 - Real:");
					System.out.println("2 - Dolar:");
					System.out.println("3 - Euro:");
					tipoDeMoeda = teclado.nextInt();
				}
				
				cof = null;
				if(tipoDeMoeda == 1) {
					System.out.println("Digite o Valor:");
					double valor = teclado.nextDouble();
					cof = new Real(valor);
				}
				if(tipoDeMoeda == 2) {
					System.out.println("Digite o Valor:");
					double valor = teclado.nextDouble();
					cof = new Dolar(valor);
				}
				if(tipoDeMoeda == 3) {
					System.out.println("Digite o Valor:");
					double valor = teclado.nextDouble();
					cof = new Euro(valor);
				}
				
				cofrinho.remover(cof);
				break;
			case 3:
				cofrinho.listagemMoedas();
				break;
			case 4:
				cofrinho.totalConvertido();
				break;
			default:
				System.out.println("Opcao Invalida!");
			}
			
			System.out.println("Cofrinho:");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular Total Convertido para Real");
			System.out.println("0 - Encerrar");
			opcao = teclado.nextInt();
		}
	}

}
