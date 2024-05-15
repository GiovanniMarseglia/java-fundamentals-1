package org.learning;

import java.util.Scanner;

public class TopFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti piatti vuoi inserire?(minimo 5 e massimo 10)");
        int i=0;
        int plateCount = 0;
//        controllo se il numero è compreso tra 5 e 10
            while(i != 1) {

                plateCount = Integer.parseInt(scanner.nextLine());
                if(plateCount >= 5 && plateCount <=10){
                    i=1;
                }else{
                    System.out.println("Numero non compreso tra 5 e 10...Inserisci nuovamente il numero");

                }
            }





        System.out.println("inserisci la lista dei tuoi piatti preferiti");
        String[] foodList = new String[plateCount];

        for (int j = 0; j < plateCount ; j++) {
            System.out.println("Inserisci il piatto alla posizione " + (j+1));
            foodList[j] = scanner.nextLine();
        }

        System.out.println("Nella lista ci sono " + foodList.length + " cibi" );
        System.out.println("Al primo posto della lista c'è " + foodList[0]);
        System.out.println("All'ultimo posto della lista c'è " + foodList[foodList.length-1]);
        System.out.println("Il piatto che si trova nel mezzo è " + foodList[foodList.length / 2]);

        scanner.close();
    }
}
