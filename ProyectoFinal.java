import java.util.Scanner;

public class ProyectoFinal {
    

    public static int opcionMenu=0;

    public static Scanner s = new Scanner(System.in);

    public static double resultadocm = 0, resultadomill = 0, resultadopies = 0, resultadopul = 0, resultadokm = 0, cant = 0, Resultado, kilos;





    public static void conversionkilometros(double cant) {
        resultadocm = cant * 1000;
        resultadomill = cant * 0.6214;
        resultadopies = cant * 3280.84;
        resultadomill = cant * 39370.08;
        System.out.println("            ");
        System.out.println("Ingresaste la canitdad de: "+cant+" Kilometros");
        System.out.println("La cantidad convertida a Centimetros (Cm) es: " + resultadocm);
        System.out.println("La cantidad convertida a Millas (Mi) es: " + resultadomill);
        System.out.println("La cantidad convertida a Pies (Ft) es: " + resultadopies);
        System.out.println("La cantidad convertida a Pulgadas (In) es: " + resultadopul);
        System.out.println("            ");
    }

    public static double KilometrosyMillas(double cant) {
        resultadokm = cant * 0.00001;;
        resultadomill = cant * 0.0000062137;
        System.out.println("La cantidad convertida a Millas (Mi) es: " + resultadomill);
        return resultadokm;
    }

    public static double PiesyPulgadas(double cant) {
        resultadopies = cant * 0.032808;
        resultadopul = cant * 0.393701;
        System.out.println("La cantidad convertida a Pulgadas (In) es: " + resultadopul);
        return resultadopies;
    }

    public static void conversionMillas(double cant) {
        resultadokm = cant * 1.6093;
        resultadocm = cant * 160934.4;
        resultadopies = cant * 5280;
        resultadopul = cant * 63360;
        System.out.println("            ");
        System.out.println("La cantidad convertida a Kilometros (Km) es: " + resultadokm);
        System.out.println("La cantidad convertida a Centimetros (Cm) es: " + resultadocm);
        System.out.println("La cantidad convertida a Pies (Ft) es: " + resultadopies);
        System.out.println("La cantidad convertida a Pulgadas (In) es: " + resultadopul);
        System.out.println("            ");
    }

    public static double PieskilometrosCentimetros(double cant) {
        resultadokm = cant * 0.0003048;
        resultadocm = cant * 30.48;
        System.out.println("La cantidad convertida a Centimetros (Cm) es: " + resultadocm);
        return resultadokm;
    }

    public static double PiesaMillasPulgadas(double cant) {
        resultadomill = cant * 0.00018939;
        resultadopul = cant * 12;
        System.out.println("La cantidad convertida a Pulgadas (In) es: " + resultadopul);
        return resultadomill;
    }

    public static void ConversionPulgadas(double cant) {
        resultadokm = cant * 0.0000254;
        resultadocm = cant * 2.54;
        resultadomill = cant * 0.0000157828;
        resultadopies = cant * 0.083333;

        System.out.println("            ");
        System.out.println("La cantidad convertida a Kilometros (Km) es: " + resultadokm);
        System.out.println("La cantidad convertida a Centimetros (Cm) es: " + resultadocm);
        System.out.println("La cantidad convertida a Millas (Mi) es: " + resultadomill);
        System.out.println("La cantidad convertida a Pies (Ft) es: " + resultadopies);
        System.out.println("            ");
    }

    public static double Libra() {
        System.out.println("Que cantidad en libras quieres calcular");
        double libras = s.nextDouble();
        Resultado = libras / 2.205;
        System.out.println("Equivalencia en kilogramos: " + Resultado);
        Resultado = libras * 16;
        System.out.println("Equivalencia en onzas: " + Resultado);
        Resultado = libras * 453.592;
        System.out.println("Equivalencia en gramos: " + Resultado);
        return Resultado;
    }

    public static double kilo() {
        System.out.println("Que cantidad en kilogramos quieres calcular");
        double kilos = s.nextDouble();
        Resultado = kilos * 2.20462;
        System.out.println("Equivalencia en libra: " + Resultado);
        Resultado = kilos * 35.274;
        System.out.println("Equivalencia en onzas: " + Resultado);
        Resultado = kilos * 1000;
        System.out.println("Equivalencia en gramos: " + Resultado);
        return Resultado;
    }

    public static double Onzas(double o, double R) {
        R = o / 35.274;
        return R;
    }

    public static double Onzas1(double o, double R) {
        R = o / 16;
        return R;
    }

    public static double Onzas2(double o, double R) {
        R = o * 28.3495;
        return R;
    }

    public static void Gramo() {
        System.out.println("Que cantidad en gramos quieres calcular");
        double gramos = s.nextDouble();
        Resultado = gramos / 28.5;
        System.out.println("Equivalencia en libra: " + Resultado);
        Resultado = gramos / 453.6;
        System.out.println("Equivalencia en kilogramo: " + Resultado);
        Resultado = gramos / 1000;
        System.out.println("Equivalencia en onzas: " + Resultado);
    }

    public static double Celsius() {
        System.out.println("Ingresa los grados celsius que quiere convertir");
        double c = s.nextDouble();
        Resultado = (c * (9 / 2)) + 32;
        System.out.println("La converion a Fahrenheit seria: " + Resultado);
        Resultado = c + 273.15;
        System.out.println("La conversion a Kelvin seria: " + Resultado);
        return Resultado;
    }

    public static void Fahrenheit() {
        System.out.println("Ingrese los grados fahrenheit que quiere convertir");
        double f = s.nextDouble();
        Resultado = (f - 32) * (5 / 9);
        System.out.println("La conversion a Celsius seria: " + Resultado);
        Resultado = (f - 32) * (5 / 9) + 273.15;
        System.out.println("La conversion a Kelvin seria: " + Resultado);

    }

    public static double Kelvin() {
        System.out.println("Ingrese los grados kelvin que quiere convertir");
        kilos = s.nextDouble();
        Resultado = kilos - 273.15;
        System.out.println("La conversion a celcius es: " + Resultado);
        Resultado = (kilos - 273.15) * 9 / 5 + 32;
        System.out.println("La conversion a Fahrenheit es: " + Resultado);
        return Resultado;
    }


    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println("Selecciona una opcion del menu principal");

        do {

            System.out.println("***Menu Principal***");
            System.out.println("1. Aritmetica");
            System.out.println("2. Conversiones");
            System.out.println("3. Salir");
            opcionMenu = s.nextInt();
            System.out.println("  ");

            switch (opcionMenu) {

                case 1:
                    break;

                case 2:

                    do {
                        System.out.println("***MENU GENERAL DE CONVERSIONES***");
                        System.out.println("1. Longitud");
                        System.out.println("2. Masa");
                        System.out.println("3. temperaturas");
                        System.out.println("4. Saludo");
                        System.out.println("5. Regresar");
                        opcionMenu = s.nextInt();
                        System.out.println("  ");

                        switch (opcionMenu) {

                            case 1:

                                do {
                                    System.out.println("  ");
                                    System.out.println("***Menu de conversiones de longitud***");
                                    System.out.println("1- Conversor de Kilometros");
                                    System.out.println("2- Conversor de Centimetros");
                                    System.out.println("3- Conversor de Millas");
                                    System.out.println("4- Conversor de Pies");
                                    System.out.println("5- Conversor de Pulgadas");
                                    System.out.println("6- Regresar al menu de conversiones general");
                                    opcionMenu = s.nextInt();
                                    System.out.println("  ");

                                    switch (opcionMenu) {

                                        case 1:

                                            System.out.println("¿Que cantidad de Kilometros (Km) desea convertir?");
                                            cant = s.nextDouble();
                                            conversionkilometros(cant);

                                            System.out.println("  ");
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 6;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 2:

                                            do {
                                                System.out.println("  ");
                                                System.out.println("¿Que desea hacer?");
                                                System.out.println("1-. Convertir de Centimetros a  Kilometros (Km) y Millas(Mi)");
                                                System.out.println("2-. Convertir de Centimetros a Pies (Ft) y Pulgadas(In)");
                                                System.out.println("3-. Regresar");
                                                System.out.println("   ");
                                                opcionMenu = s.nextInt();
                                                System.out.println("  ");

                                                switch (opcionMenu) {

                                                    case 1:
                                                        System.out.println("Que cantidad de Centimetros (Cm) vas a convertir?");
                                                        cant = s.nextDouble();
                                                        System.out.println("La cantidad convertida a Kilometros (Km) es: "+ KilometrosyMillas(cant));
                                                        System.out.println(" ");
                                                        System.out.println("¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                                        System.out.println("1-Regresar al menu principal");
                                                        System.out.println("2-Continuar en el menu actual");
                                                        opcionMenu = s.nextInt();
                                                        if (opcionMenu == 1) {
                                                            opcionMenu = 3;
                                                            System.out.println(" ");
                                                        }
                                                        break;

                                                    case 2:
                                                        System.out.println("Que cantidad de Centimetros (Cm) vas a convertir?");
                                                        cant = s.nextDouble();
                                                        System.out.println("La cantidad convertida a Pies (Ft) es: "+ PiesyPulgadas(cant));
                                                        System.out.println(" ");

                                                        System.out.println("¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                                        System.out.println("1-Regresar al menu principal");
                                                        System.out.println("2-Continuar en el menu actual");
                                                        opcionMenu = s.nextInt();
                                                        if (opcionMenu == 1) {
                                                            opcionMenu = 3;
                                                            System.out.println(" ");

                                                        }
                                                        break;

                                                    case 3:
                                                        System.out.println("Regresando");

                                                        break;

                                                    default:
                                                        System.out.println("Opcion no valida");
                                                }
                                            } while (opcionMenu != 3);

                                            break;

                                        case 3:
                                            System.out.println("Que cantidad de Millas (Mi) vas a convertir?");
                                            cant = s.nextDouble();
                                            conversionMillas(cant);
                                            System.out.println(" ");
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 6;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 4:
                                            do {
                                                System.out.println("  ");
                                                System.out.println("¿Que desea hacer?");
                                                System.out.println(
                                                        "1-. Convertir de Pies (Ft) a  Kilometros (Km) y Centimetros(Cm)");
                                                System.out.println(
                                                        "2-. Convertir de Centimetros (cm) a Millas (Mi) y Pulgadas(In)");
                                                System.out.println("3-. Regresar");
                                                System.out.println("  ");
                                                opcionMenu = s.nextInt();
                                                System.out.println(" ");

                                                switch (opcionMenu) {

                                                    case 1:
                                                        System.out.println("Que cantidad de Pies (Ft) vas a convertir?");
                                                        cant = s.nextDouble();
                                                        System.out
                                                                .println("La cantidad convertida a Kilometros (Km) es: "+ KilometrosyMillas(cant));
                                                        System.out.println(" ");
                                                        System.out.println("¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                                        System.out.println("1-Regresar al menu principal");
                                                        System.out.println("2-Continuar en el menu actual");
                                                        opcionMenu = s.nextInt();
                                                        if (opcionMenu == 1) {
                                                            opcionMenu = 6;
                                                            System.out.println(" ");
                                                        }
                                                        break;

                                                    case 2:
                                                        System.out
                                                                .println("Que cantidad de Pies (Ft) vas a convertir?");
                                                        cant = s.nextDouble();
                                                        System.out.println("La cantidad convertida a Millas (Mi) es: "
                                                                + PiesyPulgadas(cant));
                                                        System.out.println(" ");
                                                        System.out.println(
                                                                "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                                        System.out.println("1-Regresar al menu principal");
                                                        System.out.println("2-Continuar en el menu actual");
                                                        opcionMenu = s.nextInt();
                                                        if (opcionMenu == 1) {
                                                            opcionMenu = 6;
                                                            System.out.println(" ");
                                                        }
                                                        break;

                                                    case 3:
                                                        System.out.println("Regresando");
                                                        break;

                                                    default:
                                                        System.out.println("Opcion no valida");
                                                }
                                            } while (opcionMenu != 3);
                                            break;

                                        case 5:
                                            System.out.println("Que cantidad de Pulgadas (In) desea convertir?");
                                            cant = s.nextDouble();
                                            ConversionPulgadas(cant);
                                            System.out.println(" ");
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 6;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 6:
                                            System.out.println("Regresando al menu \n Hasta la proximaaaaaaaa");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida mi buen");
                                    }
                                } while (opcionMenu != 6);
                                break;

                            case 2:

                                do {
                                    System.out.println("***Menu de converiones en masas***");
                                    System.out.println("1. Conversion de libras");
                                    System.out.println("2. Conversion de kilogramos");
                                    System.out.println("3. Conversion de onzas");
                                    System.out.println("4. Conversion de gramos");
                                    System.out.println("5. Regresar");
                                    opcionMenu = s.nextInt();

                                    switch (opcionMenu) {

                                        case 1:
                                            System.out.println(Libra());
                                            System.out.println(" ");
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 5;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 2:
                                            System.out.println(kilo());
                                            System.out.println(" ");
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 5;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("¿Que cantidad en onzas desea convertir?");
                                            double o = s.nextDouble();
                                            System.out.println("Equivalencia en libra: " + (Onzas1(o, Resultado)));
                                            System.out.println("Equivalencia en kilogramo: " + (Onzas(o, Resultado)));
                                            System.out.println("Equivalencia en gramos: " + (Onzas2(o, Resultado)));
                                            System.out.println(" ");
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 5;
                                                System.out.println(" ");
                                            }

                                            break;

                                        case 4:
                                            Gramo();
                                            System.out.println(" ");
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 5;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 5:
                                            System.out.println("Regresando...");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                } while (opcionMenu != 5);
                                break;

                            case 3:

                                do {
                                    System.out.println("***Menu de conversiones de temperaturas***");
                                    System.out.println("1. Converion de grados Celsius");
                                    System.out.println("2. Conversion de grados Fahrenheit");
                                    System.out.println("3. Conversion de grados Kelvin");
                                    System.out.println("4. Regresar");
                                    opcionMenu = s.nextInt();

                                    switch (opcionMenu) {

                                        case 1:
                                            System.out.println(Celsius());
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 5;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 2:
                                            Fahrenheit();
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 5;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 3:
                                            Kelvin();
                                            System.out.println(
                                                    "¿Deseas regeresar al menu principal o continuar en el menu actual?");
                                            System.out.println("1-Regresar al menu principal");
                                            System.out.println("2-Continuar en el menu actual");
                                            opcionMenu = s.nextInt();
                                            if (opcionMenu == 1) {
                                                opcionMenu = 5;
                                                System.out.println(" ");
                                            }
                                            break;

                                        case 4:
                                            System.out.println("Regresando....");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                } while (opcionMenu != 4);
                                break;

                            case 4:
                                System.out.println("Ponganos 10 maestra");
                                break;

                            case 5:
                                System.out.println("Regresando...");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                        }
                    } while (opcionMenu != 5);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcionMenu != 3);
    }
}

