package pkg08hangman;

import com.sun.media.jfxmedia.events.PlayerEvent;
import java.util.ArrayList;

public class Hangman {
    private char[] searchWord;
    private ArrayList playerWord;
    private ArrayList hiddenCharacter;
    private int chance=0;
    
    public Hangman(char[] searchWord){
        this.searchWord=searchWord;
            hiddenCharacter=new ArrayList();
            hiddenCharacter.add(0, "-");
            playerWord= new ArrayList(searchWord.length);
        
        for(int i=0;i<searchWord.length;i++)
            playerWord.add(hiddenCharacter.get(0));
        char space=' ';
        start(space);
    }
    
    public void start(char character){
        int verInfo=0;
        
        for(int i=0;i<searchWord.length;i++){
            if(checkWord(i,character)){
                playerWord.set(i, character);
                verInfo++;
            }
        }
        if(verInfo==0)
            chance++;
        
        verificationGame();
        
        System.out.println();
    }
    private boolean checkWord(int index,char character){   
            if(searchWord[index]==character)
                return true;
            else
                return false;
    }
    public void show(){
        for(Object o: playerWord){
            System.out.print(o);
        }
        System.out.println();
        showHangman();
    }
    public void verificationGame(){
        int verInfo=0;
        if(chance<8)
            for(Object o:playerWord){
                if(o=="-")verInfo++;
           }
        else
            defeat();
        
        if(verInfo==0)
            winner();
    }
    
    private void winner(){
            System.out.println("YOU WIN!\n"+"Word: ");
            for(Object o : playerWord)
                System.out.print(o);
            System.out.println();
            System.exit(0);
    }
    private void defeat(){
        System.out.println("YOU LOST! Word:");
        for(Object o : searchWord)
                System.out.print(o);
        System.out.println();
        showHangman();
        
        System.exit(0);
    }
    private void showHangman(){
        switch(chance){
            case 1:
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 2:
                System.out.println("|------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:
                System.out.println("|------");
                System.out.println("|     |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:
                System.out.println("|------");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|");
                System.out.println("|");
                break;
            case 5:
                System.out.println("|------");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|     |");
                System.out.println("|");
                break;
            case 6:
                System.out.println("|------");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|");
                break;
            case 7:
                System.out.println("|------");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|    / ");
                break;
            case 8:
                System.out.println("|------");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|    / \\");
                break;
        }
            
    }
    
}