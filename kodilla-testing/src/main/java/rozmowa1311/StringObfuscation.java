package rozmowa1311;

public class StringObfuscation {
    public String maskify(String string) {

        if (string == null)
            return "";

        int digitAmount = string.replaceAll("\\D", "").length();
        if (digitAmount > 6) {
            String result = string.substring(0, 1);
            System.out.println(EndDigitCounter.fourthDigitIndexFromTheEnd(string));
            result += string.substring(1, EndDigitCounter.fourthDigitIndexFromTheEnd(string)).replaceAll("\\d", "#");
            result += string.substring(EndDigitCounter.fourthDigitIndexFromTheEnd(string));
            return result;
        }
        return string;
    }
}
