package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        boolean apagarMaquina = false;

        while (!apagarMaquina) {
            mostrarMenu();

            int eleccion = in.nextInt();

            try {
                switch (eleccion) {
                    case 1:
                        if (Constantes.cantidad_Kit_Kat == 1 || Constantes.cantidad_Chicles_Fresa == 1 || Constantes.cantidad_Lacasitos == 1 || Constantes.cantidad_Palotes == 1 || Constantes.cantidad_Kinder_Bueno == 1 || Constantes.cantidad_Bolsa_Variada_Haribo == 1 || Constantes.cantidad_Cheetos == 1 || Constantes.cantidad_Twix == 1 || Constantes.cantidad_Pringles == 1 || Constantes.cantidad_MMs == 1 || Constantes.cantidad_Papa_Delta == 1 || Constantes.cantidad_Chicles_Menta == 1 || Constantes.cantidad_Monster == 1 || Constantes.cantidad_Crunch == 1 || Constantes.cantidad_Milkybar == 1 || Constantes.cantidad_Fritos == 1) {
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
                        apagarMaquina = true;
                        break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Carácter incorrecto, debes introducir un número!!");
                in.nextInt();
            }
        }
    }


    public static void mostrarMenu(){
        System.out.println("Bienvenido a la máquina expendedora, que deseas hacer??\n");

        System.out.println("Tecla 1: Comprar chucherias de la máquina.");
        System.out.println("Tecla 2: Ver las chucherias disponibles en la máquina.");
        System.out.println("Tecla 3: Rellenar la cantidad de las chucherias de la máquina.");
        System.out.println("Tecla 4: Apagar la máquina.\n");
    }


    public static void comprarChucherias(){
        System.out.println("\nIntroduce el dinero en la máquina:");

        Scanner in = new Scanner(System.in);
        double dineroCompra = in.nextDouble();

        System.out.println("\nCrédito: " + dineroCompra + "€");
        System.out.println("Introduce el código del producto que desees comprar, ej. '00' o '11':");

        Scanner in2 = new Scanner(System.in);
        String eleccioncompra = in2.next();

        switch (eleccioncompra){
            case "00":

                while (dineroCompra < Constantes.precioGolosinas[0][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[0][0]) {

                    Constantes.cantidad_Kit_Kat -= 1;
                    Constantes.cantidadComprada_Kit_Kat += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][0]);

                } else if (dineroCompra > Constantes.precioGolosinas[0][0]) {

                    double diferenciaPrecioKitKat = dineroCompra - Constantes.precioGolosinas[0][0];
                    Constantes.cantidad_Kit_Kat -= 1;
                    Constantes.cantidadComprada_Kit_Kat += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][0]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioKitKat * 100) / 100 + "€\n");
                }

                break;

            case "01":

                while (dineroCompra < Constantes.precioGolosinas[0][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero!!");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[0][1]) {

                    Constantes.cantidad_Chicles_Fresa -= 1;
                    Constantes.cantidadComprada_Chicles_Fresa += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][1]);

                } else if (dineroCompra > Constantes.precioGolosinas[0][1]) {

                    double diferenciaPrecioChiclesFresa = dineroCompra - Constantes.precioGolosinas[0][1];
                    Constantes.cantidad_Chicles_Fresa -= 1;
                    Constantes.cantidadComprada_Chicles_Fresa += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][1]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioChiclesFresa * 100) / 100 + "€\n");
                }

                break;

            case "02":

                while (dineroCompra < Constantes.precioGolosinas[0][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[0][2]) {

                    Constantes.cantidad_Palotes -= 1;
                    Constantes.cantidadComprada_Palotes += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][2]);

                } else if (dineroCompra > Constantes.precioGolosinas[0][2]) {

                    double diferenciaPrecioLacasitos = dineroCompra - Constantes.precioGolosinas[0][2];
                    Constantes.cantidad_Lacasitos -= 1;
                    Constantes.cantidadComprada_Lacasitos += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][2]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioLacasitos * 100) / 100 + "€\n");
                }

                break;

            case "03":

                while (dineroCompra < Constantes.precioGolosinas[0][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[0][3]) {

                    Constantes.cantidad_Palotes -= 1;
                    Constantes.cantidadComprada_Palotes += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][3]);

                } else if (dineroCompra > Constantes.precioGolosinas[0][3]) {

                    double diferenciaPrecioPalotes = dineroCompra - Constantes.precioGolosinas[0][3];
                    Constantes.cantidad_Palotes -= 1;
                    Constantes.cantidadComprada_Palotes += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[0][3]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioPalotes * 100) / 100 + "€\n");
                }

                break;

            case "10":

                while (dineroCompra < Constantes.precioGolosinas[1][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[1][0]) {

                    Constantes.cantidad_Kinder_Bueno -= 1;
                    Constantes.cantidadComprada_Kinder_Bueno += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][0]);

                } else if (dineroCompra > Constantes.precioGolosinas[1][0]) {

                    double diferenciaPrecioKinderBueno = dineroCompra - Constantes.precioGolosinas[1][0];
                    Constantes.cantidad_Kinder_Bueno -= 1;
                    Constantes.cantidadComprada_Kinder_Bueno += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][0]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioKinderBueno * 100) / 100 + "€\n");
                }

                break;

            case "11":

                while (dineroCompra < Constantes.precioGolosinas[1][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[1][1]) {

                    Constantes.cantidad_Bolsa_Variada_Haribo -= 1;
                    Constantes.cantidadComprada_Bolsa_Variada_Haribo += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][1]);

                } else if (dineroCompra > Constantes.precioGolosinas[1][1]) {

                    double diferenciaPrecioBolsaVariadaHaribo = dineroCompra - Constantes.precioGolosinas[1][1];
                    Constantes.cantidad_Bolsa_Variada_Haribo -= 1;
                    Constantes.cantidadComprada_Bolsa_Variada_Haribo += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][1]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioBolsaVariadaHaribo * 100) / 100 + "€\n");
                }

                break;

            case "12":

                while (dineroCompra < Constantes.precioGolosinas[1][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[1][2]) {

                    Constantes.cantidad_Cheetos -= 1;
                    Constantes.cantidadComprada_Cheetos += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][2]);

                } else if (dineroCompra > Constantes.precioGolosinas[1][2]) {

                    double diferenciaPrecioCheetos = dineroCompra - Constantes.precioGolosinas[1][2];
                    Constantes.cantidad_Cheetos -= 1;
                    Constantes.cantidadComprada_Cheetos += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][2]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioCheetos * 100) / 100 + "€\n");
                }

                break;

            case "13":

                while (dineroCompra < Constantes.precioGolosinas[1][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[1][3]) {

                    Constantes.cantidad_Twix -= 1;
                    Constantes.cantidadComprada_Twix += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][3]);

                } else if (dineroCompra > Constantes.precioGolosinas[1][3]) {

                    double diferenciaPrecioTwix = dineroCompra - Constantes.precioGolosinas[1][3];
                    Constantes.cantidad_Twix -= 1;
                    Constantes.cantidadComprada_Twix += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[1][3]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioTwix * 100) / 100 + "€\n");
                }

                break;

            case "20":

                while (dineroCompra < Constantes.precioGolosinas[2][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[2][0]) {

                    Constantes.cantidad_Pringles -= 1;
                    Constantes.cantidadComprada_Pringles += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][0]);

                } else if (dineroCompra > Constantes.precioGolosinas[2][0]) {

                    double diferenciaPrecioPringles = dineroCompra - Constantes.precioGolosinas[2][0];
                    Constantes.cantidad_Pringles -= 1;
                    Constantes.cantidadComprada_Pringles += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][0]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioPringles * 100) / 100 + "€\n");
                }

                break;

            case "21":

                while (dineroCompra < Constantes.precioGolosinas[2][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[2][1]) {

                    Constantes.cantidad_MMs -= 1;
                    Constantes.cantidadComprada_MMs += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][1]);

                } else if (dineroCompra > Constantes.precioGolosinas[2][1]) {

                    double diferenciaPrecioMMS = dineroCompra - Constantes.precioGolosinas[2][1];
                    diferenciaPrecioMMS -= 1;
                    Constantes.cantidadComprada_MMs += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][1]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioMMS * 100) / 100 + "€\n");
                }

                break;

            case "22":

                while (dineroCompra < Constantes.precioGolosinas[2][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[2][2]) {

                    Constantes.cantidad_Papa_Delta -= 1;
                    Constantes.cantidadComprada_Papa_Delta += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][2]);

                } else if (dineroCompra > Constantes.precioGolosinas[2][2]) {

                    double diferenciaPrecioPapaDelta = dineroCompra - Constantes.precioGolosinas[2][2];
                    Constantes.cantidad_Papa_Delta -= 1;
                    Constantes.cantidadComprada_Papa_Delta += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][2]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioPapaDelta * 100) / 100 + "€\n");
                }

                break;

            case "23":

                while (dineroCompra < Constantes.precioGolosinas[2][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[2][3]) {

                    Constantes.cantidad_Chicles_Menta -= 1;
                    Constantes.cantidadComprada_Chicles_Menta += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][3]);

                } else if (dineroCompra > Constantes.precioGolosinas[2][3]) {

                    double diferenciaPrecioChiclesMenta = dineroCompra - Constantes.precioGolosinas[2][3];
                    Constantes.cantidad_Chicles_Menta -= 1;
                    Constantes.cantidadComprada_Chicles_Menta += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[2][3]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioChiclesMenta * 100) / 100 + "€\n");
                }

                break;

            case "30":

                while (dineroCompra < Constantes.precioGolosinas[3][0]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[3][0]) {

                    Constantes.cantidad_Monster -= 1;
                    Constantes.cantidadComprada_Monster += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][0]);

                } else if (dineroCompra > Constantes.precioGolosinas[3][0]) {

                    double diferenciaPrecioMonster = dineroCompra - Constantes.precioGolosinas[3][0];
                    Constantes.cantidad_Monster -= 1;
                    Constantes.cantidadComprada_Monster += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][0]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioMonster * 100) / 100 + "€\n");
                }

                break;

            case "31":

                while (dineroCompra < Constantes.precioGolosinas[3][1]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[3][1]) {

                    Constantes.cantidad_Crunch -= 1;
                    Constantes.cantidadComprada_Crunch += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][1]);

                } else if (dineroCompra > Constantes.precioGolosinas[3][1]) {

                    double diferenciaPrecioCrunch = dineroCompra - Constantes.precioGolosinas[3][1];
                    Constantes.cantidad_Crunch -= 1;
                    Constantes.cantidadComprada_Crunch += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][1]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioCrunch * 100) / 100 + "€\n");
                }

                break;

            case "32":

                while (dineroCompra < Constantes.precioGolosinas[3][2]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[3][2]) {

                    Constantes.cantidad_Milkybar -= 1;
                    Constantes.cantidadComprada_Milkybar += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][2]);

                } else if (dineroCompra > Constantes.precioGolosinas[3][2]) {

                    double diferenciaPrecioMilkybar = dineroCompra - Constantes.precioGolosinas[3][2];
                    Constantes.cantidad_Milkybar -= 1;
                    Constantes.cantidadComprada_Milkybar += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][2]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioMilkybar * 100) / 100 + "€\n");
                }

                break;

            case "33":

                while (dineroCompra < Constantes.precioGolosinas[3][3]) {
                    System.out.println("\nTe falta dinero!! Introduce más dinero");

                    dineroCompra += in.nextDouble();
                }

                if (dineroCompra == Constantes.precioGolosinas[3][3]) {

                    Constantes.cantidad_Fritos -= 1;
                    Constantes.cantidadComprada_Fritos += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][3]);

                } else if (dineroCompra > Constantes.precioGolosinas[3][3]) {

                    double diferenciaPrecioFritos = dineroCompra - Constantes.precioGolosinas[3][3];
                    Constantes.cantidad_Fritos -= 1;
                    Constantes.cantidadComprada_Fritos += 1;

                    System.out.println("\nAquí tienes tu producto: " + Constantes.nombresGolosinas[3][3]);
                    System.out.println("Dinero de vuelta: " + (double) Math.round(diferenciaPrecioFritos * 100) / 100 + "€\n");
                }

                break;
        }
    }


    public static void verChucherias(){
        System.out.println("\n***Chucherías disponibles en la máquina***\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("[" + i + j + "] || " + Constantes.nombresGolosinas[i][j] + " || " + Constantes.precioGolosinas[i][j] + "€");
            }
        }
    }


    public static void rellenarMaquina(){
        System.out.println("\nHola, introduce la contraseña para rellenar la máquina:");

        Scanner in = new Scanner(System.in);
        String contrasenaRellenarMaquina= in.next();

        if (contrasenaRellenarMaquina.equals("MaquinaExpendedora2022")) {

            System.out.println("\nIntroduce la posición de la chuchería:");

            Scanner inPosicionChucheria = new Scanner(System.in);
            String posicionchucheriaRellenar = inPosicionChucheria.next();

            System.out.println("\nIntroduce la cantidad para rellenar:");

            Scanner inCantidadRellenar = new Scanner(System.in);
            int cantidadRellenar = inCantidadRellenar.nextInt();

            switch (posicionchucheriaRellenar) {
                case "00": {

                    if (Constantes.cantidad_Kit_Kat == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Kit_Kat += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kit_Kat == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Kit_Kat += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kit_Kat == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Kit_Kat += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kit_Kat == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Kit_Kat += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kit_Kat == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "01": {

                    if (Constantes.cantidad_Chicles_Fresa == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Chicles_Fresa += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Fresa == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Chicles_Fresa += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Fresa == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Chicles_Fresa += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Fresa == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Chicles_Fresa += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Fresa == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "02": {

                    if (Constantes.cantidad_Lacasitos == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Lacasitos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Lacasitos == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Lacasitos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Lacasitos == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Lacasitos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Lacasitos == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Lacasitos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Lacasitos == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "03": {

                    if (Constantes.cantidad_Palotes == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Palotes += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Palotes == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Palotes += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Palotes == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Palotes += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Palotes == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Palotes += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Palotes == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "10": {

                    if (Constantes.cantidad_Kinder_Bueno == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Kinder_Bueno += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kinder_Bueno == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Kinder_Bueno += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kinder_Bueno == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Kinder_Bueno += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kinder_Bueno == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Kinder_Bueno += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Kinder_Bueno == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "11": {

                    if (Constantes.cantidad_Bolsa_Variada_Haribo == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Bolsa_Variada_Haribo += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Bolsa_Variada_Haribo == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Bolsa_Variada_Haribo += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Bolsa_Variada_Haribo == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Bolsa_Variada_Haribo += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Bolsa_Variada_Haribo == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Bolsa_Variada_Haribo += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Bolsa_Variada_Haribo == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "12": {

                    if (Constantes.cantidad_Cheetos == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Cheetos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Cheetos == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Cheetos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Cheetos == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Cheetos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Cheetos == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Cheetos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Cheetos == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "13": {

                    if (Constantes.cantidad_Twix == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Twix += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Twix == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Twix += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Twix == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Twix += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Twix == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Twix += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Twix == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "20": {

                    if (Constantes.cantidad_Pringles == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Pringles += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Pringles == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Pringles += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Pringles == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Pringles += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Pringles == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Pringles += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Pringles == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "21": {

                    if (Constantes.cantidad_MMs == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_MMs += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_MMs == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_MMs += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_MMs == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_MMs += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_MMs == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_MMs += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_MMs == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "22": {

                    if (Constantes.cantidad_Papa_Delta == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Papa_Delta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Papa_Delta == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Papa_Delta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Papa_Delta == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Papa_Delta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Papa_Delta == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Papa_Delta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Papa_Delta == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "23": {

                    if (Constantes.cantidad_Chicles_Menta == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Chicles_Menta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Menta == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Chicles_Menta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Menta == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Chicles_Menta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Menta == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Chicles_Menta += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Chicles_Menta == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "30": {

                    if (Constantes.cantidad_Monster == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Monster += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Monster == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Monster += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Monster == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Monster += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Monster == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Monster += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Monster == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "31": {

                    if (Constantes.cantidad_Crunch == 1){

                        while (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 4) {
                            Constantes.cantidad_Crunch += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Crunch == 2) {

                        while (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 3) {
                            Constantes.cantidad_Crunch += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Crunch == 3) {

                        while (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 2) {
                            Constantes.cantidad_Crunch += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Crunch == 4) {

                        while (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");

                            cantidadRellenar = inCantidadRellenar.nextInt();
                        }

                        if (cantidadRellenar == 1) {
                            Constantes.cantidad_Crunch += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Crunch == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "32": {

                    if (Constantes.cantidad_Milkybar == 1){

                        if (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Milkybar += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Milkybar == 2) {

                        if (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Milkybar += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Milkybar == 3) {

                        if (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Milkybar += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Milkybar == 4) {

                        if (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Milkybar += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Milkybar == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
                case "33": {

                    if (Constantes.cantidad_Fritos == 1){

                        if (cantidadRellenar > 4) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Fritos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Fritos == 2) {

                        if (cantidadRellenar > 3) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Fritos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Fritos == 3) {

                        if (cantidadRellenar > 2) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Fritos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Fritos == 4) {

                        if (cantidadRellenar > 1) {
                            System.out.println("\nTe has pasado, introduce una cantidad correcta!!");
                        } else {
                            Constantes.cantidad_Fritos += cantidadRellenar;
                        }

                    } else if (Constantes.cantidad_Fritos == 5)  {
                        System.out.println("\nNo puedes rellenar más, la cantidad está completa!!");
                    }

                    break;
                }
            }

        } else {
            System.out.println("Contraseña incorrecta!!");
            System.out.println("Apagando máquina...");
        }
    }

    public static void apagarMaquina(){
        System.out.println("\nComienza el recuento de ganancias obtenidas...");

        System.out.println("\nQuieres comprobar las ganancias por producto (0) o las ganacias totales (1)??");

        Scanner in = new Scanner(System.in);
        int eleccionGanancias = in.nextInt();

        System.out.println("\n***Ganancias obtenidas el " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "***");

        if (eleccionGanancias == 0){

            System.out.println("Producto [00]: " + Constantes.nombresGolosinas[0][0] + " -> " + (Constantes.precioGolosinas[0][0] * Constantes.cantidadComprada_Kit_Kat) + "€");
            System.out.println("Producto [01]: " + Constantes.nombresGolosinas[0][1] + " -> " + (Constantes.precioGolosinas[0][1] * Constantes.cantidadComprada_Chicles_Fresa) + "€");
            System.out.println("Producto [02]: " + Constantes.nombresGolosinas[0][2] + " -> " + (Constantes.precioGolosinas[0][2] * Constantes.cantidadComprada_Lacasitos) + "€");
            System.out.println("Producto [03]: " + Constantes.nombresGolosinas[0][3] + " -> " + (Constantes.precioGolosinas[0][3] * Constantes.cantidadComprada_Palotes) + "€");
            System.out.println("Producto [10]: " + Constantes.nombresGolosinas[1][0] + " -> " + (Constantes.precioGolosinas[1][0] * Constantes.cantidadComprada_Kinder_Bueno) + "€");
            System.out.println("Producto [11]: " + Constantes.nombresGolosinas[1][1] + " -> " + (Constantes.precioGolosinas[1][1] * Constantes.cantidadComprada_Bolsa_Variada_Haribo) + "€");
            System.out.println("Producto [12]: " + Constantes.nombresGolosinas[1][2] + " -> " + (Constantes.precioGolosinas[1][2] * Constantes.cantidadComprada_Cheetos) + "€");
            System.out.println("Producto [13]: " + Constantes.nombresGolosinas[1][3] + " -> " + (Constantes.precioGolosinas[1][3] * Constantes.cantidadComprada_Twix) + "€");
            System.out.println("Producto [20]: " + Constantes.nombresGolosinas[2][0] + " -> " + (Constantes.precioGolosinas[2][0] * Constantes.cantidadComprada_Pringles) + "€");
            System.out.println("Producto [21]: " + Constantes.nombresGolosinas[2][1] + " -> " + (Constantes.precioGolosinas[2][1] * Constantes.cantidad_MMs) + "€");
            System.out.println("Producto [22]: " + Constantes.nombresGolosinas[2][2] + " -> " + (Constantes.precioGolosinas[2][2] * Constantes.cantidadComprada_Papa_Delta) + "€");
            System.out.println("Producto [23]: " + Constantes.nombresGolosinas[2][3] + " -> " + (Constantes.precioGolosinas[2][3] * Constantes.cantidadComprada_Chicles_Menta) + "€");
            System.out.println("Producto [30]: " + Constantes.nombresGolosinas[3][0] + " -> " + (Constantes.precioGolosinas[3][0] * Constantes.cantidadComprada_Monster) + "€");
            System.out.println("Producto [31]: " + Constantes.nombresGolosinas[3][1] + " -> " + (Constantes.precioGolosinas[3][1] * Constantes.cantidadComprada_Crunch) + "€");
            System.out.println("Producto [32]: " + Constantes.nombresGolosinas[3][2] + " -> " + (Constantes.precioGolosinas[3][2] * Constantes.cantidadComprada_Milkybar) + "€");
            System.out.println("Producto [33]: " + Constantes.nombresGolosinas[3][3] + " -> " + (Constantes.precioGolosinas[3][3] * Constantes.cantidadComprada_Fritos) + "€");

        } else if (eleccionGanancias == 1){

            System.out.println("**Ganancias totales**");
            System.out.println((double) Math.round(((Constantes.precioGolosinas[0][0] * Constantes.cantidadComprada_Kit_Kat) + (Constantes.precioGolosinas[0][1] * Constantes.cantidadComprada_Chicles_Fresa) + (Constantes.precioGolosinas[0][2] * Constantes.cantidadComprada_Lacasitos) + (Constantes.precioGolosinas[0][3] * Constantes.cantidadComprada_Palotes) + (Constantes.precioGolosinas[1][0] * Constantes.cantidadComprada_Kinder_Bueno) + (Constantes.precioGolosinas[1][1] * Constantes.cantidadComprada_Bolsa_Variada_Haribo) + (Constantes.precioGolosinas[1][2] * Constantes.cantidadComprada_Cheetos) + (Constantes.precioGolosinas[1][3] * Constantes.cantidadComprada_Twix) + (Constantes.precioGolosinas[2][0] * Constantes.cantidadComprada_Pringles) + (Constantes.precioGolosinas[2][1] * Constantes.cantidadComprada_MMs) + (Constantes.precioGolosinas[2][2] * Constantes.cantidadComprada_Papa_Delta) + (Constantes.precioGolosinas[2][3] * Constantes.cantidadComprada_Chicles_Menta) + (Constantes.precioGolosinas[3][0] * Constantes.cantidadComprada_Monster) + (Constantes.precioGolosinas[3][1] * Constantes.cantidadComprada_Crunch) + (Constantes.precioGolosinas[3][2] * Constantes.cantidadComprada_Milkybar) + (Constantes.precioGolosinas[3][3] * Constantes.cantidadComprada_Fritos))  * 100) / 100 + "€");
        }

        System.out.println("\n***Máquina apagada***");
    }
}