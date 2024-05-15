package org.learning;


import java.util.Scanner;

public class CalcoloBiglietto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km, age;
        double totalPrice, sale;
        double priceKm=0.21;
        System.out.println("Quanti chilometri vuoi percorrere?");
        km = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserire la propria età");
        age = Integer.parseInt(scanner.nextLine());
        totalPrice=km * priceKm;
        System.out.println("Il prezzo del viaggio è di: " + totalPrice + "€");
        if(age<18){
            sale = totalPrice * 25 / 100;
            totalPrice = totalPrice - sale;
            System.out.println("Per lei è stato riservato uno sconto del 25%, il prezzo finale è di: " + totalPrice + "€");
        }else if(age>65){

            sale = totalPrice * 40 / 100;
            totalPrice = totalPrice - sale;
            System.out.println("Per lei è stato riservato uno sconto del 40%, il prezzo finale è di: " + totalPrice + "€");
        }

        scanner.close();
    }
}
