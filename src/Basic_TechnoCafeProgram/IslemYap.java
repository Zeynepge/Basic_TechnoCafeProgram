package Basic_TechnoCafeProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class IslemYap {

    public static void islemYap()  {
        Scanner oku=new Scanner(System.in);
        ArrayList<IFood> siparisler=new ArrayList<>();
        int secim;
        do {
            Menu();
            secim=oku.nextInt();
            if (secim==1)
            {
                IFood yeni=new AdanaKebab();
                siparisler.add(yeni);
            }
            if (secim==2)
            {
                IFood yeni=new Lahmacun();
                siparisler.add(yeni);
            }
            if (secim==3)
            {
                IFood yeni=new Borsh();
                siparisler.add(yeni);
            }
            if (secim==4)
            {
                IFood yeni=new Palov();
                siparisler.add(yeni);
            }
        }while (secim!=0);
        //------ Yazdiralim ------
        TechnoKitchen.Hesapla(siparisler);
    }
    public static void Menu(){
        System.out.println("\n***** Menu *****");
        System.out.println("1- Adana Kebap (55 TL)");
        System.out.println("2- Lahmacun (33 TL)");
        System.out.println("3- Borsh (33 TL)");
        System.out.println("4- Palov (44 TL)");
        System.out.println("0- Tamam");
        System.out.print("Seciminiz : ");
    }
}