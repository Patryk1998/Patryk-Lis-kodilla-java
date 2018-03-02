package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final String burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private String burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        final static String withSesame = "Sesame";
        final static String noSesame = "noSesame";
        final static String standard = "standard";
        final static String barbecue = "barbecue";
        final static String cheese = "cheese";
        final static String onion = "onion";
        final static String cucumber = "cucumber";
        final static String one = "one";
        final static String two = "two";


        public BigmacBuilder roll(String roll) {
            if (roll.equals(withSesame) || roll.equals(noSesame)) {
                this.roll = roll;
            }
            return this;
        }

        public BigmacBuilder burgers(String burgers) {
            if (burgers.equals(one) || burgers.equals(two)) {
                this.burgers = burgers;
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(standard) || sauce.equals(barbecue)) {
                this.sauce = sauce;
            }
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            if (ingredient.equals(onion) || ingredient.equals(cheese) || ingredient.equals(cucumber)) {
                ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String roll, final String burgers, final String sauce, final List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}


