package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;

}
	
	
// Aumantar o valor do carro 
	void atualizarValor(double porcentagem) {
		valor *= (1 + porcentagem);
	}
 // Criar um método que calcula e retorna o valor do seguro do carro
	// Seguro do carro e baseado no valor, 5% do valor do carro
	
	double calcularSeguro() {
		double seguro = valor * 0.05;
		return seguro;
	}
		
	//Criar um metodo que recebe a quantidade de parcelas, calcula e retorna
	//o valor da parcela do seguro
		
 public double valorParcela(int quantParcela, double seguro) {
	double valorParcela = seguro / quantParcela;
	return valorParcela;
	
	}

	
}
	
