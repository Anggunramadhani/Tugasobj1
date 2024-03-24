public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung("tabung");
        Kubus kubus = new Kubus("kubus");
        Balok balok = new Balok("balok");

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();
    }
}
