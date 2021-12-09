package countries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collections {
    private List<Country> countries;
    public Collections(){
        countries=new ArrayList<>();
    }

    public void add(Country c){
        this.countries.add(c);
    }

    public void vider(Country c) throws ListEmptyException {
        if(!this.countries.isEmpty()){
            this.countries.remove(c);
            this.afficherCollection();

        }else{
            throw new ListEmptyException();
        }
    }

    public List<String> tierOrdreDecroissant()throws ListEmptyException {
        if(!this.countries.isEmpty()){
            this.countries.sort(new Comparator<Country>() {
                @Override
                public int compare(Country o1, Country o2) {
                    return -1*(o1.getName().compareTo(o2.getName()));
                }
            });
            List<String> nomCountry=new ArrayList<>();
            for(Country c: this.countries){
                nomCountry.add(c.getName());
            }
            return nomCountry;
        }else{
            throw  new ListEmptyException();
        }

    }

    @Override
    public String toString() {
        return "La collection créee contient "+this.countries.size()+ " pays ! \n";
    }
    public String afficherCollection(){
        String s=this.toString();
        for(Country c:countries){
           s+= c.toString();
        }
      return s;
    }


    public List<Country> getCountries() {
        return countries;
    }
}
