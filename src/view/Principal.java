package view;
import controller.ControllerFatorial;
public class Principal {
	public static void main(String[] args) {
		ControllerFatorial controllerFatorial = new ControllerFatorial();
		
		int numero = 5;
		
		int resultado = controllerFatorial.fatorial(numero);
		System.out.println(resultado);
		
	}
}
