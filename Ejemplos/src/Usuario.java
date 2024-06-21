public class Usuario {
    String nombreUsuario;

    private String passwordUsuario;
    int edad;
    private String tarjetaCredito;

    public void setTarjetaCredito(String tc){
        this.tarjetaCredito = tc;
    }

    public String getTarjetaCredito(){
        return "***-***-" + this.tarjetaCredito.substring(8);
    }

    public String getPasswordUsuario() {
        return "**********";
    }

    public void setPasswordUsuario(String passwordUsuario){
        if(passwordUsuario.isBlank() || passwordUsuario.isEmpty()){
            System.out.println("contraseña invalida");
            return;
        }
        if(passwordUsuario.length() < 8 ){
            System.out.println("contraseña demaciado corta, minimo 8 caracteres");
            return;
        }
        this.passwordUsuario = passwordUsuario;
    }
}
