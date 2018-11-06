package rozmowa3110;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> counterList = new ArrayList<>();
        int counter = 0;

        Comperator comperator = new Comperator();
        NumberGenerator numberGenerator = new NumberGenerator();

        Set<Integer> numbers;
        for(int i=0; i<10; i++){
            numbers = numberGenerator.generateNumbers();
            while(!comperator.compare(numberGenerator.generateNumbers(), numbers)){
                counter++;
            }
            counterList.add(counter);
            counter = 0;
        }

        OptionalDouble average = counterList.stream()
                .mapToInt(i -> i)
                .average();

        System.out.printf("%.0f", average.orElse(-1));
    }
}
