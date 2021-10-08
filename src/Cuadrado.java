// [ToDo]: Code this class by adding constructor and methods
    public class Cuadrado implements Figura {

        protected double largo, ancho;
    
        public Cuadrado(double largo, double ancho) {
            this.largo = largo;
            this.ancho = ancho;
        }
    
        public Rectangulo() {
            this(5.0, 2.0);
        }
    
        public String toString() {
            return "Cuadrado de largo " + this.largo + " y ancho " + this.ancho;
        }
    }
    


    