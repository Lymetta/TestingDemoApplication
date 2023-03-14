package org.example.restaurant;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DinnerWaiterTest {

        @Mock
        private DinnerWaiter dinnerWaiter;

        @Test
        public void vegetarianDinner_returnsDinnerVegMenu_whenUsingDinnerWaiter() {
                final List<String> expected = Arrays.asList("Garlic bread", "Vegetable Lasagne", "Chocolate Brownie");
                when(dinnerWaiter.getVegetarianMenu()).thenReturn(expected);
                final List<String> actual = dinnerWaiter.getVegetarianMenu();
                assertThat(actual).isEqualTo(expected);
        }

        @Test
        public void meatDinner_returnsDinnerVegMenu_whenUsingDinnerWaiter() {
                final List<String> expected = Arrays.asList("Calamari", "Roast Chicken", "Sticky toffee pudding");
                when(dinnerWaiter.getMeatMenu()).thenReturn(expected);
                final List<String> actual = dinnerWaiter.getMeatMenu();
                assertThat(actual).isEqualTo(expected);
        }

}
