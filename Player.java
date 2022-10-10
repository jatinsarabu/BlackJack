class Player extends Person { 
    String gameStatus;
    public Player (String name) {  
        
        super(name);
    } 
    public Player () { 

    }
    public void displayPlayer () { 
        System.out.println(super.getName());
    } 
    public String getGameStatus() {
        return this.gameStatus; 
    } 
    public void setGameStatus(String gameStatus) { 
        this.gameStatus = gameStatus;
    }
    }

/* 
import java.util.Scanner; 
public class Player {
    public static void main(String args[]) { 
        Scanner players = new Scanner(System.in); 
        System.out.prinln(players.nextLine()); 
    }
}
*/