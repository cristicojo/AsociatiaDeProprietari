import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apartament implements Comparable<Apartament>, Serializable {

    private static final long serialVersionUID = -3183842531880850175L;

    public int compareTo(Apartament o) {
        return this.nrapartament - o.nrapartament;
    }



    private int nrcamere;
    private int nrapartament;

    private List<Locatar> locatarList;


    Apartament(int nrcamere, int nrapartament) {

        this.nrcamere = nrcamere;
        this.nrapartament = nrapartament;
        this.locatarList = new ArrayList<Locatar>();

    }

    public void addLocatar(Locatar l) {


        locatarList.add(l);

    }


    public void removeLocatar(Locatar l) {

        locatarList.remove(l);

    }

    public List<Locatar> getLocatarList(){
        return locatarList;
    }

    public int getNrapartament(){
        return nrapartament;
    }


    @Override
    public String toString() {

        return "Apartament: "+locatarList+ " Numarul de camere: " + nrcamere + " Nr de apartament: " + nrapartament+"\n";

    }



}

