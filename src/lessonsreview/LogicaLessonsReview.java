package lessonsreview;

public class LogicaLessonsReview {
	
	private Dado dado1;
	private Dado dado2;
	
	private int tiro, punto, estado;
	
	private boolean lanzamiento;
	
	private int [] carasDados;
	
	public LogicaLessonsReview() {
		
		dado1 = new Dado();
		dado2 = new Dado();
		
		carasDados = new int[2];
		
		lanzamiento = true;
		
	}
	
	public void calcularTiro() {
		
		carasDados[0] = dado1.getCaraVisible();
		carasDados[1] = dado2.getCaraVisible();
		
		tiro = carasDados[0] + carasDados[1];
		
	}
	
	public void estadoJuego() {
		
		if(lanzamiento) {
			
			switch (tiro) {
			case 2:
				
				estado = 2; //Lose
				
				break;
				
			case 3:
				
				estado = 2; //Lose
				
				
				break;
				
			case 12:
				
				estado = 2; //Lose
				
				
				break;
				
			}
			
			if((tiro == 7) || (tiro == 11)) {
				
				estado = 1; //Win
				
				
			} else if((tiro != 2) && (tiro != 3) && (tiro != 12) && (tiro != 7) && (tiro != 11)){
				
				estado = 3;
				punto = tiro;
				lanzamiento = false;
				
			}
			
		} else {
			
			rondaPunto();
			
		}
		
	}

	private void rondaPunto() {
		
		if(tiro == punto) {
			
			estado = 1;
			
			lanzamiento = true;
			
		} else {
			
			if(tiro == 7) {
				
				estado = 2;
				
				lanzamiento = true;
				
			}
			
		}
		
	}

	public int getTiro() {
		
		return tiro;
		
	}

	public int getPunto() {
		
		return punto;
		
	}

	public int getEstado() {
		
		return estado;
		
	}

	public int[] getCarasDados() {
		
		return carasDados;
		
	}
	
	

}
