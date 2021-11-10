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
        int x = -1;
        Computador c = new Computador("hp", "sexo",new Ram("sex",50,2666));
        do {
            switch (validarMenu (3)) {
                case 1:
                    mostrarDatos (c);
                    break;
                case 2:
                    editarDatos (c);

                    break;
                case 3:
                    finalizarPrograma ();
                    break;
            }
            System.out.println ("Desea hacer algo mas?[1]Si [2]No");
            x = validarMenu (2);
            if (x==1){
                mostrarMenu();
            }
        } while (x == 1);
    }

    public static void mostrarDatos(Computador c){
        System.out.println(c.toString());
    }

    public static void editarDatos(Computador c){
        menuEditarDatos();
        if (validarMenu(2)==1){
            menuEditarComputador(c);
        }else {
            menuEditarRam();
        }

    }

    public static Ram menuEditarRam() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese datos de la nueva ram");
        System.out.println("Marca:");
        String marca = teclado.next();
        System.out.println("GB:");
        int gb = validar();
        System.out.println("Mhz:");
        int mhz = validar();
        return new Ram(marca,gb,mhz);
    }

    public static void menuEditarComputador(Computador c) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("que dato desea editar?");
        System.out.println("[1]marca");
        System.out.println("[2]modelo");
        System.out.println("[3]ram");
        int opcion = validarMenu(3);
        if (opcion==1){
            System.out.println("ingrese dato nuevo");
            String marca = teclado.next();
            c.setMarca(marca);
        }else if(opcion==2){
            System.out.println("ingrese dato nuevo");
            String modelo = teclado.next();
            c.setModelo(modelo);
        }else {
            c.setRam(menuEditarRam());
        }
    }

    public static void menuEditarDatos() {
        System.out.println("Que desea editar?");
        System.out.println("[1]Computador [2]Ram");
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
    public static int validar (){
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
            if (n < 0 ) {
                System.out.println ("Ingrese un numero valido");
            }
        } while (n < 0 );
        return n;
    }
}
