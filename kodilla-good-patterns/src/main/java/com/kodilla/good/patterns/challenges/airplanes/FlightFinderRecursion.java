package com.kodilla.good.patterns.challenges.airplanes;

import java.util.List;

public class FlightFinderRecursion {
   public int asdf(int x){
       if(x<10)
           return x;
       else
           return asdf(x-2);

   }

}
