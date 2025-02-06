package actividades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static actividades.A4_1.contarPalabras;
import static actividades.A4_1. contarLetrasDiferentes;
import static actividades.A4_1.contarFrecuenciaLetras;
import static actividades.A4_1.esPalindroma;

class tets {

	@Test
	void testContarPalabra() {
		assertEquals(0,contarPalabras(" "));
		assertNotEquals(1,contarPalabras(" "));
		assertEquals(2,contarPalabras("hol buneas"));
	}
	
	@Test
	void testContarLetrasDiferentes() {
		assertEquals(5,contarLetrasDiferentes("palabra")) ;
		assertEquals(0,contarLetrasDiferentes(" "));
		assertEquals(2,contarLetrasDiferentes("ae"));
		assertEquals(0,contarLetrasDiferentes(null));
	}
	/*
	@Test
	void testContarFrecunciaLetras() {
	}
	*/
	
	@Test 
	void testEsPalindroma() {
		assertEquals(false,esPalindroma(null));
		assertEquals(true,esPalindroma("ANA"));
		assertEquals(false,esPalindroma(""));
		assertEquals(false,esPalindroma(" ANA"));
		assertEquals(false,esPalindroma("aNA"));
		assertEquals(false,esPalindroma(" ANA " ));
	}
}
