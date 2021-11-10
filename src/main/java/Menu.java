import java.util.Scanner;

public class Menu {
    public static void iniciarPrograma(){
        mostrarMenu ();
        switchesMenu ();
    }

    public static void mostrarMenu (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Mostrar datos del computador.");
        System.out.println ("2. Editar datos del computador.");
        System.out.println ("3. Salir.");
        System.out.println ("------------------------------------------");
    }
    public static void switchesMenu() {
        switch (validarMenu (3)) {
            case 1:
                mostrarDatos ();
                break;
            case 2:
                editarDatos ();
                break;
            case 3:
                finalizarPrograma ();
                break;
        }
        int x = -1;
        do {
            iniciarPrograma ();
            System.out.println ("Desea hacer algo mas?[1]Si [2]No");
            x = validarMenu (2);
        } while (x == 1);
    }

    public static void mostrarDatos(){

    }
    public static void editarDatos(){

    }
    public static void finalizarPrograma(){
        System.out.println ("------------------------------------------");
        System.out.println ("          Programa finalizado              ");
        System.out.println ("------------------------------------------");
    }

    //Metodo para validar Menu.
    public static int validarMenu ( int x){
        int n = -1;
            do {
                //Scanner ponerlo dentro del DO, y dentro de una funcion
                Scanner teclado = new Scanner (System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt ();
            } catch (Exception e) {
                System.out.println ("Error");
            }
            if (n < 0 || n > x) {
                System.out.println ("Ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }
}
