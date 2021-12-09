package countries;

import countries.Collections;
import countries.Country;
import countries.ListEmptyException;

public class Main {
    public static void main(String[] args) throws ListEmptyException {
        Country c1=new Country("France");
        Country c2=new Country("Allemagne");
        Country c3=new Country("USA");
        Country c4=new Country("Chine");
        Collections collections=new Collections();
        collections.add(c1);
        collections.add(c2);
        collections.add(c3);
        collections.add(c4);
        System.out.println("affichage");
        System.out.println(collections.toString());
        collections.vider(c1);
        collections.vider(c2);
        collections.vider(c3);
        collections.vider(c4);
        collections.vider(c1);
        try{
            System.out.println(collections.afficherCollection());
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("-----------Le tri---------");

        try{
            System.out.println(collections.tierOrdreDecroissant());
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(collections.afficherCollection());
    }

}
