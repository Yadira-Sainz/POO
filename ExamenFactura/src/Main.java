import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner lector = new Scanner(System.in);
        ArrayList<Cliente> clientes = Archivos.leerClientesObj();
        ArrayList<Vendedor> vendedores = Archivos.leerVendedorCsv();
        ArrayList<Producto> productos = Archivos.leerProductosCsv();
        do{
            System.out.println("##### MENÚ PRINCIPAL #####");
            System.out.println("1.- Alta clientes");
            System.out.println("2.- Alta vendedores");
            System.out.println("3.- Alta productos");
            System.out.println("4.- Realizar venta");
            System.out.println("5.- Listar facturas");
            System.out.println("6.- Buscar vendedor");
            System.out.println("7.- Buscar producto");
            System.out.println("0.- Salir");
            System.out.print("Opción: ");
            opc = lector.nextInt();
            lector.nextLine();

            switch (opc){
                case 0:
                    Archivos.guardarClientesCsv(clientes);
                    Archivos.guardarVendedorCsv(vendedores);
                    Archivos.guardarProductosCsv(productos);
                    Archivos.guardarClientesObj(clientes);
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("##### ALTA CLIENTES #####");
                    System.out.println("Ingresa el RFC:");
                    String rfc = lector.next();
                    lector.nextLine();
                    if(clientes.contains(new Cliente(rfc))){
                        System.out.println("Error, el RFC ya existe");
                    }else {
                        System.out.println("Nombre:");
                        String nombre = lector.nextLine();
                        System.out.println("Apellido paterno:");
                        String apellidoPaterno = lector.next();
                        System.out.println("Apellido materno");
                        String apellidoMaterno = lector.next();
                        System.out.println("Ingresa la fecha de nacimiento");
                        System.out.println("Día:");
                        int dia = lector.nextInt();
                        System.out.println("Mes:");
                        int mes = lector.nextInt();
                        System.out.println("Año:");
                        int anio = lector.nextInt();
                        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
                        lector.nextLine();
                        System.out.println("Domicilio:");
                        String domicilio = lector.nextLine();
                        Cliente cliente = new Cliente(rfc, domicilio, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
                        clientes.add((cliente));
                    }
                    break;

                case 2:
                    System.out.println("##### ALTA VENDEDOR #####");
                    System.out.println("ID del vendedor");
                    int idVendedor = lector.nextInt();
                    lector.nextLine();
                    if(vendedores.contains(new Vendedor(idVendedor))){
                        System.out.println("Error, el ID ya existe");
                    }else {
                        System.out.println("Nombre:");
                        String nombre = lector.nextLine();
                        System.out.println("Apellido paterno:");
                        String apellidoPaterno = lector.next();
                        System.out.println("Apellido materno");
                        String apellidoMaterno = lector.next();
                        System.out.println("Ingresa la fecha de nacimiento");
                        System.out.println("Día:");
                        int dia = lector.nextInt();
                        System.out.println("Mes:");
                        int mes = lector.nextInt();
                        System.out.println("Año:");
                        int anio = lector.nextInt();
                        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
                        lector.nextLine();
                        System.out.println("Area del vendedor");
                        String area = lector.nextLine();
                        System.out.println("Porcentaje comisión:");
                        float porcentajeComision = lector.nextFloat();
                        System.out.println("Sueldo base:");
                        int sueldoBase = lector.nextInt();
                        Vendedor vendedor = new Vendedor(idVendedor, area, porcentajeComision, sueldoBase, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
                        vendedores.add(vendedor);
                    }
                    break;

                case 3:
                    System.out.println("##### ALTA PRODUCTOS #####");
                    System.out.println("Ingresa el ID:");
                    int id = lector.nextInt();
                    lector.nextLine();
                    if(productos.contains(new Producto(id))){
                        System.out.println("Error, el ID ya existe");
                    }else {
                        System.out.println("Descripción:");
                        String descripcion = lector.nextLine();
                        System.out.println("Precio:");
                        float precio = lector.nextFloat();
                        Producto productosRegistro = new Producto(id, descripcion, precio);
                        productos.add(productosRegistro);
                    }
                    break;

                case 4:
                    System.out.println("##### REALIZAR VENTA #####");
                    System.out.println("Ingrese el rfc del cliente:");
                    String rfcCliente = lector.next();
                    Cliente clienteBuscado = new Cliente(rfcCliente);
                    int indexCliente = clientes.indexOf(clienteBuscado);

                    if(indexCliente != -1){
                        Cliente clienteCompra = clientes.get(indexCliente);
                        System.out.println("Ingrese el ID del vendedor:");
                        int idBuscado = lector.nextInt();
                        Vendedor vendedorBuscado = new Vendedor(idBuscado);
                        int indexVendedor = vendedores.indexOf(vendedorBuscado);
                        if(indexVendedor != -1){
                            Vendedor vendedor = vendedores.get(indexVendedor);
                            Factura carrito = new Factura(LocalDate.now(),vendedor);
                            int opcion;
                            do{
                                System.out.println("### Carrito de Compra ###");
                                System.out.println("1.- Agregar producto");
                                System.out.println("2.- Elimiar producto");
                                System.out.println("3.- Completar compra (Generar Factura)");
                                System.out.println("0.- Regresar al Menú anterior");
                                opcion = lector.nextInt();
                                switch (opcion){
                                    case 0:
                                        break;
                                    case 1:
                                        System.out.println("Agregar, Producto ID:");
                                        int idProductoA = lector.nextInt();
                                        carrito.agregarProducto(idProductoA);
                                        break;
                                    case 2:
                                        System.out.println("Eliminar, Producto ID:");
                                        int idProductoE = lector.nextInt();
                                        carrito.eliminarProducto(idProductoE);
                                        break;
                                    case 3:
                                        carrito.calcular();
                                        vendedor.calcularComision(carrito.getTotal());
                                        System.out.println("_________________________________");
                                        System.out.println("Total de articulos: " + carrito.getProductos().size());
                                        System.out.println("Subtotal: " + carrito.getSubtotal());
                                        System.out.println("Iva: " + carrito.getIva());
                                        System.out.println("Total: " + carrito.getTotal());
                                        clienteCompra.comprar(carrito);
                                        System.out.println("Factura ID: " + carrito.getId());
                                        System.out.println("_________________________________");
                                        opcion = 0;
                                        System.out.println("Presiona enter para continuar...");
                                        try {System.in.read();} catch (Exception e) {}
                                        break;
                                }

                            }while(opcion != 0);
                        }else{
                            System.out.println("Vendedor no encontrado");
                        }
                    }else{
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("##### LISTAR FACTURAS #####");
                    System.out.println("Introdusca el RFC del cliente buscado:");
                    String idBuscado1 = lector.next();
                    clienteBuscado = new Cliente(idBuscado1);
                    int index1 = clientes.indexOf(clienteBuscado);
                    if(index1 != -1){
                        Cliente cliente = clientes.get(index1);
                        System.out.println(cliente.toString());
                        System.out.println("Lista de facturas:");
                        System.out.println("_________________________________");
                        for (Factura f: cliente.getCompras()) {
                            System.out.println(f.toString());
                        }
                        System.out.println("_________________________________");
                    }else{
                        System.out.println("Cliente no encontrado.");
                    }
                    System.out.println("Presiona enter para continuar...");
                    try {System.in.read();} catch (Exception e) {}
                    break;
                case 6:
                    System.out.println("##### BUSCAR VENDEDOR #####");
                    System.out.println("Introdusca el ID que desea buscar:");
                    int idBuscado = lector.nextInt();
                    Vendedor vendedorBuscado = new Vendedor(idBuscado);
                    int index = vendedores.indexOf(vendedorBuscado);
                    if(index != -1){
                        System.out.println(vendedores.get(index).toString());
                        Vendedor vendedorEncontrado = vendedores.get(index);
                        double comision=0;
                        System.out.println("Lista de Ventas:");
                        System.out.println("_________________________________");
                        for (Cliente c: clientes) {
                            for (Factura f: c.getCompras()) {
                                if(f.getVendedor().equals(vendedorBuscado)){
                                    comision += vendedorEncontrado.calcularComision(f.getTotal());
                                    System.out.println(f);
                                }
                            }
                        }
                        System.out.println("_________________________________");
                        System.out.println("comisión: " + comision);
                        double sueldoNeto = vendedorEncontrado.getSueldoBase() + comision;
                        System.out.println("Sueldo Neto: " + sueldoNeto);
                    }else{
                        System.out.println("Vendedor no encontrado.");
                    }
                    System.out.println("Presiona enter para continuar...");
                    try {System.in.read();} catch (Exception e) {}
                    break;
                case 7:
                    System.out.println("##### BUSCAR PRODUCTO #####");
                    System.out.println("Introdusca el ID que desea buscar:");
                    int idBuscadoP = lector.nextInt();
                    System.out.println("_________________________________");
                    Producto productoBuscado = new Producto(idBuscadoP);
                    int indexProducto = productos.indexOf(productoBuscado);
                    if(indexProducto != -1){
                        System.out.println(productos.get(indexProducto).toString());
                    }else{
                        System.out.println("Producto no encontrado.");
                    }
                    System.out.println("_________________________________");
                    System.out.println("Presiona enter para continuar...");
                    try {System.in.read();} catch (Exception e) {}
                    break;

            }

        }while (opc != 0);
    }
}
