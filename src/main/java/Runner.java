import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class Runner {


    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());


    public static void main(String[] args) {


        Apartament ap = new Apartament(0, 1);
        Apartament ap1 = new Apartament(2, 3);
        Apartament ap2 = new Apartament(4, 5);

        Locatar cristi = new Locatar("Cristi", ap);
        Locatar ionel = new Locatar("Tata", ap1);
        Locatar geo = new Locatar("Mama", ap2);


        List<Apartament> apartamentList = new ArrayList<Apartament>();
        apartamentList.add(ap);
        apartamentList.add(ap1);
        apartamentList.add(ap2);

        Asociatie aso = new Asociatie(apartamentList);

        aso.registerLocatarToApartament(cristi, ap);
        aso.registerLocatarToApartament(ionel, ap1);
        aso.registerLocatarToApartament(geo, ap2);


        LOGGER.info(aso.toString());

        LOGGER.info(aso.getAllLocatar(new Locatar.ComparatorbyName()).toString());
        LOGGER.info(aso.getAllLocatar(new Locatar.ComparatorbyNrApartament()).toString());

        //LOGGER.info(Asociatie.loadFile().toString());
        aso.saveFile();

//        aso.unregisterLocatar(ionel,ap1);
//
//        LOGGER.info(aso.toString());


    }


}
