public class BangunRuang {
    private String name;

    BangunRuang(String name){
        this.name = name;
    }

    public void inputNilai(){
        System.out.println("\n======Input nilai "+ getName()+"======");
    }

    public void luasPermukaan(){
        System.out.println("Menghitung luas permukaan bangun " + getName());
    }

    public void volume(){
        System.out.println("Menghitung volume bangun " + getName());
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
