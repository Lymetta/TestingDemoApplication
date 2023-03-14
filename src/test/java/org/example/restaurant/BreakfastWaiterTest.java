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
public class BreakfastWaiterTest {
    @Mock
    private BreakfastWaiter breakfastWaiter;

    @Test
    public void getVegetarianMenu_returnsBreakfastVegMenu_whenUsingBreakfastWaiter() {
        final List<String> expected = Arrays.asList("Apple", "Beans", "Hash brown", "Toast");
        when(breakfastWaiter.getVegetarianMenu()).thenReturn(expected);
        final List<String> actual = breakfastWaiter.getVegetarianMenu();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getMeatMenu_returnsBreakfastMeatMenu_whenUsingBreakfastWaiter() {
        final List<String> expected = Arrays.asList("Apple", "Sausages", "Bacon", "Toast");
        when(breakfastWaiter.getMeatMenu()).thenReturn(expected);
        final List<String> actual = breakfastWaiter.getMeatMenu();
        assertThat(actual).isEqualTo(expected);
    }


}
