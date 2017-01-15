package pkg08hangman;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
public static void cls(){
        for(int i=0;i<10;i++)
            System.out.println();
    }
public static String loadCharacter(Scanner in){ //in progress
    String word=null;
    boolean foo=true;
    while(foo){
        try{
            word=in.nextLine();
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("You didn't enter a valid input!");
        }
        if(word!=null) foo=false;
    }
    return word; 
}

    public static void main(String[] args) throws IOException {
        System.out.println("Gracz1 wprowadza słowo dla gracza2: ");
        Scanner in=new Scanner(System.in);
            String word=in.nextLine();
            word=word.toLowerCase();
            char[] searchWord=new char[word.length()];
        
        for(int i=0;i<word.length();i++)
            searchWord[i]=word.charAt(i);
        Hangman game=new Hangman(searchWord);
        cls();
        String character;
        boolean play=true;
        while(play){
            System.out.println("Gracz2 wprowadza literę:");
            character=loadCharacter(in);
                game.start(character.charAt(0));
                game.show();
        }
    }
}
