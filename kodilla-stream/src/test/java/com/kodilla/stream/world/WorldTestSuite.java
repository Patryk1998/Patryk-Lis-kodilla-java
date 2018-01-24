package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import stream.world.Continent;
import stream.world.Country;
import stream.world.Politician;
import stream.world.World;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country uganda = new Country("Uganda", new BigDecimal("123123123"));
        Country ghana = new Country("Ghana", new BigDecimal("809798798787"));
        Country polska = new Country("Polska", new BigDecimal("3542867245687456"));
        Country niemcy = new Country("Niemcy", new BigDecimal("52986728576"));
        Continent africa = new Continent("Africa");
        Continent europa = new Continent("Europa");
        africa.addCountry(uganda);
        africa.addCountry(ghana);
        europa.addCountry(polska);
        europa.addCountry(niemcy);
        World world = new World();
        world.addContinent(africa);
        world.addContinent(europa);
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("3543730154337942"), peopleQuantity);
    }

        @Test
        public void testGetTotalPoliticianAge(){
            Politician ugandaGuy1 = new Politician("Mirek", "Wola", 23);
            Politician ugandaGuy2 = new Politician("Hubert", "Niemy", 56);
            Politician ghandaGuy1 = new Politician("Tomasz", "Mily", 34);
            Politician ghandaGuy2 = new Politician("Kamil", "Nowak", 28);
            Politician polskaGuy1 = new Politician("Sebastian", "Niski", 92);
            Politician polskaGuy2 = new Politician("Daniel", "Stary", 18);
            Politician niemcyGuy1 = new Politician("asd", "asd", 78);
            Country uganda = new Country("Uganda", new BigDecimal("123123123"));
            uganda.addPolitician(ugandaGuy1);
            uganda.addPolitician(ugandaGuy2);
            Country ghana = new Country("Ghana", new BigDecimal("809798798787"));
            ghana.addPolitician(ghandaGuy1);
            ghana.addPolitician(ghandaGuy2);
            Country polska = new Country("Polska", new BigDecimal("3542867245687456"));
            polska.addPolitician(polskaGuy1);
            polska.addPolitician(polskaGuy2);
            Country niemcy = new Country("Niemcy", new BigDecimal("52986728576"));
            niemcy.addPolitician(niemcyGuy1);
            Continent africa = new Continent("Africa");
            Continent europa = new Continent("Europa");
            africa.addCountry(uganda);
            africa.addCountry(ghana);
            europa.addCountry(polska);
            europa.addCountry(niemcy);
            World world = new World();
            world.addContinent(africa);
            world.addContinent(europa);
            //When
            int testAge = world.getTotalPoliticianAge();
            //Then
            Assert.assertEquals(329, testAge);
    }
}
