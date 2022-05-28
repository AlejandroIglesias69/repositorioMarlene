package marlene;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class pruebasUnitarias {
	private Trabajo trabajo;
	@BeforeEach
	void setUp() throws Exception {
		trabajo = new Trabajo();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("AREA TRIENAGULO")
	void areaTriangulo() {
		assertEquals(6,trabajo.areaTriangulo(4,3));//verificamos si la entrada cumple
	}
	@Test
	@DisplayName("PITAGORAS")
	void pitagoras() {
		assertEquals(4.47213595499958,trabajo.pitagoras(4,2));//verificamos si la entrada cumple
		//con la funcion Math.sqrt
		//assertFalse(false);si devuelve algo falso lo devueve
		//assertNull(trabajo);
	}
	@Test
	@DisplayName("TIPO DE TRIANGULO")
	void tipoTriangulo() {
		assertEquals("isoceles",trabajo.tipoTriangulo(4,4,2));//verificamos si la entrada cumple con el if en este caso con el else
		assertSame(trabajo, trabajo);//si la referencia de dos objetos son iguales solo hay uno
	}
	@Test
	@DisplayName("AUMENTO")
	void aumentoTotal() {
		assertEquals(10,trabajo.aumentoTotal(10,3));
		assertNotEquals(10,trabajo.aumentoTotal(11,3));//NO IGUALES 
		assertNotNull(trabajo.aumentoTotal(10,3));//NO NULOS SE PUEDE PONER SI ES NULL
	}
	@Test
	@DisplayName("ESMAYOR")
	void esMayor() {
		assertEquals(false,trabajo.esMayor(10,31));//retorna el bolleano false
		assertFalse(trabajo.esMayor(10,31));
		assertTrue(trabajo.esMayor(100,31));//las 3 maneras de verificar
	}
	@Test 
	void time() throws InterruptedException{
		int i = trabajo.time();
	}
}
