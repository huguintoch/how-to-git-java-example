public class Visualizer {
    public static void main(String[] args) {

        Figura[] figuras = { new Rectangulo(6.0, 4.0), new Cuadrado(), new Caja(10.0, 15.3, 20.0), new Caja() };

        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
            System.out.println("El perímetro es: " + figuras[i].perimetro());
            System.out.println("El área es: " + figuras[i].area());
            System.out.println("El volumen es: " + figuras[i].volumen() + "\n");
        }
    }
}
