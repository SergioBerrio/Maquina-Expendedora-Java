package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static String[][] nombresGolosinas = {
        {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},

        {"Kinder Bueno", "Bolsa variada Haribo", "Cheetos", "Twix"},

        {"Pringles", "M&M'S", "Papa Delta", "Chicles de menta"},

        {"Monster", "Crunch", "Milkybar", "Fritos"}

    };

    public static double[][] precioGolosinas = {
        {1.1, 0.8, 1.5, 0.9},

        {1.8, 1, 1.2, 1},

        {1.5, 1.3, 1.2, 0.8},

        {1.2, 1.1, 1.1, 0.75}
    };

    public static double cantidad_Kit_Kat = 5;
    public static double cantidad_Chicles_Fresa = 5;
    public static double cantidad_Lacasitos = 5;
    public static double cantidad_Palotes = 5;
    public static double cantidad_Kinder_Bueno = 5;
    public static double cantidad_Bolsa_Variada_Haribo = 5;
    public static double cantidad_Cheetos = 5;
    public static double cantidad_Twix = 5;
    public static double cantidad_Pringles = 5;
    public static double cantidad_M_MS = 5;
    public static double cantidad_Papa_Delta = 5;
    public static double cantidad_Chicles_Menta = 5;
    public static double cantidad_Monster = 5;
    public static double cantidad_Crunch = 5;
    public static double cantidad_Milkybar = 5;
    public static double cantidad_Fritos = 5;

    public static int cantidadComprada_Kit_Kat;
    public static int cantidadComprada_Chicles_Fresa;
    public static int cantidadComprada_Lacasitos;
    public static int cantidadComprada_Palotes;
    public static int cantidadComprada_Kinder_Bueno;
    public static int cantidadComprada_Bolsa_Variada_Haribo;
    public static int cantidadComprada_Cheetos;
    public static int cantidadComprada_Twix;
    public static int cantidadComprada_Pringles;
    public static int cantidadComprada_M_MS;
    public static int cantidadComprada_Papa_Delta;
    public static int cantidadComprada_Chicles_Menta;
    public static int cantidadComprada_Monster;
    public static int cantidadComprada_Crunch;
    public static int cantidadComprada_Milkybar;
    public static int cantidadComprada_Fritos;


    public static void main(String[] args) {
        System.out.println("Bienvenido a la máquina expendedora, que deseas hacer??\n");

        System.out.println("Tecla 1: Comprar chucherias de la máquina.");
        System.out.println("Tecla 2: Ver las chucherias disponibles en la máquina.");
        System.out.println("Tecla 3: Rellenar la cantidad de las chucherias de la máquina.");
        System.out.println("Tecla 4: Apagar la máquina.\n");

        Scanner in = new Scanner(System.in);
        int eleccion = in.nextInt();

        switch (eleccion) {
            case 1:
                if (cantidad_Kit_Kat == 1 || cantidad_Chicles_Fresa == 1 || cantidad_Lacasitos == 1 || cantidad_Palotes == 1 || cantidad_Kinder_Bueno == 1 || cantidad_Bolsa_Variada_Haribo == 1 || cantidad_Cheetos == 1 || cantidad_Twix == 1 || cantidad_Pringles == 1 || cantidad_M_MS == 1 || cantidad_Papa_Delta == 1 || cantidad_Chicles_Menta == 1 || cantidad_Monster == 1 || cantidad_Crunch == 1 || cantidad_Milkybar == 1 || cantidad_Fritos == 1) {
                    System.out.println("Las cantidades están bajo mínimos, hay que rellenar existencias!!");
                } else {
                    comprarChucherias();
                }
                break;
            case 2:
                verChucherias();
                break;
            case 3:
                rellenarMaquina();
                break;
            case 4:
                apagarMaquina();
                break;
        }
    }


    public static void comprarChucherias(){
        System.out.println("\nIntroduce el dinero en la máquina:");

        Scanner in = new Scanner(System.in);
        double dineroCompra = in.nextDouble();

        System.out.println("\nCrédito: " + dineroCompra + "€");
        System.out.println("Introduce el código del producto que desees comprar, ej. 00 o 11:\n");

        Scanner in2 = new Scanner(System.in);
        String eleccioncompra = in2.next();

        switch (eleccioncompra){
            case "00":

                while (dineroCompra < precioGolosinas[0][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[0][0]) {

                    double diferenciaPrecioKitKat = dineroCompra - precioGolosinas[0][0];
                    cantidad_Kit_Kat -= 1;
                    cantidadComprada_Kit_Kat += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioKitKat * 100) / 100 + " €");
                }

                break;

            case "01":

                while (dineroCompra < precioGolosinas[0][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra < precioGolosinas[0][1]) {

                    double diferenciaPrecioChiclesFresa = dineroCompra - precioGolosinas[0][1];
                    cantidad_Chicles_Fresa -= 1;
                    cantidadComprada_Chicles_Fresa += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioChiclesFresa * 100) / 100 + " €");
                }

                break;

            case "02":

                while (dineroCompra < precioGolosinas[0][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[0][2]) {

                    double diferenciaPrecioLacasitos = dineroCompra - precioGolosinas[0][2];
                    cantidad_Lacasitos -= 1;
                    cantidadComprada_Lacasitos += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioLacasitos * 100) / 100 + " €");
                }

                break;

            case "03":

                while (dineroCompra < precioGolosinas[0][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[0][3]) {

                    double diferenciaPrecioPalotes = dineroCompra - precioGolosinas[0][3];
                    cantidad_Palotes -= 1;
                    cantidadComprada_Palotes += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioPalotes * 100) / 100 + " €");
                }

                break;

            case "10":

                while (dineroCompra < precioGolosinas[1][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[1][0]) {

                    double diferenciaPrecioKinderBueno = dineroCompra - precioGolosinas[1][0];
                    cantidad_Kinder_Bueno -= 1;
                    cantidadComprada_Kinder_Bueno += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioKinderBueno * 100) / 100 + " €");
                }

                break;

            case "11":

                while (dineroCompra < precioGolosinas[1][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[1][1]) {

                    double diferenciaPrecioBolsaVariadaHaribo = dineroCompra - precioGolosinas[1][1];
                    cantidad_Bolsa_Variada_Haribo -= 1;
                    cantidadComprada_Bolsa_Variada_Haribo += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioBolsaVariadaHaribo * 100) / 100+ " €");
                }

                break;

            case "12":

                while (dineroCompra < precioGolosinas[1][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[1][2]) {

                    double diferenciaPrecioCheetos = dineroCompra - precioGolosinas[1][2];
                    cantidad_Cheetos -= 1;
                    cantidadComprada_Cheetos += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioCheetos * 100) / 100 + " €");
                }

                break;

            case "13":

                while (dineroCompra < precioGolosinas[1][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[1][3]) {

                    double diferenciaPrecioTwix = dineroCompra - precioGolosinas[1][3];
                    cantidad_Twix -= 1;
                    cantidadComprada_Twix += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioTwix * 100) / 100 + " €");
                }

                break;

            case "20":

                while (dineroCompra < precioGolosinas[2][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[2][0]) {

                    double diferenciaPrecioPringles = dineroCompra - precioGolosinas[2][0];
                    cantidad_Pringles -= 1;
                    cantidadComprada_Pringles += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioPringles * 100) / 100 + " €");
                }

                break;

            case "21":

                while (dineroCompra < precioGolosinas[2][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[2][1]) {

                    double diferenciaPrecioMMS = dineroCompra - precioGolosinas[2][1];
                    cantidad_M_MS -= 1;
                    cantidadComprada_M_MS += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioMMS * 100) / 100 + " €");
                }

                break;

            case "22":

                while (dineroCompra < precioGolosinas[2][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[2][2]) {

                    double diferenciaPrecioPapaDelta = dineroCompra - precioGolosinas[2][2];
                    cantidad_Papa_Delta -= 1;
                    cantidadComprada_Papa_Delta += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioPapaDelta * 100) / 100 + " €");
                }

                break;

            case "23":

                while (dineroCompra < precioGolosinas[2][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[2][3]) {

                    double diferenciaPrecioChiclesMenta = dineroCompra - precioGolosinas[2][3];
                    cantidad_Chicles_Menta -= 1;
                    cantidadComprada_Chicles_Menta += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioChiclesMenta * 100) / 100 + " €");
                }

                break;

            case "30":

                while (dineroCompra < precioGolosinas[3][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[3][0]) {

                    double diferenciaPrecioMonster = dineroCompra - precioGolosinas[3][0];
                    cantidad_Monster -= 1;
                    cantidadComprada_Monster += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioMonster * 100) / 100 + " €");
                }

                break;

            case "31":

                while (dineroCompra < precioGolosinas[3][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[3][1]) {

                    double diferenciaPrecioCrunch = dineroCompra - precioGolosinas[3][1];
                    cantidad_Crunch -= 1;
                    cantidadComprada_Crunch += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioCrunch * 100) / 100 + " €");
                }

                break;

            case "32":

                while (dineroCompra < precioGolosinas[3][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[3][2]) {

                    double diferenciaPrecioMilkybar = dineroCompra - precioGolosinas[3][2];
                    cantidad_Milkybar -= 1;
                    cantidadComprada_Milkybar += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioMilkybar * 100) / 100 + " €");
                }

                break;

            case "33":

                while (dineroCompra < precioGolosinas[3][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra > precioGolosinas[3][3]) {

                    double diferenciaPrecioFritos = dineroCompra - precioGolosinas[3][3];
                    cantidad_Fritos -= 1;
                    cantidadComprada_Fritos += 1;

                    System.out.println("\nDinero de vuelta: " + Math.round(diferenciaPrecioFritos * 100) / 100 + " €");
                }

                break;
        }
    }

    public static void verChucherias(){
        System.out.println("\n***Chucherías disponibles en la máquina***\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("[" + i + j + "] " + nombresGolosinas[i][j] + " " + precioGolosinas[i][j] + "€");
            }
        }
    }


    public static void rellenarMaquina(){
        System.out.println("\nHola, introduce la contraseña para rellenar la máquina:");

        Scanner in = new Scanner(System.in);
        String contrasenaRellenarMaquina = in.next();

        if (contrasenaRellenarMaquina.equals("MaquinaExpendedora2022")){

            System.out.println("Introduce la posición de la chuchería:");

            Scanner inPosicionChucheria = new Scanner(System.in);
            String posicionchucheriaRellenar = inPosicionChucheria.next();

            switch (posicionchucheriaRellenar) {
                case "00": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Kit_Kat += cantidadRellenar;

                    break;
                }
                case "01": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Chicles_Fresa += cantidadRellenar;

                    break;
                }
                case "02": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Lacasitos += cantidadRellenar;

                    break;
                }
                case "03": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Palotes += cantidadRellenar;

                    break;
                }
                case "10": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Kinder_Bueno += cantidadRellenar;

                    break;
                }
                case "11": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Bolsa_Variada_Haribo += cantidadRellenar;

                    break;
                }
                case "12": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Cheetos += cantidadRellenar;

                    break;
                }
                case "13": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Twix += cantidadRellenar;

                    break;
                }
                case "20": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Pringles += cantidadRellenar;

                    break;
                }
                case "21": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_M_MS += cantidadRellenar;

                    break;
                }
                case "22": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Papa_Delta += cantidadRellenar;

                    break;
                }
                case "23": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Chicles_Menta += cantidadRellenar;

                    break;
                }
                case "30": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Monster += cantidadRellenar;

                    break;
                }
                case "31": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Crunch += cantidadRellenar;

                    break;
                }
                case "32": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Milkybar += cantidadRellenar;

                    break;
                }
                case "33": {

                    System.out.println("Introduce la cantidad a rellenar:");

                    Scanner inCantidadRellenar = new Scanner(System.in);
                    int cantidadRellenar = inCantidadRellenar.nextInt();

                    cantidad_Fritos += cantidadRellenar;
                    break;
                }
            }

        } else {
            System.out.println("Contraseña incorrecta!!");
            System.out.println("Apagando máquina...");
        }

    }

    public static void apagarMaquina(){
        System.out.println("\nComienza el recuento de beneficios diario...");

        System.out.println("Quieres comprobrar las ganancias por producto o las ganacias totales??");

        Scanner in = new Scanner(System.in);
        String eleccionGanancias = in.next();

        System.out.println("\n***Ganancias obtenidas el " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "***");

        if (eleccionGanancias.equals("Ganancias por producto") || eleccionGanancias.equals(("ganancias por producto"))){

            System.out.println("Producto [00]: " + nombresGolosinas[0][0] + " -> " + (precioGolosinas[0][0] * cantidadComprada_Kit_Kat));
            System.out.println("Producto [01]: " + nombresGolosinas[0][1] + " -> " + (precioGolosinas[0][1] * cantidadComprada_Chicles_Fresa));
            System.out.println("Producto [02]: " + nombresGolosinas[0][2] + " -> " + (precioGolosinas[0][2] * cantidadComprada_Lacasitos));
            System.out.println("Producto [03]: " + nombresGolosinas[0][3] + " -> " + (precioGolosinas[0][3] * cantidadComprada_Palotes));
            System.out.println("Producto [10]: " + nombresGolosinas[1][0] + " -> " + (precioGolosinas[1][0] * cantidadComprada_Kinder_Bueno));
            System.out.println("Producto [11]: " + nombresGolosinas[1][1] + " -> " + (precioGolosinas[1][1] * cantidadComprada_Bolsa_Variada_Haribo));
            System.out.println("Producto [12]: " + nombresGolosinas[1][2] + " -> " + (precioGolosinas[1][2] * cantidadComprada_Cheetos));
            System.out.println("Producto [13]: " + nombresGolosinas[1][3] + " -> " + (precioGolosinas[1][3] * cantidadComprada_Twix));
            System.out.println("Producto [20]: " + nombresGolosinas[2][0] + " -> " + (precioGolosinas[2][0] * cantidadComprada_Pringles));
            System.out.println("Producto [21]: " + nombresGolosinas[2][1] + " -> " + (precioGolosinas[2][1] * cantidad_M_MS));
            System.out.println("Producto [22]: " + nombresGolosinas[2][2] + " -> " + (precioGolosinas[2][2] * cantidadComprada_Papa_Delta));
            System.out.println("Producto [23]: " + nombresGolosinas[2][3] + " -> " + (precioGolosinas[2][3] * cantidadComprada_Chicles_Menta));
            System.out.println("Producto [30]: " + nombresGolosinas[3][0] + " -> " + (precioGolosinas[3][0] * cantidadComprada_Monster));
            System.out.println("Producto [31]: " + nombresGolosinas[3][1] + " -> " + (precioGolosinas[3][1] * cantidadComprada_Crunch));
            System.out.println("Producto [32]: " + nombresGolosinas[3][2] + " -> " + (precioGolosinas[3][2] * cantidadComprada_Milkybar));
            System.out.println("Producto [33]: " + nombresGolosinas[3][3] + " -> " + (precioGolosinas[3][3] * cantidadComprada_Fritos));

        } else if (eleccionGanancias.equals("Ganancias totales") || eleccionGanancias.equals(("ganancias totales"))){

            System.out.println("**Ganancias totales**");
            System.out.println((precioGolosinas[0][0] * cantidadComprada_Kit_Kat) + (precioGolosinas[0][1] * cantidadComprada_Chicles_Fresa) + (precioGolosinas[0][2] * cantidadComprada_Lacasitos) + (precioGolosinas[0][3] * cantidadComprada_Palotes) + (precioGolosinas[1][0] * cantidadComprada_Kinder_Bueno) + (precioGolosinas[1][1] * cantidadComprada_Bolsa_Variada_Haribo) + (precioGolosinas[1][2] * cantidadComprada_Cheetos) + (precioGolosinas[1][3] * cantidadComprada_Twix) + (precioGolosinas[2][0] * cantidadComprada_Pringles) + (precioGolosinas[2][1] * cantidadComprada_M_MS) + (precioGolosinas[2][2] * cantidadComprada_Papa_Delta) + (precioGolosinas[2][3] * cantidadComprada_Chicles_Menta) + (precioGolosinas[3][0] * cantidadComprada_Monster) + (precioGolosinas[3][1] * cantidadComprada_Crunch) + (precioGolosinas[3][2] * cantidadComprada_Milkybar) + (precioGolosinas[3][3] * cantidadComprada_Fritos));
        }

        System.out.println("\n***Máquina apagada***");
    }
}