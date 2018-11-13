package rozmowa1311;

public class EndDigitCounter {
    public static int fourthDigitIndexFromTheEnd(String string){
        int counter=0;
        for(int i=string.length()-1; i>0; i--){
            if(Character.isDigit(string.charAt(i))){
                counter++;
            }
            if(counter==4) {
                return i;
            }
        }
        return -1;
    }
}
