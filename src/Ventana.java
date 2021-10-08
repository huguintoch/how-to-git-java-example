import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		super("Diana");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		PanelDiana d = new PanelDiana();
		this.add(d);

		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ventana();
	}
}
