package pkg00namegenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner choice=new Scanner(System.in);
        System.out.println("Wybierz płeć:\n 1.Mężczyna \n 2.Kobieta \nInny znak spowoduje zamknięcie programu.");
        int i=choice.nextInt();
        Generator generator=new Generator();
        if(i==1)
            generator.randomName(true);
        else if(i==2)
            generator.randomName(false);
        else
            System.exit(0);
    }
    
}
