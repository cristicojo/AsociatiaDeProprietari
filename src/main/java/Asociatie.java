import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Asociatie implements Serializable {

    private static final long serialVersionUID = -4140719744954107494L;
    private List<Apartament> apartamentList;

    Asociatie(List<Apartament> apartamentList) {

        this.apartamentList = apartamentList;
    }


    public List<Locatar> getAllLocatar(Comparator<Locatar> x) {

        List<Locatar> loc = new ArrayList<Locatar>();


        for (int i = 0; i < apartamentList.size(); i++)
            loc.addAll(apartamentList.get(i).getLocatarList());

        Collections.sort(loc, x);


        return loc;
    }


    public void registerLocatarToApartament(Locatar l, Apartament ap) {

        ap.addLocatar(l);


    }

    public void unregisterLocatar(Locatar l, Apartament ap) {

        ap.removeLocatar(l);


    }

    @Override
    public String toString() {


        return "" + apartamentList;

    }

    public void saveFile() {

        try {
            FileOutputStream file = new FileOutputStream("asociatie.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();
        } catch (IOException ex) {

            System.out.println("IOException is caught");
        }
    }

    public static Asociatie loadFile() {

        Asociatie aso = null;

        try {
            FileInputStream file = new FileInputStream("asociatie.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            aso = (Asociatie) in.readObject();

            in.close();
            file.close();
        } catch (Exception ex) {

            System.out.println("IOException is caught");
            System.out.println(ex.getMessage());
        }
        return aso;
    }

}
