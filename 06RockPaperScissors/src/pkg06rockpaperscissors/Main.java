package pkg06rockpaperscissors;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zaczynamy grę w papier-kamień-nożyce!\n"
                + "Wybierz:\n 1.Papier\n 2.Kamień\n 3.Nożyce");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        
        Random random=new Random();
        int com=random.nextInt(3)+1;
        String choiceCom=null;
        if(com==1) choiceCom="Papier";
        else if(com==2) choiceCom="Kamień";
        else if(com==3) choiceCom="Nożyce";
        
        System.out.println("Komputer wybrał: "+choiceCom);
        Check game=new Check(choice,com);
        
        //lizard, spock???
        //zrobić grę przy pomocy typu wyliczeniowego enum
    }
}
