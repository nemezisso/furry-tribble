package higherlower;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        int i=random.nextInt(100);
        int choice;
        boolean trueFalse=true;
        
        System.out.println("Zaczynamy grę!");
        System.out.println("Podaj liczbę od 0 do 100:");
        
        int counter=0;
        choice=in.nextInt();
        while(trueFalse){
                if(choice==i){
                    counter++;
                    System.out.println("Brawo! Wygrałeś! Udało Ci się za "+counter+" razem.");
                    trueFalse=false;
                }
                else if(choice>i){
                    System.out.println("Za dużo! Podaj liczbę:");
                    choice=in.nextInt();
                    counter++;
                }
                else{
                    System.out.println("Za mało! Podaj liczbę:");
                    choice=in.nextInt();
                    counter++;
                }           
        }
    }
}
