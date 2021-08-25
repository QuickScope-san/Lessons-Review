package lessonsreview;

import javax.swing.JOptionPane;

public class PrincipalLessonsReview {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Test Message");
		
		JOptionPane.showMessageDialog(null, "Prueba de cambio");

		JOptionPane.showMessageDialog(null, "Prueba de cambio 2");
		
		VistaConsola miJuego = new VistaConsola();
		
		miJuego.iniciarJuego();

	}

}
