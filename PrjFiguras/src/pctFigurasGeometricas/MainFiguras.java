package pctFigurasGeometricas;

public class MainFiguras {

	public static void main(String[] args) {

		FiguraTriangulo triangulo = new FiguraTriangulo();
		triangulo.setAltura(10);
		triangulo.setBase(20);
		triangulo.calculaArea(triangulo.getBase(), triangulo.getAltura());
		
		System.out.println("Calculo da area do triangulo...");
		System.out.println("Altura = "+triangulo.getAltura());
		System.out.println("Base = "+triangulo.getBase());
		System.out.println("Area = "+triangulo.getArea());
		System.out.println();
		
		FiguraRetangulo retangulo = new FiguraRetangulo();
		retangulo.setAltura(10);
		retangulo.setBase(20);
		retangulo.calculaArea(retangulo.getBase(), retangulo.getAltura());
		
		System.out.println("Calculo da area do retangulo...");
		System.out.println("Altura = "+retangulo.getAltura());
		System.out.println("Base = "+retangulo.getBase());
		System.out.println("Area = "+retangulo.getArea());
	}
}
