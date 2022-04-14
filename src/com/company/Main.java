package com.company;

public class Main {

    public static void main(String[] args) {

        // Bucle If
        var numeroIf = -1;

        if(numeroIf > 0)
        {
            System.out.println("el numero es positivo");
        }
        else
        {
            System.out.println("El numero es negativo");
        }

        //##########Bucle While#############
       int numerowhile = 0;
        while(numerowhile < 3)
        {
            System.out.println(numerowhile);
            numerowhile++;

        }

        int numeroDowhile = 2;
        do {
            System.out.println("Se ejecuta una sola vez el numero: "+ numeroDowhile);
            numeroDowhile++;
        }
        while (numeroDowhile < 3);

        //###### Bucle for ###################
        for (int numerofor = 0; numerofor <= 3;numerofor++)
        {
            System.out.println("Resultado: "+numerofor);
        }

        //########### Bucle switch #######

        var estación = "Invierno";
        switch (estación)
        {
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño");
                break;
            case "Invierno":
                System.out.println("La estacion es invierno");
                break;
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            default:
                System.out.println("El valor ingresado no es una estacion ");
                break;

        }
    }
}
