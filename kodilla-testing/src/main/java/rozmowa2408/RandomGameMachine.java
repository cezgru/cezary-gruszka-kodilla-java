package rozmowa2408;

import java.util.List;

public class RandomGameMachine {
    private Database database;

    public RandomGameMachine(Database database) {
        this.database = database;
    }

    public int miniLotto(List<Integer> userInput) {

        return jackpot(userInput);
    }

    public int jackpot(List<Integer> userInput) {
        List<Integer> result = database.wylosuj(userInput.size());

        int counter = 0;

        for (int number : userInput) {
            if (result.contains(number))
                counter++;
        }

        return counter;
    }
}


