public class Auto {
    String kenteken;
    String merk;
    String kleur;

    public Auto(String kenteken, String merk, String kleur) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.kleur = kleur;
    }

    public String getKenteken() {
        return kenteken;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
        System.out.println("Test 14-9-21:24");
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String toString() {
        String output = "";
        output += kenteken + " " + merk  + " " + kleur;
        System.out.println("pipo");
        return output;
    }
}
