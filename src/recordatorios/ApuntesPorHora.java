package recordatorios;

import java.util.Calendar;
import java.util.Comparator;

public class ApuntesPorHora implements Comparator<Apunte>{

    @Override
    public int compare(Apunte t, Apunte t1) {
        Apunte apunte1 = t;
        Apunte apunte2 = t1;
        
        return apunte2.getFecha().get(Calendar.HOUR_OF_DAY)
                -apunte1.getFecha().get(Calendar.HOUR_OF_DAY);
    }

}
