public class Date {
    private int dia;
    private int mes;
    private int anio;


    public Date(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void imprimir() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }

}
