package rozmowa1008;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number2touples {
    public static void main(String[] args) {

        int pair1 = numberOfPairs(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        int pair2 = numberOfPairs(new int[]{20, 20});
        int pair3 = numberOfPairs(new int[]{10, 20, 30, 40, 50});
        if(pair1 == 3 && pair2 == 1 && pair3 == 0) {
            System.out.println("Znaleziono poprawną liczbę par");
        } else {
            System.out.println("Znaleziono błędną liczbę par");
        }
    }

    private static Integer numberOfPairs(int[] array) {
        /*
        Arrays.sort(array);
        int counter = 1;
        int result = 0;
        int temp = 0;
        for(int number : array){
            if(number==temp){
                counter++;
            } else {
                result += counter/ 2;
                counter = 1;
            }
            temp = number;
        }
        return result; */

        Map<Integer, Integer> pairs = new HashMap<>();
        for(int number : array){
            if(pairs.containsKey(number))
                pairs.put(number, pairs.get(number)+1);
            else
                pairs.put(number, 1);
        }

        int result = 0;

        for(int number : pairs.values()){
            result += number/2;
        }

        return result;
    }
}