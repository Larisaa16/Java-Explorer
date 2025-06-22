

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestBasics {

	@Test
    public void testDefineString() {
		String prenume = null;
		//TODO 1: Declara o variabila de tip String cu numele prenume fara a o initializa cu o valoare
		assertNull(prenume);
	}
	
	@Test
	void testInitString() {
		//TODO 2: Creeaza o variabila de tip String cu numele prenume si initializeaz-o cu valoarea "Maria"
		String prenume="Maria";
		assertEquals("Maria", prenume);
	}
	
	@Test
	void testConcatenation() {
		String salut="Hello World"+" Andrei";
		//TODO 3: Creeaza o variabila cu numele salut si initializeaz-o cu conctatenarea dintre "Hello World " si "Andrei"
		assertEquals("Hello World Andrei", salut);
	}
	
	@Test
	void testInteger() {
		Integer varsta=20;
		//TODO 4: Creaza o variabila de tip Integer numita varsta si atribuie-i valoarea varstei tale
		assertNotNull(varsta);
	}
	
	@Test
	void testBoolean() {
		boolean casatorita=false;
		//TODO 5: Creaza o variabila de tip boolean cu numele casatorita si atribuie-i valoarea de adevar false
		assertFalse(casatorita);
	}

}
