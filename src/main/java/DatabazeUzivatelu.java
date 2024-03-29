import java.util.HashMap;

public class DatabazeUzivatelu {
    private final HashMap<String, Uzivatel> uzivatele;
    private static DatabazeUzivatelu instance = null;

    public boolean addUzivatele(Uzivatel uzivatel) {
        if (this.uzivatele.containsKey(uzivatel.getUserName())) {
            return false;
        }
        uzivatele.put(uzivatel.getUserName(), uzivatel);
        return true;
    }

    public boolean contains(Uzivatel uzivatel) {
        return uzivatele.containsKey(uzivatel.getUserName());
    }

    public boolean contains(String userName) {
        return uzivatele.containsKey(userName);
    }

    public Uzivatel getUzivatel(String userName) {
        return uzivatele.get(userName);
    }

    private DatabazeUzivatelu() {
        uzivatele = new HashMap<>();
    }

    public static DatabazeUzivatelu getInstance() {
        if (DatabazeUzivatelu.instance == null) {
            DatabazeUzivatelu.instance = new DatabazeUzivatelu();
        }
        return DatabazeUzivatelu.instance;
    }
}
