package org.example.restaurant;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomerOrderTest {
    @Mock
    private DinnerWaiter dinnerWaiter;
    @Mock
    private BreakfastWaiter breakfastWaiter;
    @InjectMocks
    private CustomerOrder order;


    @Test
    public void vegetarianDinner_returnsDinnerVegMenu_whenUsingDinnerWaiter() {
        final List<String> expected = Arrays.asList("Garlic bread", "Vegetable Lasagne", "Chocolate Brownie");
        when(dinnerWaiter.getVegetarianMenu()).thenReturn(expected);
        final List<String> actual = order.vegetarianDinner();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void meatDinner_returnsDinnerVegMenu_whenUsingDinnerWaiter() {
        final List<String> expected = Arrays.asList("Calamari", "Roast Chicken", "Sticky toffee pudding");
        when(dinnerWaiter.getMeatMenu()).thenReturn(expected);
        final List<String> actual = order.meatDinner();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void vegetarianBreakfast_returnsBreakfastVegMenu_whenUsingBreakfastWaiter() {
        final List<String> expected = Arrays.asList("Apple", "Beans", "Hash brown", "Toast");
        when(breakfastWaiter.getVegetarianMenu()).thenReturn(expected);
        final List<String> actual = order.vegetarianBreakfast();
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void meatBreakfast_returnsBreakfastMeatMenu_whenUsingBreakfastWaiter() {
        final List<String> expected = Arrays.asList("Apple", "Sausages", "Bacon", "Toast");
        when(breakfastWaiter.getMeatMenu()).thenReturn(expected);
        final List<String> actual = order.meatBreakfast();
        assertThat(actual).isEqualTo(expected);
    }


}
