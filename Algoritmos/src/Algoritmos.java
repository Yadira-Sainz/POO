public class Algoritmos {

    public double areaTriangulo(double base, double altura){
        return base * altura / 2;
    }

    public double areaCirculo(double radio ){
        double exponente = Math.pow(radio, 2);
        return Math.PI * exponente;
    }

    public int promedio(int p1, int p2, int p3, int p4, int p5){
        return (p1 + p2 + p3 + p4 + p5) / 5;
    }

    public  float gradosCentigrados(float celsius){
        return (float) (celsius * 1.8 + 32);
    }

    public float prestamoBanco(float tasa){
        return (float) (tasa * 0.018 * 12);
    }

    public double salarioNeto(double horas, double tarifa, double isr){
        return Math.round((horas * tarifa) * ((100 - isr) / 100)); //math.round es un metodo por eso lleva parentesis
    }

    public double salarioConHrsExtras(double hrs, double pagoHora){
        double salarioExtra = 0;
        if(hrs > 40) {
            double horasExtras = hrs - 40;
            salarioExtra = horasExtras * (pagoHora * 0.5);
        }
        double salarioOrdinario = hrs * pagoHora;
        return salarioOrdinario + salarioExtra;
    }

    public void tiempo(int minutos){
        int dias = 0;
        int horas = 0;
        int minutosRestante = 0;
        dias = minutos / (24*60);
        minutosRestante = minutos % (24*60);
        horas = minutosRestante / 60;
        minutosRestante = minutosRestante % 60;
        System.out.println(dias + " dia, " +  horas + " horas, " + minutosRestante + " minutos");
    }

    public void conversorMetros(float metros){
        float cm;
        float km;
        float in; //Pulgadas
        float ft; //Pies
        cm = metros * 100;
        km = (float) (metros * 0.001);
        in = (float) (metros * 39.37);
        ft = (float) (metros * 3.28);
        System.out.println(cm + "cm,  " + km + "km,  " + in + "in,  " + ft + "ft");
    }

    public void consumoGasolina(float kms, float precio, float dineroGastado, int tiempoHora, int tiempoMinutos){
        float consumoEnDinero = dineroGastado / kms;
        float costoLitro = consumoEnDinero / precio;
        System.out.println("Consumo en euros por kilometros: " + consumoEnDinero + ", consumo en litros por kilometros: " + costoLitro);
        consumoEnDinero *= 100;
        costoLitro *= 100;
        System.out.println("Consumo en euros por 100 kilometros: " + consumoEnDinero + ", consumo en litros por 100 kilometros: " + costoLitro);
        tiempoHora *= 60;
        tiempoMinutos += tiempoHora;
        float velocidadMediaHrs = (kms / tiempoMinutos) * 60;
        System.out.println("La velocidad media en km/h es: " + velocidadMediaHrs);
        float velocidadMediaMs = ((float) (velocidadMediaHrs / 1.609) / 60);
        System.out.println("La velocidad media en m/s es: " + velocidadMediaMs);

    }
}
