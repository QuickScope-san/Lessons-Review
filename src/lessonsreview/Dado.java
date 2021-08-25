package lessonsreview;

import java.util.Random;

public class Dado {
	
	private int caraVisible;
	private Random numeroAleatorio;
	
	public Dado(){
		
		caraVisible = 1;
		numeroAleatorio = new Random();
		
	}


	public int getCaraVisible() {
		
		caraVisible = numeroAleatorio.nextInt(6) + 1;
		
		return caraVisible;
		
	}
	
	
}
