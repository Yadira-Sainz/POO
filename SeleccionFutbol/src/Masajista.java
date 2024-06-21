public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){
        System.out.println("Dando masaje...");
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Titulación: " + titulacion);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }
}
