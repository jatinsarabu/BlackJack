public class Card {
    private String suit; 
    private String rank; 
    private int value;  

    public Card (String suit, String rank, int value) { 
        this.suit = suit; 
        this.rank = rank; 
        this.value = value; 
    }  
    public void copycard(Card inputCard) { 
        this.suit = inputCard.suit; 
        this.rank = inputCard.rank; 
        this.value =inputCard.value; 
    } 
    public Card () { 
        
    }

    public int getValue() { 
        return this.value; 
    } 

    public void displayCard() { 
        System.out.print(this.suit +"-" + this.rank+ "-"+ this.value+"     | ");
    } 
    
}