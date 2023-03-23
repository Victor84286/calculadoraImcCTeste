package control;

public class ImcRules {

	//feito por Victor Hugo Rocha
	//e William Fagundes
	
	public String calcularImc(double altura, double peso,int idade,String sexo) {
		double resultado = peso / (altura * altura);
		
		//Adultos
		if (idade > 19 && idade <= 65) { 
			if (resultado < 16) {
				return "Baixo peso muito grave";
			}
			else if (resultado >= 16 && resultado < 17 ) {
				return "Baixo peso grave";
			}
			else if (resultado >= 17 && resultado < 18.5 ) {
				return "Baixo peso";
			}
			else if (resultado >= 18.50 && resultado < 25 ) {
				return "Peso normal";
			}
			else if (resultado >= 25 && resultado < 30 ) {
				return "Sobrepeso";
			}
			else if (resultado >= 30 && resultado < 35 ) {
				return "Obesidade grau I";
			}
			else if (resultado >= 35 && resultado < 40 ) {
				return "Obesidade grau II";
			}
			else if (resultado >= 40 ) {
				return "Obesidade grau III";
			}
		}
		//Idosos
		else if (idade > 65 && sexo.toLowerCase() == "masculino" ) { 
			if (resultado < 22) {
				return "Baixo peso";
			}
			else if (resultado >= 22 && resultado <= 27 ) {
				return "Peso normal";
			}
			else if (resultado > 27 && resultado <= 30 ) {
				return "Sobrepeso";
			}
			else if (resultado > 30 && resultado <= 35 ) {
				return "Obesidade grau I";
			}
			else if (resultado > 35 && resultado < 40 ) {
				return "Obesidade grau II";
			}
			else if (resultado >= 40 ) {
				return "Obesidade grau III";
			}
		}
		//Idosas
		else if (idade > 65 && sexo.toLowerCase() == "feminino" ) { 
			if (resultado < 22) {
				return "Baixo peso";
			}
			else if (resultado >=	 22 && resultado <= 27 ) {
				return "Peso normal";
			}
			else if (resultado > 27 && resultado <= 32 ) {
				return "Sobrepeso";
			}
			else if (resultado > 32 && resultado <= 37 ) {
				return "Obesidade grau I";
			}
			else if (resultado > 37 && resultado < 42 ) {
				return "Obesidade grau II";
			}
			else if (resultado >= 42 ) {
				return "Obesidade grau III";
			}
		}
		else if (idade < 19) {
			return "Pessoa menor de idade, calculo complexo";
		}
		
		return "Error";
	}
}