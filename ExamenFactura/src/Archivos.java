import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Archivos {

    public static ArrayList<Cliente> leerClientesCsv() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String file_path = "clientes.csv";
        try {
            FileReader fr = new FileReader(file_path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] valores = line.split(","); // Toma el valor hasta la coma
                clientes.add(new Cliente(valores[0], valores[1], valores[2], valores[3], valores[4], LocalDate.parse(valores[5])));
                line = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public static void guardarClientesCsv(ArrayList<Cliente> clientes) {
        String file_path = "clientes.csv";
        try {
            FileWriter fw = new FileWriter(file_path); //Abrir
            PrintWriter pw = new PrintWriter(fw); //Crear objeto que me va ayudar a escribir
            for (Cliente p : clientes) {
                pw.println(p.valores());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Dato invalido...");
        }
    }

    public static void guardarClientesObj(ArrayList<Cliente> clientes) {
        String file_obj_path = "clientes_obj.txt";
        try {
            FileOutputStream fos = new FileOutputStream(file_obj_path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clientes);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Cliente> leerClientesObj() {
        ArrayList<Cliente> clientes;
        String file_obj_path = "clientes_obj.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file_obj_path));
            if (br.readLine() == null) {
                clientes = new ArrayList<Cliente>();
            } else {
                try {
                    FileInputStream fis = new FileInputStream(file_obj_path);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    clientes = (ArrayList<Cliente>) ois.readObject();
                    ois.close();
                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public static ArrayList<Vendedor> leerVendedorCsv() {
        ArrayList<Vendedor> vendedors = new ArrayList<>();
        String file_path = "vendedor.csv";
        try {
            FileReader fr = new FileReader(file_path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] valores = line.split(",");
                vendedors.add(new Vendedor(Integer.parseInt(valores[0]), valores[1], Float.parseFloat(valores[2]), Integer.parseInt(valores[3]), valores[4], valores[5], valores[6], LocalDate.parse(valores[7])));
                line = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return vendedors;
    }

    public static void guardarVendedorCsv(ArrayList<Vendedor> vendedores) {
        String file_path = "vendedor.csv";
        try {
            FileWriter fw = new FileWriter(file_path);
            PrintWriter pw = new PrintWriter(fw);
            for (Vendedor p : vendedores) {
                pw.println(p.valores());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Dato invalido...");
        }
    }


    public static ArrayList<Producto> leerProductosCsv() {
        ArrayList<Producto> productos = new ArrayList<>();
        String file_path = "productos.csv";
        try {
            FileReader fr = new FileReader(file_path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] valores = line.split(",");
                productos.add(new Producto(Integer.parseInt(valores[0]), valores[1], Float.parseFloat(valores[2])));
                line = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return productos;
    }

    public static void guardarProductosCsv(ArrayList<Producto> productos) {
        String file_path = "productos.csv";
        try {
            FileWriter fw = new FileWriter(file_path);
            PrintWriter pw = new PrintWriter(fw);
            for (Producto p : productos) {
                pw.println(p.valores());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Dato invalido...");
        }
    }

}
