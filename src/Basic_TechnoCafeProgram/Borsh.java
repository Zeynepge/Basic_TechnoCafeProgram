package Basic_TechnoCafeProgram;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("Enfes Borsh Afiyet Olsun...");
    }
    @Override
    public double ucret() {

        return 33;
    }
    void boil(){
        System.out.println("Kaynatildi...");
    }
    void eatTomorrow(){
        System.out.println("Etler sebzeler eklendi...");
    }

}