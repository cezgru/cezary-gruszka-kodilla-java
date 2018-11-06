package rozmowa3110;

import java.util.Set;

public class Comperator {


    public boolean compare(Set<Integer> generated, Set<Integer> user){
        return user.containsAll(generated) && generated.containsAll(user);
    }
}
