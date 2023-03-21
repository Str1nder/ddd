package br.com.fiap.motors.model;

public class View {

	//main -> CTRL + espaco
	public static void main(String[] args) {
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		
		//Exibir a idade
		System.out.println("Idade do carro: " + i);
		
		
		// Aumentar o valor do carro em 20%
		gol.atualizarValor(0.2);
		
		//Exibir o valor do carro
		System.out.println("Valor do carro: " + gol.valor);
		
		//Calcular e exibir o valor do seguro
		double seguro = gol.calcularSeguro();
		System.out.println("Valor do seguro: " + seguro);
		
		//calcular e exibir o valor da parcela do seguro
		double valorParcela = gol.valorParcela(3, seguro);
		System.out.println("Valor da parcela(3): " + valorParcela);
		
	
	
		
	}
}