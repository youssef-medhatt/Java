

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      List<Country> countries = countryDao.findAllCountries();
      //1. Find the highest populated city in each country
     List<List<City>> cities = countries.stream()
              .map(country -> country.getCities())
           .collect(Collectors.toList());

   cities.stream().map(country->country.stream()
         .max(Comparator.comparing(City::getPopulation)))
         .filter(Optional::isPresent)
         .map(x -> x.get()).forEach(x->System.out.println(x.getName()));
              
   }

}