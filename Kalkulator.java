public class Kalkulator {
    int zbroji (int x, int y){
        int rezultat = x+y;
        return rezultat;
    }

    int oduzmi (int x, int y){
        int rezultat = x-y;
        return rezultat;
    }

    int pomnozi (int x, int y){
        int rezultat = x*y;
        return rezultat;
    }

    double pomnozi (double x, double y){
        double rezultat = x*y;
        return rezultat;
    }

    double podijeli (double x, double y){
        double rezultat = x/y;
        return rezultat;
    }

    int podijeliDIV (int x, int y){
        int rezultat = x/y;
        return rezultat;
    }

    int podijeliMOD (int x, int y){
        int rezultat = x%y;
        return rezultat;
    }


      public static void main (String[] args){

        Kalkulator k = new Kalkulator();

        //Pozivanje metode za zbrajanje. Ispisivanje rezultata (123+23=146)
        System.out.println("Rezultat zbrajanja je: "+ k.zbroji(123,23));

        //Pozivanje metode za oduzimanje. Ispisivanje rezultata (10-7=3)
        System.out.println("Rezultat oduzimanja je: " +k.oduzmi(10,7));

        //Pozivanje metode za mnozenje. Ispisivanje rezultata (-10*8=-80).
        //Poziva se prva metoda za mnozenje u kojoj se mnoze cijeli brojevi - int
        System.out.println("Rezultat mnozenja je: " +k.pomnozi(-10,8));

        //Pozivanje metode za mnozenje. Ispisivanje rezultata (5.2*8=41.6).
        //Poziva se druga metoda za mnozenje u kojoj se mnoze realni brojevi - double
        System.out.println("Rezultat mnozenja je: " +k.pomnozi(5.2,8));

        //Pozivanje metode za dijeljenje realnih brojeva. Ispisivanje rezultata(5.2/2.6=2.0).
                System.out.println("Rezultat dijeljenja je: "+k.podijeli(5.2,2.6));

        //Pozivanje metode za cijelobrojno dijeljenje bez ostatka (DIV).
        //Ispisivanje rezultata (5/2=2, 4/2=2,10/3=3).

        //DIV dijeljenje dijeli dva cijela broja i vraca samo cijeli dio rezultata.
        System.out.println("Rezultat DIV dijeljenja je: "+k.podijeliDIV(5,2));
        System.out.println("Rezultat DIV dijeljenja je: "+k.podijeliDIV(4,2));
        System.out.println("Rezultat DIV dijeljenja je: "+k.podijeliDIV(10,3));

        //Pozivanje metode za vracanje ostatka pri dijeljenju (MOD).
        //Ispisivanje rezultata (5%2=1, 4%2=0,11%3=2).
        //MOD dijeljenje dijeli dva cijela broja i vraca samo ostatak pri dijeljenju.
        System.out.println("Rezultat MOD dijeljenja je: "+k.podijeliMOD(5,2));
        System.out.println("Rezultat MOD dijeljenja je: "+k.podijeliMOD(4,2));
        System.out.println("Rezultat MOD dijeljenja je: "+k.podijeliMOD(11,3));

    }
}


