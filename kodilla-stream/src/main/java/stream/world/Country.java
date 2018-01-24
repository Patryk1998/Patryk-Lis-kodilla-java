package stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;
    private final List<Politician> politicians = new ArrayList<>();

    public Country(final String coutryName, final BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = coutryName;
    }
    public void addPolitician(Politician politician){
        politicians.add(politician);
    }

    public List<Politician> getPoliticiansList() {
        return politicians;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String toString(){
        return countryName + peopleQuantity;
    }
}
