package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Bigmac.BigmacBuilder.*;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuild() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients(cheese)
                .sauce(standard)
                .burgers(two)
                .ingredients(onion)
                .roll(noSesame)
                .build();
        //When
        System.out.println(bigmac);
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);

    }
}
