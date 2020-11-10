package Sistema;

public class Sistema {
	
	private String nomePizza;
	private double[] valorPizza = new double[10];
	private double diametro;
	
	private double area;
	private double raio;
	private double precocm2;
	private double menorPreco;
	
	
	//método construtor
	
	public Sistema() {
		
	}
	
	
	/**
	 * @author luana
	 * @param diametro
	 * @return area
	 */
	
	//método worker
	public double area(double diametro) {
		raio = diametro/2;
		area = 3.14*(raio*raio);
		return area;
	} 
	
	public double precocm2(double area, double valorPizza) {
		precocm2 = valorPizza/area;
		return precocm2;
	}
	
	public double menorPreco(double valorPizza, double area) {
		menorPreco = (precocm2*100)/area;
		return menorPreco;
	}
	
	/*
	public double diferencaPercentual(double menorPreco) {
		return null;
	}
	
	public double diferenca(double area, double valorPizza) {
		valorFatia = area/valorPizza;
		
		diferenca = valorFatia%area;
		
		return diferenca;
		
	}
	*/
}
