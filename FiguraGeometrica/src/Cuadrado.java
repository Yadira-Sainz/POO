public class Cuadrado implements FiguraGeometrica{

    public double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
}
