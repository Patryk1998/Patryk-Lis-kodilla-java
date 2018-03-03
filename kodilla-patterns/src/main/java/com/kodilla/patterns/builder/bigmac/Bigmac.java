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
        final static String WITHSESAME = "Sesame";
        final static String NOSESAME = "noSesame";
        final static String STANDARD = "standard";
        final static String BARBECUE = "barbecue";
        final static String CHEESE = "cheese";
        final static String ONION = "onion";
        final static String CUCUMBER = "cucumber";
        final static String ONE = "one";
        final static String TWO = "two";


        public BigmacBuilder roll(String roll) {
            if (roll.equals(WITHSESAME) || roll.equals(NOSESAME)) {
                this.roll = roll;
            }
            return this;
        }

        public BigmacBuilder burgers(String burgers) {
            if (burgers.equals(ONE) || burgers.equals(TWO)) {
                this.burgers = burgers;
            }
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
            }
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            if (ingredient.equals(ONION) || ingredient.equals(CHEESE) || ingredient.equals(CUCUMBER)) {
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


