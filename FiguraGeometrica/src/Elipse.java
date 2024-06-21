public class Elipse implements FiguraGeometrica{

    public double ladoA;
    public double ladoB;

    public Elipse(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    @Override
    public double calcularArea() {
        double area = Math.PI * ladoA * ladoB;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * (
                Math.sqrt(
                        (Math.pow(ladoA, 2) + Math.pow(ladoB, 2)) / 2
                )
        );
        return perimetro;
    }
}
