import java.util.Comparator;

public class Locatar {


    public static class ComparatorbyName implements Comparator<Locatar> {


        public int compare(Locatar o1, Locatar o2) {
            return o1.name.compareTo(o2.name);

        }
    }

    public static class ComparatorbyNrApartament implements Comparator<Locatar> {


        public int compare(Locatar o1, Locatar o2) {
            return o1.ap.compareTo(o2.ap);

        }
    }





    private String name;
    private Apartament ap;

    Locatar(String name,Apartament ap){

        this.name=name;
        this.ap=ap;

    }


    @Override
    public String toString(){

        return "Locatar: "+name;
    }


}
