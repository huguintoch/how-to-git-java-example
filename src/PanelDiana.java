import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelDiana extends JPanel {

	private DianaNumerada dianita;

	public PanelDiana() {
		super();
		this.setPreferredSize(new Dimension(500, 500));

		this.dianita = new DianaNumerada(0, 0);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.dianita.pintaFigura(g);
	}
}
