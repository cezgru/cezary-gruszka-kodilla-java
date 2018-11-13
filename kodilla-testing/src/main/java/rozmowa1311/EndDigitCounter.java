package rozmowa1311;

public class EndDigitCounter {
    public static int fourthDigitIndexFromTheEnd(String string){
        int counter=0;
        for(int i=string.length()-1; i>0; i--){
            if(string.charAt(i)<40 && string.charAt(i)>29)
                System.out.println(string.charAt(i));
                counter++;
            if(counter==4)
                return i;
        }
        return -1;
    }
}
