package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;


public class Bigmac {
    private String bun;
    private int burgers;
    String sauce;
    List<String> ingredients;

    public static class BigmacBuilder{
        private String bun;
        private int burgers;
        private String sauce;
        List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        boolean tooMuchWriting=true;
        public Bigmac build(){
            if(!tooMuchWriting)  //szkoda czasu na dodawanie wszystkich sprawdzen
                throw new IllegalStateException("Something is wrong");
            else
                return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
