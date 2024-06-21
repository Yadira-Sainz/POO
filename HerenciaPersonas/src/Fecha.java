public class Fecha {
    private int dia;
    private int mes;
    private int anio;


    public Fecha(int dia, int mes, int anio) { //Constructor Fecha
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void imprimir() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }
}
