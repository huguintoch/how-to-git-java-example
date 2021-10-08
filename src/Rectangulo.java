public class Rectangulo implements Figura {

	protected double largo, ancho;

	public Rectangulo(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}

	public Rectangulo() {
		this(5.0, 2.0);
	}

	public double perimetro() {
		return 2.0 * (this.largo + this.ancho);
	}

	public double area() {
		return this.largo * this.ancho;
	}

	public double volumen() {
		return 0.0;
	}

	public String toString() {
		return "Rectángulo de largo " + this.largo + " y ancho " + this.ancho;
	}
}