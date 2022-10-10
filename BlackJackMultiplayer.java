import java.util.*;
public class BlackJackMultiplayer {
    static boolean gameOver = false; 
    static ArrayList<Player> arrPlayers= new ArrayList<>();
      public static void main(String [] args) {    
        // Input 
        System.out.println("Welcome to Blackjack");  
        Deck deck1 = new Deck();  
        Scanner players = new Scanner(System.in); 
        System.out.println("How many people are going to play BlackJack?"); 
        int numPlayers = players.nextInt();
        for (int i=1; i < numPlayers+1;i++){ 
            Scanner name = new Scanner(System.in); 
            System.out.println("What is Player"+ i +"'s name"); 
            String pName = name.nextLine(); 
            Player playerName = new Player(pName); 
            arrPlayers.add(playerName);
        }
        System.out.println("Deck is being shuffled");
        deck1.shuffleDeck();   
        Dealer dealer1 = new Dealer(); 
        for (int i=0; i < arrPlayers.size(); i++) { 
            arrPlayers.get(i).getHand().addHand(deck1.removeCard());    
            arrPlayers.get(i).getHand().addHand(deck1.removeCard());          
            System.out.println(arrPlayers.get(i).getName()+"'s hand");
            arrPlayers.get(i).getHand().displayHand();        
        }
        dealer1.getHand().addHand(deck1.removeCard());
        dealer1.getHand().addHand(deck1.removeCard());  
        System.out.println("Dealer's hand");
        dealer1.getHand().displayDealerHand();  

        for (int i = 0; i < arrPlayers.size(); i++) {  
            gameOver = false; 
            while (gameOver == false){ 
                Scanner decision = new Scanner(System.in);  
                System.out.println(arrPlayers.get(i).getName()+"'s turn");
                System.out.println("Please chose one of the options: (1)Hit or (2)Stand?"); 
                int outcome = decision.nextInt();   
                if (outcome == 1) { 
                    arrPlayers.get(i).getHand().addHand(deck1.removeCard());
                    arrPlayers.get(i).getHand().displayHand();  
                    if (arrPlayers.get(i).getHand().handValue() == 21){  
                        arrPlayers.get(i).setGameStatus(" Wins");
                        System.out.println(arrPlayers.get(i).getName()+" Wins"); 
                        gameOver = true;
                    }
                    if (arrPlayers.get(i).getHand().handValue() > 21){  
                        arrPlayers.get(i).setGameStatus(" Loses"); 
                        System.out.println(arrPlayers.get(i).getName()+" Loses"); 
                        gameOver = true;
                    }
                }else{ 
                    gameOver = true; 
                    arrPlayers.get(i).setGameStatus("Stand");
                }
    
                //
            } 
        }  
        System.out.println("Dealer's turn");
        dealer1.getHand().displayHand();
        for (int i=0;i<arrPlayers.size();i++){ 
            System.out.println(arrPlayers.get(i).getName()+arrPlayers.get(i).getGameStatus());
            if (arrPlayers.get(i).getGameStatus() == "Stand"){ 
                if (arrPlayers.get(i).getHand().handValue() >21){ 
                    System.out.println(arrPlayers.get(i).getName()+" Wins");
                }else if ((arrPlayers.get(i).getHand().handValue() >17)&&(arrPlayers.get(i).getHand().handValue() <21)){ 
                    if (arrPlayers.get(i).getHand().handValue()> dealer1.getHand().handValue()){ 
                        System.out.println(arrPlayers.get(i).getName()+" Wins"); 
                        arrPlayers.get(i).setGameStatus(" Wins");
                    
                    }else { 
                        System.out.println(arrPlayers.get(i).getName()+" Loses");
                        arrPlayers.get(i).setGameStatus(" Loses");
                    }
                }else { 
                    while (dealer1.getHand().handValue() < 17)
                    {
                        dealer1.getHand().addHand(deck1.removeCard());  
                        dealer1.getHand().displayHand();
                        
                    }   
                    if (arrPlayers.get(i).getHand().handValue()> dealer1.getHand().handValue()){ 
                        System.out.println(arrPlayers.get(i).getName()+" Wins");  
                        arrPlayers.get(i).setGameStatus(" Wins");
                    
                    }else { 
                        System.out.println(arrPlayers.get(i).getName()+" Loses");
                        arrPlayers.get(i).setGameStatus(" Loses");
                    }
                }
            }
        }
        for (int i=0;i < arrPlayers.size();i++)
        { 
            System.out.println(arrPlayers.get(i).getName()+arrPlayers.get(i).getGameStatus());
            arrPlayers.get(i).getHand().displayHand(); 
        }
        System.out.println("-------dealer------");
        dealer1.getHand().displayHand();
}
}