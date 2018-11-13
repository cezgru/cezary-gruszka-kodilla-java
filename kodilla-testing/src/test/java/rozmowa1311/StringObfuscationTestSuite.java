package rozmowa1311;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringObfuscationTestSuite {
    StringObfuscation creditCard = new StringObfuscation();

    @Test
    public void shouldCheckFourthDigitFromEndIndex(){
        assertEquals(3, EndDigitCounter.fourthDigitIndexFromTheEnd("0123asd789qwerty"));
    }
    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", creditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldMaskDigitsForDifferentLengths() {
        assertEquals("6######5616", creditCard.maskify("64607935616"));
    }


    @Test
    public void shouldMaskDigitsForCreditCardsWithDashes() {
        assertEquals("4###-####-####-5616", creditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldNotMaskString() {
        assertEquals("Skippy", creditCard.maskify("Skippy"));
    }

    @Test
    public void shouldHandleEmptyString() {
        assertEquals("", creditCard.maskify(""));
        assertEquals("", creditCard.maskify(null));
    }

    @Test
    public void shouldNotMaskIfShorterThanDesiredLength() {
        assertEquals("1##45asdf12", creditCard.maskify("12345asdf12"));
        assertEquals("12345", creditCard.maskify("12345"));
        assertEquals("123", creditCard.maskify("123"));
    }
}
