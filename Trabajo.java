package marlene;


public class Trabajo {
	
	public float areaTriangulo(int base, int altura) {
		return base*altura/2;
	}
	
	public double pitagoras (int cateto1, int cateto2) {
		return (Math.sqrt(cateto1*cateto1+cateto2*cateto2));
	}
	
	public String tipoTriangulo(int l1, int l2, int l3) {
		String tipo="";
		if (l1==l2 && l2==l3) 
			tipo="equilatero";
		else {
			if (l1==l2 || l1==l3 || l2==l3)
				tipo="isoceles";
			else
				tipo="escaleno";
		}
		return tipo;
	}
	
	public double aumentoTotal(int cantidad, int porcentaje) {
		return cantidad *(1+porcentaje/100);
	}
	
	public boolean esMayor(int valor1, int valor2) {
		boolean res;
		if (valor1>valor2) res=true;
		else res=false;
		return res;
	}
	public int time() throws InterruptedException{
		Thread.sleep(1000);
		return 1;
	}
}
