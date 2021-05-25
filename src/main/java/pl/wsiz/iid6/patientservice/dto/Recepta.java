package zdrowie;

import java.util.Date;
import java.util.List;

public class Recepta {
    private static int ileWazna=90;
    private Date dataWydania;
    private List<Lek> listaLekow;
    private double cena;

    public boolean checkWaznosc(){
        // roznica pomiedzy wystawieniem a dzies <ileWazna
        return true;
    }
}
