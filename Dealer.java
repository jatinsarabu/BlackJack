class Dealer extends Person { 
    public boolean shouldDraw() { 
        if (super.getHand().handValue()< 17){ 
            return true; 
        
        } else { 
            return false;
        }
    } 
    
}
