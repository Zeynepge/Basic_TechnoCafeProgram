package Basic_TechnoCafeProgram;

public class MyFunc {
    public static void Bekle(int sn){
        try {
            Thread.sleep(1000*sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
