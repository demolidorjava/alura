package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String nome = "Bala toff";
		double preco = 0.10;
		Produto produto = new Produto(nome, preco);
		System.out.println("O nome da bala é: " + produto.getNome());
		System.out.println("Seu preço é: " + produto.getPreco());
	}
}