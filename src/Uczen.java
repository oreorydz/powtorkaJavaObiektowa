public class Uczen extends Osoba{
    private int numerUcznia;
    private static int  liczbaUcznia;

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUcznia++;
        numerUcznia = liczbaUcznia;
    }

    public int getNumerUcznia() {
        return numerUcznia;
    }

    public void setNumerUcznia(int numerUcznia) {
        this.numerUcznia = numerUcznia;
    }

    public static int getLiczbaUcznia() {
        return liczbaUcznia;
    }

    public static void setLiczbaUcznia(int liczbaUcznia) {
        Uczen.liczbaUcznia = liczbaUcznia;
    }

    @Override
    public String toString() {
        return "imie=" + getImie() + ", " +
                "wiek=" + getWiek() + ", " +
                "numer ucznia=" + numerUcznia;
    }

}
