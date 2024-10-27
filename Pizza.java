public class Pizza {

    int price;
    private boolean normal;

    private int CheesePrice = 75;
    private int ToppingsPrice = 75;
    private int OnionPrice = 50;
    private int TakeAwayPrice = 20;
    private int basePrice;


    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isExtraOnionAdded = false;
    private boolean isTakeAwayOpted = false;

    private int SpicePrice = 50;
    private int ChickenPrice = 100;

    private boolean isExtraSpiceAdded = false;
    private boolean isExtraChickenAdded = false;


    public Pizza(boolean normal) {
        this.normal = normal;
        if(normal){
            this.price = 100;
        }
        else{
            this.price = 300;
        }
        basePrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += CheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += ToppingsPrice;
    }

    public void addExtraOnion(){
        isExtraOnionAdded = true;
        this.price += OnionPrice;
    }

    public void takeAway(){
        isTakeAwayOpted = true;
        this.price += TakeAwayPrice;
    }

    public void addExtraSpice(){
        isExtraSpiceAdded = true;
        this.price += SpicePrice;
    }

    public void addExtraChicken(){
        isExtraChickenAdded = true;
        this.price += ChickenPrice;
    }

    public void getBill(int no){
        String bill = "";
        System.out.println(" ----- WELCOME ----- ");
        System.out.println();

        System.out.println(" * Pizza : " + basePrice);
        if(isExtraCheeseAdded){
            System.out.println(" * With Extra Cheese : " + CheesePrice);
        }
        if(isExtraToppingsAdded){
            System.out.println(" * With Extra Toppings : " + ToppingsPrice);
        }
        if(isExtraOnionAdded){
            System.out.println(" * With Extra Onion: " + OnionPrice);
        }
        if(isExtraSpiceAdded){
            System.out.println(" * With Extra Spice : " + SpicePrice);
        }
        if(isExtraChickenAdded){
            System.out.println(" * With Extra Chicken : " + ChickenPrice);
        }
        if(isTakeAwayOpted){
            System.out.println(" * Parcel : " + TakeAwayPrice);
        }
        int total = this.price * no;
        System.out.println(" -> Bill : " + this.price + " * " + no + " = " + total);

        System.out.println();
        System.out.println(" ----- THANK YOU! ----- ");
        System.out.println();


    }
}

