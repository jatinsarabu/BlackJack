public class Person { 
    private String name;  
    private int wins;  
    private Hand pHand; 
    public Person(String name){ 
        this.name = name; 
        this.wins = 0;  
        this.pHand = new Hand(); 
    }  
    public Person () { 
        this.pHand = new Hand(); 
        this.wins = 0; 

    }
    public String getName() { 
        return this.name; 
    }  
    public void addWin() { 
        this.wins+=1; 
    }
    public int getWins () { 
        return this.wins;
    } 
    public Hand getHand() { 
        return this.pHand; 
    } 
    public void setHand(Hand inputHand) { 
        this.pHand = inputHand; 
    } 
    public void setName(String name) { 
        this.name = name;
    }
    
}
