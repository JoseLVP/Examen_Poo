package JoseL_Valcarcel_examenPOO;

public class Calculadora {

	private double Numero1;
	private double Numero2;
	
	
	public Calculadora(double numero1, double numero2) {
		
		this.Numero1 = numero1;
		this.Numero2 = numero2;
	}


	public double getNumero1() {
		return this.Numero1;
	}


	public void setNumero1(double numero1) {
		this.Numero1 = numero1;
	}


	public double getNumero2() {
		return this.Numero2;
	}


	public void setNumero2(double numero2) {
		this.Numero2 = numero2;
	}
	
	static double Sumar(double Valor1, double Valor2) {
		
		double Resultado;
		
		Resultado = Valor1 + Valor2;
		return Resultado;
	}
	
	static double Restar(double Valor1, double Valor2) {
		
		double Resultado;
		
		Resultado = Valor1 - Valor2;
		return Resultado;
	}
	
	static double Multiplicar(double Valor1, double Valor2) {
		
		double Resultado;
		
		Resultado = Valor1 * Valor2;
		return Resultado;
	}
	
	static double Dividir(double Valor1, double Valor2) {
		
		double Resultado;
		
		Resultado = Valor1 / Valor2;
		return Resultado;
	}
	
	static double Resto(double Valor1, double Valor2) {
		
		double Resultado;
		
		Resultado = Valor1 % Valor2;
		return Resultado;
	}
	
	static double Exponencial(double Valor1, double Valor2) {
		
		double Resultado;
		
		Resultado = Math.pow(Valor1, Valor2);
		return Resultado;
	}
}
