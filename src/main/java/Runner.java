import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Runner {


    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());


    public static void main(String[] args) {


//        Apartament ap = new Apartament(2, 6);
//        Apartament ap1 = new Apartament(5, 3);
//        Apartament ap2 = new Apartament(9, 7);
//
//        Locatar cristi = new Locatar("Cristi", ap);
//        Locatar ionel = new Locatar("Ionel", ap1);
//        Locatar geo = new Locatar("Geo", ap2);
//
//
//
//        List<Apartament> apartamentList = new ArrayList<Apartament>();
//        apartamentList.add(ap);
//        apartamentList.add(ap1);
//        apartamentList.add(ap2);
//
//        Asociatie aso = new Asociatie(apartamentList);
//
//        aso.registerLocatarToApartament(cristi, ap);
//        aso.registerLocatarToApartament(ionel, ap1);
//        aso.registerLocatarToApartament(geo, ap2);
//
//        LOGGER.info(aso.toString());
//
//        LOGGER.info(aso.getAllLocatar(new Locatar.ComparatorbyName()).toString());
//        LOGGER.info(aso.getAllLocatar(new Locatar.ComparatorbyNrApartament()).toString());
//
//        aso.saveFile();

        LOGGER.info(Asociatie.loadFile().toString());




        //aso.unregisterLocatar(geo,ap2);

        //LOGGER.info(aso.toString());


    }
}
