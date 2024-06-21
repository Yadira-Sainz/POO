public class Main {
    public static void main(String[] args) {
        Usuario yadira = new Usuario();
        Usuario mario = new Usuario();

        yadira.nombreUsuario = "yadira";
        yadira.edad = 28;
        yadira.setPasswordUsuario("Uasd14!1");
        yadira.setTarjetaCredito("475-234-8822");
        System.out.println(yadira.getTarjetaCredito());
        System.out.println(yadira.getPasswordUsuario());

        mario.edad = 33;
        mario.nombreUsuario = "mario";
        mario.setPasswordUsuario("Secret123!");
        mario.setTarjetaCredito("478-123-2348");
    }
}
