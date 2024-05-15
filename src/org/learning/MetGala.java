package org.learning;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] User = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        System.out.println("Dimmi il tuo nome per sapere se sei nella lista degli invitati");
        String name = scanner.nextLine();
        for (int i = 0; i < User.length; i++) {
            if(User[i].equals(name)){
                System.out.println("Sei nella lista, puoi entrare");
                break;
            }else if(i == User.length-1){
                System.out.println("Non sei nella lista, non puoi entrare");
            }
        }
    }
}
