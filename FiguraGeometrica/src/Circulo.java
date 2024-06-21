public class Circulo implements FiguraGeometrica{

    public double radio;

    public Circulo(int radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = Math.PI * (radio * 2);
        return perimetro;
    }

}
