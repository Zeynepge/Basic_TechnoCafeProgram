package Basic_TechnoCafeProgram;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Enfes Lahmacun Afiyet Olsun...");
    }
    @Override
    public double ucret() {

        return 33;
    }
    void dough(){
        System.out.println("Hamur acildi...");
    }
    void addMeat(){
        System.out.println("Et eklendi...");
    }
    void bake(){
        System.out.println("Pisirildi...");
    }
}