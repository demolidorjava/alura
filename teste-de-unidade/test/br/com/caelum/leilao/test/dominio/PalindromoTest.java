package br.com.caelum.leilao.test.dominio;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Palindromo;
import junit.framework.Assert;

public class PalindromoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testarPalindromoComSucesso() {
		String frase = "Socorram-me subi no onibus em Marrocos";
		Palindromo palindromo = new Palindromo();
boolean ehPalindromo = palindromo.ehPalindromo(frase);

Assert.assertTrue(	ehPalindromo);
	}

}
