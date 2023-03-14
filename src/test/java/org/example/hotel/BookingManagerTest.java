package org.example.hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookingManagerTest {

    @Mock
    private Hotel hotel;

    @InjectMocks
    private BookingManager manager;

    @BeforeEach
    public void setupAvailableRooms() {
        List<String> roomsList = Arrays.asList("A", "B", "C", "D", "E");
        when(hotel.fetchAvailableRooms()).thenReturn(roomsList);
    }

    @Test
    public void checkRoomAvailability_shouldReturnTrue_whenEnteredRoomThatIsInList() {

        final boolean actual = manager.checkRoomAvailability("A");
        assertThat(actual).isTrue();
    }

    @Test
    public void checkRoomAvailability_shouldReturnFalse_whenEnteredRoomNotInList(){
        final boolean actual = manager.checkRoomAvailability("F");
        assertThat(actual).isFalse();
    }

}
