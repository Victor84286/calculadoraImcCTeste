	package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import control.ImcRules;

public class Tests {
	
	//feito por Victor Hugo Rocha
	//e William Fagundes
	
	ImcRules calc;
	
	@Before
	public void setup() {
		calc = new ImcRules();
	}
	
	//Adulto
	
	//Baixo peso muito grave
	@Test
	public void testeImcAdultoBaixopesomuitograveSuperior() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.75, 47.06, 21, "masculino"));
	}
	
	//Baixo peso grave
	@Test
	public void testeImcAdultoBaixpesograveInferior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.75, 49, 21, "masculino"));
	}
	@Test
	public void testeImcAdultoBaixpesograveSuperior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.75, 51.75, 21, "masculino"));
	}
	
	//Baixo peso
	@Test
	public void testeImcAdultoBaixopesoInferior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.75, 52.1, 21, "masculino"));
	}
	@Test
	public void testeImcAdultoBaixopesoSuperior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.75, 56.35, 21, "masculino"));
	}
	
	//Peso normal
	@Test
	public void testeImcAdultoPesonormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.75, 56.7, 21, "masculino"));
	}
	@Test
	public void testeImcAdultoPesonormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.75, 76.26, 21, "masculino"));
	}
	
	//Sobrepeso
	@Test
	public void testeImcAdultoSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 76.57, 21, "masculino"));
	}
	@Test
	public void testeImcAdultoSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 91.57, 21, "masculino"));
	}
	
	//Obesidade grau I
	@Test
	public void testeImcAdultoObesidadegrauIInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.75, 91.875, 21, "masculino"));
	}
	@Test
	public void testeImcAdultoObesidadegrauISuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.75, 106.88, 21, "masculino"));
	}
	
	//Obesidade grau II
	@Test
	public void testeImcAdultoObesidadegrauIIInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.75, 107.19, 21, "masculino"));
	}
	@Test
	public void testeImcAdultoObesidadegrauIISuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.75, 122.19, 21, "masculino"));
	}
	
	//Obesidade grau III
	@Test
	public void testeImcAdultoObesidadegrauIIIInferior() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.75, 122.5, 21, "masculino"));
	}
	
	//Idosos
	
	//Baixo peso
	@Test
	public void testeImcIdosoBaixopeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 60.93, 70, "masculino"));
	}
	
	//Peso normal
	@Test
	public void testeImcIdosoPesonormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.75, 67.4, 70, "masculino"));
	}
	@Test
	public void testeImcIdosoPesonormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.75, 82.68, 70, "masculino"));
	}
	
	//Sobrepeso
	@Test
	public void testeImcIdosoSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 82.99, 70, "masculino"));
	}
	@Test
	public void testeImcIdosoSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 91.87, 70, "masculino"));
	}
	
	//Obesidade grau I
	@Test
	public void testeImcIdosoObesidadegrauIInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.75, 92.18, 70, "masculino"));
	}
	@Test
	public void testeImcIdosoObesidadegrauISuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.75, 107.18, 70, "masculino"));
	}
	
	//Obesidade grau II
	@Test
	public void testeImcIdosoObesidadegrauIIInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.75, 107.49, 70, "masculino"));
	}
	@Test
	public void testeImcIdosoObesidadegrauIISuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.75, 122.19, 70, "masculino"));
	}
	
	//Obesidade grau III
	@Test
	public void testeImcIdosoObesidadegrauIIIInferior() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.75, 122.5, 70, "masculino"));
	}
	
	//Idosas
	
	//Baixo peso
	@Test
	public void testeImcIdosaBaixopesoSuperior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.75, 62.15, 70, "feminino"));
	}
	
	//Peso normal
	@Test
	public void testeImcIdosaPesonormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.75, 67.375, 70, "feminino"));
	}
	@Test
	public void testeImcIdosaPesonormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.75, 82.68, 70, "feminino"));
	}
	
	//Sobrepeso
	@Test
	public void testeImcIdosaSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 82.99, 70, "feminino"));
	}
	@Test
	public void testeImcIdosaSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.75, 98, 70, "feminino"));
	}
	
	//Obesidade grau I
	@Test
	public void testeImcIdosaObesidadegrauIInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.75, 98.31, 70, "feminino"));
	}
	@Test
	public void testeImcIdosaObesidadegrauISuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.75, 113.31, 70, "feminino"));
	}
	
	//Obesidade grau II
	@Test
	public void testeImcIdosaObesidadegrauIIInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.75, 113.62, 70, "feminino"));
	}
	@Test
	public void testeImcIdosaObesidadegrauIISuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.75, 128.31, 70, "feminino"));
	}
	
	//Obesidade grau III
	@Test
	public void testeImcIdosaObesidadegrauIIIInferior() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.75, 128.625, 70, "feminino"));
	}
}
