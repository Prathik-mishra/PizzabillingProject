public class pizza {
    public int BasePrice;
    public int ExtraToppings;
    public int ExtraCheese;
    public int TakeAwayBag;
    public int small;
    public int medium;
    public int large;
    public int size;
    public Boolean isExtraCheese;
    public Boolean isExtraToppings;
    public Boolean isTakeAway;
    public int Total;
    public String bill;
    public Boolean isVeg;
    public pizza(boolean isVeg, int size){
        this.isVeg = isVeg;
        this.size = size;
        if(isVeg){
            switch(size){
                case 0: small(isVeg); break;
                case 1: medium(isVeg); break;
                default: large(isVeg); break;
            }
            this.ExtraToppings = 50;
        }else{
            switch(size){
                case 0: small(isVeg); break;
                case 1: medium(isVeg); break;
                default: large(isVeg); break;
            }
            this.ExtraToppings = 80;
        }
        this.ExtraCheese = 30;
        this.TakeAwayBag = 15;
        this.isTakeAway = false;
        this.isExtraToppings = false;
        this.isExtraCheese=false;
    }

    private void large(Boolean isVeg) {
        if(isVeg) this.BasePrice = 400;
        else this.BasePrice = 600;

    }

    private void medium(Boolean isVeg) {
        if(isVeg) this.BasePrice = 350;
        else this.BasePrice = 500;
    }

    private void small(Boolean isVeg) {
        if(isVeg) this.BasePrice = 300;
        else this.BasePrice = 400;
    }

    public void addExtraCheese(){
        if(!isExtraCheese) isExtraCheese=true;
    }

    public void addExtraToppings(){
        if(!isExtraToppings) isExtraToppings=true;
    }

    public void addTakeAway(){
        if(!isTakeAway) isTakeAway=true;
    }

    public int getExtraToppings(){
        return ExtraToppings;
    }
    public int getExtraCheese(){
        return ExtraCheese;
    }
    public int getTakeAwayBag(){
        return TakeAwayBag;
    }
    public String getBill(){
        if(isVeg){
            bill = "Your Veg";
        }else{
            bill = "Your Non-Veg";
        }
        switch(size){
            case 0: bill+="Small Pizza Price = "+this.BasePrice+"/-"+"\n"; break;
            case 1: bill+="Medium Pizza Price = "+this.BasePrice+"/-"+"\n"; break;
            default: bill+="Large Pizza Price = "+this.BasePrice+"/-"+"\n"; break;
        }
        this.Total = this.BasePrice;

        if(isExtraCheese){
            bill+="price for ExtraCheese = "+this.ExtraCheese+"/-"+"\n";
            this.Total += this.ExtraCheese;
        }
        if(isExtraToppings){
            bill+="price for ExtraToppings = "+this.ExtraToppings+"/-"+"\n";
            this.Total += this.ExtraToppings;
        }
        if(isTakeAway) {
            bill += "price for bag = " + this.TakeAwayBag + "/-" + "\n";
            this.Total += this.TakeAwayBag;
        }
        bill+="Your final price for this Pizza "+this.Total+"/-"+"\n";
        return bill;
    }
    public int getTotal(){
        return this.Total;
    }
}
