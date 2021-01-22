
public class Pizza {
    private String crust;
    private boolean pepperoni;
    private boolean sausage;
    private boolean ham;
    private boolean pepper;
    private boolean onion;
    private boolean pineapple;
    private String sauce;
    private boolean olive;
    private boolean chicken;
    private String cheese;

    private Pizza() {};

    public String getCrust(){
        return crust;
    }

    public boolean getPepperoni(){
        return pepperoni;
    }

    public boolean getSausage() {
        return sausage;
    }

    public boolean getHam() {
        return ham;
    }

    public boolean getPepper() {
        return pepper;
    }

    public boolean getOnion() {
        return onion;
    }

    public boolean getPineapple() {
        return pineapple;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean getOlive() {
        return olive;
    }

    public boolean getChicken() {
        return chicken;
    }

    public String getCheese() {
        return cheese;
    }

    public String toString() {
        return "Pizza: "+"\n"+"Crust: "+this.crust+", "+"Sauce: "+this.sauce+", "+"Cheese: "+this.cheese+", "+"Pepperoni: "+this.pepperoni+", "+"Sausage: "+this.sausage+", "
                +"Ham: "+this.ham+", "+"Pepper: "+this.pepper+", "+"Onions: "+this.onion+", "+"Pineapple: "+this.pineapple+", "+"Olives: "+this.olive+", "+"Chicken: "+this.chicken;
    }

    public static class PizzaBuilder {
        private final Pizza pizza;

        private boolean pepperoni;
        private boolean sausage;
        private boolean ham;
        private boolean pepper;
        private boolean onion;
        private boolean pineapple;
        private boolean olive;
        private boolean chicken;
        private String crust;
        private String sauce;
        private String cheese;

        public PizzaBuilder(String crust, String sauce, String cheese) {
            pizza = new Pizza();

            pizza.crust = crust;
            pizza.sauce = sauce;
            pizza.cheese = cheese;
        }

        public PizzaBuilder regularPizza() {
            pizza.crust = "round";
            pizza.sauce = "regular";
            pizza.cheese = "extra";
            pizza.pepperoni = true;
            return this;
        }

        public PizzaBuilder pepperoni(boolean pepperoni) {
            pizza.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder sausage(boolean sausage) {
            pizza.sausage = sausage;
            return this;
        }

        public PizzaBuilder ham(boolean ham) {
            pizza.ham = ham;
            return this;
        }

        public PizzaBuilder pepper(boolean pepper) {
            pizza.pepper = pepper;
            return this;
        }

        public PizzaBuilder onion(boolean onion) {
            pizza.onion = onion;
            return this;
        }

        public PizzaBuilder pineapple(boolean pineapple) {
            pizza.pineapple = pineapple;
            return this;
        }

        public PizzaBuilder olive(boolean olive){
            pizza.olive = olive;
            return this;
        }

        public PizzaBuilder chicken(boolean chicken){
            pizza.chicken = chicken;
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }
}
