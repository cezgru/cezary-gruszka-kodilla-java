package rozmowa0408;

import java.util.*;

public class Main {
    public static int getCountEmptyStringUsingJava7(List<String> list){
        int counter = 0;
        for(String string : list) {
            if(string.isEmpty())
                counter += 1;
        }
        return counter;
    }


    public static long getCountLength3UsingJava7(List<String> strings){
        int counter = 0;
        for(String string : strings) {
            if(string.length()==3)
                counter += 1;
        }
        return counter;
    }


    public static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String string : strings) {
            if(!string.isEmpty())
                result.add(string);
        }
        return result;
    }

    public static String getMergedStringUsingJava7(List<String> strings, String s) {
        String result = "";
        for(String string : strings) {
            if(!string.isEmpty())
                result += string+s;
        }
        result = result.substring(0, result.length()-1);
        return result;
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        Set<Integer> resultSet = new LinkedHashSet<>();
        for(Integer number : numbers) {
           resultSet.add(number*number);
        }
        List<Integer> result = new ArrayList<>(resultSet);
        return result;
    }

    public static Integer getMax(List<Integer> numbers) {
       int result = numbers.get(0);
        for(Integer number : numbers) {
            if(number>result)
                result = number;
        }
        return result;
    }

    public static Integer getMin(List<Integer> numbers) {
        int result = numbers.get(0);
        for(Integer number : numbers) {
            if(number<result)
                result = number;
        }
        return result;
    }

    public static Integer getSum(List<Integer> numbers) {
        int result = 0;
        for(Integer number : numbers) {
           result += number;
        }
        return result;
    }

    public static Integer getAverage(List<Integer> numbers) {
        return Main.getSum(numbers)/numbers.size();
    }
}
