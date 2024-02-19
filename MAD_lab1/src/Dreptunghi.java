public class Dreptunghi {
    //EX4 incapsularea unui concept
    public int lungime, latime;
    public Dreptunghi() {}
    public Dreptunghi(int lungime, int latime)
    {
        this.lungime=lungime;
        this.latime=latime;
    }
    public int getLungime() {
        return this.lungime;
    }
    public int getLatime() {
        return this.latime;
    }
    public void setLungime(int lungime)
    {
        this.lungime = lungime;
    }
    public void setLatime(int latime)
    {
        this.latime = latime;
    }

    public static void main(String[] args) {
        Dreptunghi d= new Dreptunghi(25,5);
        Dreptunghi d2=new Dreptunghi();
        int lungime=d.getLungime();
        int latime=d.getLatime();

        lungime=15;
        d2.setLungime(lungime);

        latime=10;
        d2.setLatime(latime);

        System.out.println("Lungimea dreptunghiului cu getteri este de: " + d.getLungime() + " ,iar latimea de " + d.getLatime());
        System.out.println("Lungimea dreptunghiului cu setteri este de: " + d2.getLungime() + " ,iar latimea de " + d2.getLatime());
    }
}