
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class sampleTest {

    @Test
    void createRoundPizza(){
        Pizza roundPepperoni = new Pizza.PizzaBuilder("Butter Round", "Regular", "Regular")
                .pepperoni(true)
                .build();

        assertEquals( "Butter Round", roundPepperoni.getCrust());
        assertFalse(roundPepperoni.getOlive());
        assertTrue(roundPepperoni.getPepperoni());
    }

    @Test
    void HawaiianPizza(){
        Pizza roundPepperoni = new Pizza.PizzaBuilder("Round", "Regular", "Regular")
                .ham(true)
                .pineapple(true)
                .build();

        assertEquals( "Round", roundPepperoni.getCrust());
        assertEquals( "Regular", roundPepperoni.getSauce());
        assertEquals( "Regular", roundPepperoni.getCheese());
        assertTrue(roundPepperoni.getPineapple());
        assertTrue(roundPepperoni.getHam());
        assertFalse(roundPepperoni.getOlive());
        assertFalse(roundPepperoni.getSausage());
        assertFalse(roundPepperoni.getPepperoni());
        assertFalse(roundPepperoni.getPepper());
        assertFalse(roundPepperoni.getOnion());
        assertFalse(roundPepperoni.getChicken());
    }
}
