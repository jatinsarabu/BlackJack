import java.util.*; 

public class Deck{ 
    ArrayList<Card> arrDeck;
    String[] arrSuit = {"Hearts", "Diamonds", "Spades", "Clover"};  
    String[] arrRank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
    int[] arrValue = {1,2,3,4,5,6,7,8,9,10,10,10,10};
    public Deck() { 
        this.arrDeck = new ArrayList<Card>();    
        this.generateDeck();
    } 
        public void displayDeck() { 
            for (int i = 0; i < this.arrDeck.size(); i++) 
                this.arrDeck.get(i).displayCard();
        }   
        public void shuffleDeck() { 
            Collections.shuffle(arrDeck); 
        } 
        public Card removeCard() {  
            int index = arrDeck.size()-1; 
            Card temp = new Card(); 
            temp.copycard(this.arrDeck.get(index));
            arrDeck.remove(index);   
            return temp; 

        }  
        public void generateDeck () { 
            for (String suit :arrSuit){ 
                for (int i = 0; i < arrRank.length; i++){ 
                    this.arrDeck.add(new Card(suit,arrRank[i],arrValue[i]));
                }
            }
        }
        public void resetDeck() { 
            this.arrDeck.clear();  
            this.generateDeck(); 
            this.shuffleDeck();
        } 
}