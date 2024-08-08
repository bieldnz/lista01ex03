package controller;

public class ControllerFatorial {
	
	public ControllerFatorial() {
		super();
	}
	
	public int fatorial(int n) {
		if(n > 0) {
			int result = n * fatorial(n-1); // O result irá aguardar o retorno da função recursiva para realizar a multiplicação
			return result;
		}else {
			return 1; //A parada será quando o n chegar em 0
		}
	}
}
