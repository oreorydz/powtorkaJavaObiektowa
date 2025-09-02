//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Uczen uczen = new Uczen("jan", 18);
    Uczen uczen2 = new Uczen("wojtek", 18);
    Uczen uczen3 = new Uczen("maciej", 18);
    System.out.println(Uczen.getLiczbaUcznia());
    System.out.println(uczen.toString());
    }
}
