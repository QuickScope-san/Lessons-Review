package lessonsreview;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VistaConsola {
	
	private LogicaLessonsReview logicaDados;
	
	private String pregunta;
	
	private Scanner readMessage;
	
	public VistaConsola() {
		
		logicaDados = new LogicaLessonsReview();
		
		readMessage = new Scanner(System.in);
		
	}
	
	public void iniciarJuego() {
		
		int[] dados = new int[2];
		boolean continuaRonda = true;
		boolean pierdePorAbandono = false;
		
		JOptionPane.showMessageDialog(null, "¿Desea hacer su primer lanzamiento? (y/n)");
		pregunta = readMessage.nextLine();
		
		if(pregunta.equalsIgnoreCase("y")) {
			
			logicaDados.calcularTiro();
			
			dados = logicaDados.getCarasDados();
			
		} else {
			
			System.exit(0);
			
		}
		
		logicaDados.estadoJuego();
			
		switch (logicaDados.getEstado()) {
			
		case 1:
				
			JOptionPane.showMessageDialog(null, "Dado 1: "+ dados[0] +" Dado 2: "+ dados[1] +
					" Tiro: "+ logicaDados.getTiro());
			
			JOptionPane.showMessageDialog(null, "¡Ganaste!, ¿deseas seguir jugando"
					+ " en una nueva partida? (y/n)");
			
			pregunta = readMessage.nextLine();
			
			if(pregunta.equalsIgnoreCase("y")) {
			
				seguirJugando();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Cya!");
				
			}
			
			break;
				
		case 2:
				
			JOptionPane.showMessageDialog(null, "Dado 1: "+ dados[0] +" Dado 2: "+ dados[1] +
					" Tiro: "+ logicaDados.getTiro());
			
			JOptionPane.showMessageDialog(null, "¡Perdiste!, ¿deseas seguir jugando "
					+ "en una nueva partida? (y/n)");
			
			pregunta = readMessage.nextLine();
			
			if(pregunta.equalsIgnoreCase("y")) {
			
				seguirJugando();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Cya!");
				
			}
			
			break;	
				
		default:
		
			do {
				
				JOptionPane.showMessageDialog(null, "Dado 1: "+ dados[0] +" Dado 2: "+ dados[1] +
						" Tiro: "+ logicaDados.getTiro());
				
				if(logicaDados.getEstado() == 1) {
					
					JOptionPane.showMessageDialog(null, "¡Ganaste!, ¿deseas seguir jugando"
							+ " en una nuevapartida? (y/n)");
					
					pregunta = readMessage.nextLine();
					
					if(pregunta.equalsIgnoreCase("y")) {
					
						seguirJugando();
						
					} else {
						
						continuaRonda = false;
						
						JOptionPane.showMessageDialog(null, "Cya!");
						
					}
					
				}
				
				if(logicaDados.getEstado() == 2) {
					
					JOptionPane.showMessageDialog(null, "¡Perdiste!, ¿deseas seguir jugando "
							+ "en una nueva partida? (y/n)");
					
					pregunta = readMessage.nextLine();
					
					if(pregunta.equalsIgnoreCase("y")) {
					
						seguirJugando();
						
					} else {
						
						continuaRonda = false;
						
						JOptionPane.showMessageDialog(null, "Cya!");
						
					}
					
				}
				
				if(logicaDados.getEstado() == 3) {
					
					
					JOptionPane.showMessageDialog(null, "¡Anotaste un punto!, debes de lanzar nuevamente"
							+ " hasta sacar de nuevo el mismo valor del primer punto para ganar;"
							+ " ¿deseas lanzar de nuevo para continuar? (y/n)");
				
					pregunta = readMessage.nextLine();
				
					if(pregunta.equalsIgnoreCase("y")) {
					
						logicaDados.calcularTiro();
					
						dados = logicaDados.getCarasDados();
						
						logicaDados.estadoJuego();
					
					} else {
					
						continuaRonda = false;
						
						pierdePorAbandono = true;
						
						JOptionPane.showMessageDialog(null, "Cya!");
					
					}
					
				}
			
			
			} while(continuaRonda);
			
			break;
			
		}
		
		if(pierdePorAbandono) {
			
			JOptionPane.showMessageDialog(null, "¡Perdiste por abandonar en partida!, Bye");
			
		}
		
	}

	private void seguirJugando() {
		
		this.iniciarJuego();
		
	}

}
