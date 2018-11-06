package rozmowa3110;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
    Random random = new Random();

    public Set<Integer> generateNumbers(){
        Set<Integer> randomNumbers = new HashSet<>();
        while(randomNumbers.size()<6){
            randomNumbers.add(random.nextInt(49)+1);
        }

        return randomNumbers;
    }
}
