package pkg06rockpaperscissors;

public class Check {
    
    public Check(int player1,int com){
        //papier kamien nozyce
        switch(player1){
            case 1:
                if(com==1)
                    System.out.println("Remis!");
                else if(com==2)
                    System.out.println("Wygrałeś!");
                else if(com==3)
                    System.out.println("Przegrałeś!");
                break;
            case 2:
                if(com==1)
                    System.out.println("Przegrałeś!");
                else if(com==2)
                    System.out.println("Remis!");
                else if(com==3)
                    System.out.println("Wygrałeś!");
                break;
            case 3:
                if(com==1)
                    System.out.println("Wygrałeś!");
                else if(com==2)
                    System.out.println("Przegrałeś!");
                else if(com==3)
                    System.out.println("Remis!");
                break;
        }     
    }
}

