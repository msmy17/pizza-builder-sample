public class Builder {
    public static void main(String[] args){
        Pizza roundPepperoni = new Pizza.PizzaBuilder("Butter Round", "Regular", "Regular")
                .pepperoni(true)
                .build();
        System.out.println(roundPepperoni);

        Pizza hawaiian = new Pizza.PizzaBuilder("Garlic Round", "Regular", "Extra")
                .ham(true)
                .pineapple(true)
                .build();

        System.out.println(hawaiian);

        Pizza deepdishBBQ = new Pizza.PizzaBuilder("Deep Dish", "Barbecue Sauce", "Regular")
                .chicken(true)
                .onion(true)
                .build();
        System.out.println(deepdishBBQ);

        Pizza supreme = new Pizza.PizzaBuilder("Butter Round", "Regular", "Regular")
                .pepperoni(true)
                .olive(true)
                .pepper(true)
                .onion(true)
                .ham(true)
                .sausage(true)
                .build();
        System.out.println(supreme);

        Pizza regular = new Pizza.PizzaBuilder("Butter Round", "Regular", "Regular")
                .regularPizza()
                .build();
        System.out.println(regular);
    }
}
