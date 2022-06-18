public class Main {
    public static void main(String[] args) {
        //EJERCICIO IF

        int numerolf = 0;

        if (numerolf < 0) {
            System.out.println("El numero " + numerolf + " es negativo");
        } if (numerolf >= 0) {
            System.out.println("El numero " + numerolf + " es positivo");
        }

        //EJERCICIO WHILE

        int numeroWhile = 0;

        while (numeroWhile <= 3){
            System.out.println("El numero While " + numeroWhile);
            numeroWhile++;
        }

        //EJERCICIO DOWHILE

        int numeroDoWhile = 3;

        do {
            System.out.println("El numero Do While es " + numeroDoWhile);
            numeroDoWhile--;

        }while (numeroDoWhile > 3);

        //EJERCICIO FOR
        int numeroFor = 0;

        for (;numeroFor <= 3; numeroFor++){
            System.out.println("El numero for es " + numeroFor);
        }

        //EJERCICIO SWITCH
        var estacion = "Primavera";

        switch (estacion) {
            case "Hola":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Bienvenido al Valhalla aqui no hay estaciones del año");
                break;
        }

        }

}


