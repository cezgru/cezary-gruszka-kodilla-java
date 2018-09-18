package rozmowa2408;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;

public class RandomGamesTestSuite {
    @Test
    public void testMiniLotto() {
        //Given
        Database databaseMock = Mockito.mock(Database.class);
        RandomGameMachine randomGameMachine = new RandomGameMachine(databaseMock);
        List<Integer> randomizedNumbers = Arrays.asList(2, 5, 17, 31, 8);
        Mockito.when(databaseMock.wylosuj(anyInt())).thenReturn(randomizedNumbers);
        List<Integer> inputNumbers = Arrays.asList(2, 5, 17, 31, 8);

        //When
        int result = randomGameMachine.miniLotto(inputNumbers);

        //Then
        Assert.assertEquals(5, result);
    }
    @Test
    public void testJackpot5() {
        //Given
        Database databaseMock = Mockito.mock(Database.class);
        RandomGameMachine randomGameMachine = new RandomGameMachine(databaseMock);
        List<Integer> randomizedNumbers = Arrays.asList(2, 5, 17, 31, 8);
        Mockito.when(databaseMock.wylosuj(anyInt())).thenReturn(randomizedNumbers);
        List<Integer> inputNumbers = Arrays.asList(2, 5, 3, 31, 8);

        //When
        int result = randomGameMachine.jackpot(inputNumbers);

        //Then
        Assert.assertEquals(4, result);
    }

    @Test
    public void testJackpot2() {
        //Given
        Database databaseMock = Mockito.mock(Database.class);
        RandomGameMachine randomGameMachine = new RandomGameMachine(databaseMock);
        List<Integer> randomizedNumbers = Arrays.asList(2, 5);
        Mockito.when(databaseMock.wylosuj(anyInt())).thenReturn(randomizedNumbers);
        List<Integer> inputNumbers = Arrays.asList(2, 8);

        //When
        int result = randomGameMachine.jackpot(inputNumbers);

        //Then
        Assert.assertEquals(1, result);
    }
}
