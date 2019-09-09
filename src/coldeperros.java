
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class coldeperros {

    private static List<perros> bd = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n    COLEGIO DE PERROS");
            System.out.println("-----------------------");
            System.out.println("1. Ingresar un nuevo Perro");
            System.out.println("2. Listar la BD de perros");
            System.out.println("3. Perros por Localidad");
            System.out.println("4. Perros por Raza");
            System.out.println("0. Salir");
            System.out.print("Elija una opción => ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    NuevoPerro();
                    break;
                case 2:
                    MostrarPerros();
                    break;
                case 3:
                    PerrosxLoc();
                    break;
                case 4:
                    PerrosxRaza();
                    break;
            }
        } while (opcion != 0);
    }

    private static void NuevoPerro() {
        String nom, raz, loc, nomD, doc, tel, dAsis;
        teclado.nextLine();
        System.out.print("Digite el nombre del perro: ");
        nom = teclado.nextLine();
        System.out.print("Digite la raza: ");
        raz = teclado.nextLine();
        System.out.print("Ingrese la localidad a la que pertenece: ");
        loc = teclado.nextLine();
        System.out.print("Ingrese el nombre de dueño: ");
        nomD = teclado.nextLine();
        System.out.print("Ingrese la cédula del dueño: ");
        doc = teclado.nextLine();
        System.out.print("Ingrese el número de teléfono del dueño: ");
        tel = teclado.nextLine();
        System.out.print("Ingrese el día(s) de asistencia: ");
        dAsis = teclado.nextLine();

        perros perrito = new perros(nom, raz, loc, nomD, doc, tel, dAsis);
        bd.add(perrito);

        System.out.println("\nRegistro Ingresado Satisfactoriamente");
        System.out.println("La BD de perros tiene " + bd.size() + " Perros");
    }

    private static void MostrarPerros() {
        for (int i = 0; i < bd.size(); i++) {
            perros perrito = bd.get(i);
            System.out.println("----------------------------------------");
            System.out.println("Perro " + i);
            System.out.println("Nombre:        " + perrito.ingNombre());
            System.out.println("Raza:          " + perrito.ingRaza());
            System.out.println("Localidad:     " + perrito.ingLoc());
            System.out.println("Nombre Dueño:  " + perrito.ingNomD());
            System.out.println("Cedula:        " + perrito.ingDoc());
            System.out.println("Teléfono:      " + perrito.ingTel());
            System.out.println("Dias de Asistencia: " + perrito.ingAsis());
            System.out.println("----------------------------------------");
        }
    }

    private static void PerrosxLoc() {
        String nomLoc;
        teclado.nextLine();
        System.out.print("\nDigite la localidad:  ");
        nomLoc = teclado.nextLine();
        int cont = 0;

        // Recorre la lista
        for (perros perrito : bd) {
            if (perrito.ingLoc().equalsIgnoreCase(nomLoc)) {
                cont++;
                System.out.println(cont + " - " + perrito.ingNombre());
                System.out.println("    " + perrito.ingRaza());
            }
        }
        System.out.println("La localidad " + nomLoc + " tiene " + cont
                + " perro(s) ");
    }

    private static void PerrosxRaza() {
        String nomRaz;
        teclado.nextLine();
        System.out.print("\nDigite la Raza:  ");
        nomRaz = teclado.nextLine();
        int cont = 0;

        // Recorre la lista
        for (perros perrito : bd) {
            if (perrito.ingRaza().equalsIgnoreCase(nomRaz)) {
                cont++;
                System.out.println(cont + " - " + perrito.ingNombre());
            }
        }
        System.out.println("La Raza " + nomRaz + " tiene " + cont + " perro(s) ");
    }
}
