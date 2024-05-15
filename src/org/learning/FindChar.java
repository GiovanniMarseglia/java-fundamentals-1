package org.learning;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una lettera e ti dirò la seguenza più lunga e da che posizione inizia");
        int maxsequence = 0,startsequence = 0, sequence = 0,maxstartsequence=0;

        String listLetter = "jgyhfttttbdbtdtttt";
        String letter = scanner.nextLine();
        for (int i = 0; i < listLetter.length(); i++) {
                boolean flag = false;
                if(listLetter.charAt(i) == letter.charAt(0)){
                    for (int j = i; j < listLetter.length(); j++) {
                        if(listLetter.charAt(j) == letter.charAt(0)) {
                                if (!flag){
                                    startsequence = j;
                                    flag = true;
                                }

                                sequence++;
                                if(sequence >= maxsequence){
                                    maxsequence=sequence;
                                    maxstartsequence = startsequence;
                                }
                        }else{
                            sequence=0;
                            break;
                        }
                        i++;

                    }
                }
        }
        if(maxsequence==0){
            System.out.println("Non è presente nessun caratere uguale a quello inserito");
        }else{
            System.out.println("La sequenza più lunga è composta da: " + maxsequence + " caratteri");
            System.out.println("la sequenza più lunga inizia dall'indice': " + maxstartsequence);
        }

        scanner.close();
    }
}
