package pkg08hangman;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Gracz1 wprowadza słowo dla gracza2: ");
        Scanner in=new Scanner(System.in);
            String word=in.nextLine();
            word=word.toLowerCase();
            char[] searchWord=new char[word.length()];
        
        for(int i=0;i<word.length();i++)
            searchWord[i]=word.charAt(i);
        Hangman game=new Hangman(searchWord);
        
        boolean play=true;
        while(play){
            System.out.println("Gracz2 wprowadza literę:");
            String character=in.nextLine();
                game.start(character.charAt(0));
                game.show();
                
        }
        
        
    }
    
}
