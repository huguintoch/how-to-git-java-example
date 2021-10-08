/* Nombre: Hugo Isaac Valdez Ruvalcaba - A01631301
 * Clase: DianaNumerada
 * Fecha: 5.04.2019
 */

import java.awt.Color;
import java.awt.Graphics;

public class DianaNumerada extends Diana {

	public DianaNumerada(int xPos, int yPos) {
		super(xPos, yPos);
	}

	public void pintaFigura(Graphics g) {
		super.pintaFigura(g);

		g.setColor(Color.BLACK);
		g.drawString("10", this.xPos + (this.ancho / 2) - 7, this.yPos + (this.ancho / 2) + 4);

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 5; i++) {
				if (i % 2 == 0) {
					g.setColor(Color.WHITE);
				} else {
					g.setColor(Color.BLACK);
				}
				if (j == 0) {
					g.drawString(Integer.toString(5 + i), this.xPos + (this.ancho / 24) + (this.ancho / 12) * i - 3,
							this.yPos + this.ancho / 2 + 4);
				} else if (j == 1) {
					g.drawString(Integer.toString(9 - i),
							this.xPos + (15 * this.ancho / 24) + (this.ancho / 12) * i - 3,
							this.yPos + this.ancho / 2 + 4);
				} else if (j == 2) {
					g.drawString(Integer.toString(5 + i), this.xPos + this.ancho / 2 - 3,
							this.yPos + (this.ancho / 24) + (this.ancho / 12) * i + 4);
				} else {
					g.drawString(Integer.toString(9 - i), this.xPos + this.ancho / 2 - 3,
							this.yPos + (15 * this.ancho / 24) + (this.ancho / 12) * i + 4);
				}
			}
		}
	}
}
