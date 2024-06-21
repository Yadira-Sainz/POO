public class Triangulo implements FiguraGeometrica{

        public double base;
        public double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            double area = base * altura / 2;
            return area;

        }

        @Override
        public double calcularPerimetro() {
            double perimetro = base * 3;
            return perimetro;
        }
}
