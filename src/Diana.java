/* Nombre: Hugo Isaac Valdez Ruvalcaba - A01631301
 * Clase: Diana
 * Fecha: 5.04.2019
 */

import java.awt.Color;
import java.awt.Graphics;

public class Diana {

	protected int xPos, yPos, ancho;

	protected Color colorCentro;

	public Diana(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.ancho = 204;
		this.colorCentro = Color.BLUE;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAncho() {
		return this.ancho;
	}

	public void setColorCentro(Color colorCentro) {
		this.colorCentro = colorCentro;
	}

	public Color getColorCentro() {
		return this.colorCentro;
	}

	public void setPosicionInicial(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void pintaFigura(Graphics g) {

		int diametro = 0;
		int x = this.xPos;
		int y = this.yPos;

		for (int i = 0; i < 6; i++) {

			if (i % 2 == 0) {
				g.setColor(Color.BLACK);
			} else if (i != 5) {
				g.setColor(Color.WHITE);
			} else {
				g.setColor(this.colorCentro);
			}

			if (i == 0) {
				diametro = this.ancho;
			} else {
				diametro = (this.ancho / 6) * (6 - i);
			}

			g.fillOval(x, y, diametro, diametro);

			x += (this.ancho / 12);
			y += (this.ancho / 12);
		}
	}
}
