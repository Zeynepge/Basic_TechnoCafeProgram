package Basic_TechnoCafeProgram;

public class AdanaKebab implements IFood{
    @Override
    public void taste() {
        System.out.println("Enfes Adana Kebap Afiyet Olsun...");
    }
    @Override
    public double ucret() {

        return 55;
    }
    void marinade() {
        System.out.println("Marine edildi...");

    }
    void grill(){
        System.out.println("Izgarada pisirildi...");
    }

}