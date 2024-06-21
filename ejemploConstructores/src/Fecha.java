public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){ // Constructor
        dia = 1;
        mes = 1;
        anio = 2000;

    }

    public Fecha(int dia, int mes, int anio){ //Constructor
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia(int dia){
        this.dia = dia; // atributo(Clase) - parametro
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }
    public int getAnio(){
        return anio;
    }
}
