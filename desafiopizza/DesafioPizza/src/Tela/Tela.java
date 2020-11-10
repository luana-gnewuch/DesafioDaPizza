package Tela;

import java.util.Scanner;

import Sistema.Sistema;

public class Tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Sistema sistema = new Sistema();
		
		double menor = 300;
		int qtd;
		String nomePizza = "";
		
		System.out.println("Quantas pizzas deseja comparar?");
		qtd = sc.nextInt();
		
		double valorPizza[] = new double[qtd];
		
		/**
		 * @author luana
		 */
		
			System.out.println("------------MENU DE PIZZAS------------");
			System.out.println("NOME          TAMANHO            PREÇO");
			System.out.println("Broto          20 cm            R$18,00");
			System.out.println("Média          30 cm            R$27,00");
			System.out.println("Grande         36 cm            R$32,00");
			System.out.println("Gigante        46 cm            R$40,00");
		
			
			
			for (int i = 0; i < qtd; i++) {
				System.out.println("Insira o nome da pizza: ");
				nomePizza = sc.next();
				System.out.println("Insira o diâmetro da pizza: ");
				double diametro = sc.nextDouble();
				System.out.println("Insira o valor da pizza: ");
				valorPizza[i] = sc.nextDouble();
				
				
			}
			
			for (int j = 0; j < valorPizza.length; j++) {
				if(valorPizza[j] < menor){
					menor = valorPizza[j];
				}
				System.out.println("A de melhor custo benefício é a: " + nomePizza + " R$" + menor);

			
			}
			/*
			double area = sistema.area(diametro);
			System.out.println("Área da pizza: " + area + "cm2");
			
			double precocm2 = sistema.precocm2(area, valorPizza);
			System.out.println("Preço por cm2: " + precocm2);
			*/
			
	}

}
