package stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {
    private final List<Continent> continents = new ArrayList<>();


    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal numberOfPeople = continents.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return numberOfPeople;
    }

    public int getTotalPoliticianAge(){
        int totalAge = continents.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .flatMap(country -> country.getPoliticiansList().stream())
                .map(politician -> politician.getAge())
                .reduce(0, (sum, asd) -> sum = sum + asd);
        return totalAge;


    }

}
