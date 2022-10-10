import java.util.*; 
public class Hand {
    ArrayList<Card> arrHand; 
    public Hand() { 
        this.arrHand = new ArrayList<Card>();
    } 
    public void addHand (Card inputCard) { 
        arrHand.add(inputCard); 
    }  
    public void resetHand () { 
        arrHand.clear();
    }
    public int handValue() {   
        int hvalue = 0;
        for (int i = 0; i < arrHand.size(); i++){  
            hvalue+= arrHand.get(i).getValue();
        } 
        return hvalue;

    }  
    public void displayHand() { 
        for (int i = 0; i < this.arrHand.size(); i++) 
            this.arrHand.get(i).displayCard(); 
        System.out.println(this.handValue());

    }  
    public void displayDealerHand() { 
        this.arrHand.get(0).displayCard();  
        System.out.println("X");
    }
}
