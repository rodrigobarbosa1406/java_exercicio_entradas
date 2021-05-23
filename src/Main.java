import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual exercício você quer ver? ");
		int exercicio = sc.nextInt();
		
		switch (exercicio) {
		case 1:
			exercicio01();
			break;
		case 2:
			exercicio02();
			break;
		case 3:
			exercicio03();
			break;
		case 4:
			exercicio04();
			break;
		case 5:
			exercicio05();
			break;
		case 6:
			exercicio06();
			break;
		}
		
		sc.close();

	}
	
	public static void exercicio01() {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
	
	public static void exercicio02() {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2.00);
		
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
	}
	
	public static void exercicio03() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int produto = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + produto);
		
		sc.close();
	}
	
	public static void exercicio04() {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		sc.close();
	}
	
	public static void exercicio05() {
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int qtdePeca1 = sc.nextInt();
		double vlrUnitPeca1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int qtdePeca2 = sc.nextInt();
		double vlrUnitPeca2 = sc.nextDouble();
		
		double valorPagar = (vlrUnitPeca1 * qtdePeca1) + (vlrUnitPeca2 * qtdePeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);
		
		sc.close();
	}
	
	public static void exercicio06() {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		
		double A = sc.nextFloat();
		double B = sc.nextFloat();
		double C = sc.nextFloat();
		
		double resultadoA = (A * C) / 2;
		double resultadoB = (pi * Math.pow(C, 2.00));
		double resultadoC = (((A + B) / 2.0) * C);
		double resultadoD = Math.pow(B, 2.0);
		double resultadoE = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", resultadoA);
		System.out.printf("CIRCULO: %.3f\n", resultadoB);
		System.out.printf("TRAPEZIO: %.3f\n", resultadoC);
		System.out.printf("QUADRADO: %.3f\n", resultadoD);
		System.out.printf("RETANGULO: %.3f\n", resultadoE);
		
		sc.close();
	}

}
