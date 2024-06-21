public class Algoritmos {

    public void consumoGasolina(float kms, float precio, float dineroGastado, int timepoHoras, int tiempoMinutos){
        double consumo = dineroGastado / kms;
        double costo = consumo / precio;
        consumo *= 100;
        costo *= 100;
        double minutos =  tiempoMinutos + (timepoHoras * 60);
        final double millas = 1.609;
        double velocidadMediaHoras = kms / (minutos/ 60);
        double velocidadMillas = ((velocidadMediaHoras / millas) / 60);

        System.out.println("Consumo euros/kilometros: " + consumo + ", litros/kilometros: " + costo);
        System.out.println("Consumo en euros por 100 kilometros: " + consumo + ", consumo litros/100 kilometros: " + costo);
        System.out.println("Velocidad media  km/h es:" + velocidadMediaHoras);
        System.out.println("Velocidad media  m/s es: " + velocidadMillas);
    }


}
