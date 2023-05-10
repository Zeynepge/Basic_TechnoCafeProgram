package Basic_TechnoCafeProgram;

import java.util.ArrayList;

public class TechnoKitchen {
    public static void Hesapla(ArrayList<IFood> siparisler)  {
        int a,b,c,d=0;a=0;b=0;c=0;
        int a_tutar,b_tutar,c_tutar,d_tutar=0;a_tutar=0;b_tutar=0;c_tutar=0;
        System.out.println();
        for (IFood istek:siparisler)
        {
            if (istek instanceof AdanaKebab)
            {a_tutar+=istek.ucret();a++;
                MyFunc.Bekle(2);
                System.out.println("AdanaKebap Siparisi alindi");
                System.out.println("** Hazirlanmaya Baslandi **");
                ((AdanaKebab) istek).marinade();
                ((AdanaKebab) istek).grill();
                System.out.println("Siparisiniz Hazirlandi... ");
                istek.taste();
                System.out.println("------------------------------");
            }
            if (istek instanceof Lahmacun)
            {b_tutar+=istek.ucret();b++;
                MyFunc.Bekle(2);
                System.out.println("Lahmacun Siparisi alindi");
                System.out.println("** Hazirlanmaya Baslandi **");
                ((Lahmacun) istek).dough();
                ((Lahmacun) istek).addMeat();
                ((Lahmacun) istek).bake();
                System.out.println("Siparisiniz Hazirlandi... ");
                istek.taste();
                System.out.println("------------------------------");
            }
            if (istek instanceof Borsh)
            {c_tutar+=istek.ucret();c++;
                MyFunc.Bekle(2);
                System.out.println("Borsh Siparisi alindi");
                System.out.println("** Hazirlanmaya Baslandi **");
                ((Borsh) istek).eatTomorrow();
                ((Borsh) istek).boil();
                System.out.println("Siparisiniz Hazirlandi... ");
                istek.taste();
                System.out.println("------------------------------");
            }
            if (istek instanceof Palov)
            {d_tutar+=istek.ucret();d++;
                MyFunc.Bekle(2);
                System.out.println("Palov Siparisi alindi");
                System.out.println("** Hazirlanmaya Baslandi **");
                ((Palov) istek).fry();
                ((Palov) istek).boil();
                System.out.println("Siparisiniz Hazirlandi... ");
                istek.taste();
                System.out.println("------------------------------");
            }
        }
        MyFunc.Bekle(2);
        System.out.println("*******  Siparis Özet  *******");
       MyFunc.Bekle(2);
        if(a!=0)
            System.out.println(a+" tane   AdanaKebap   : "+a_tutar+" TL");
        if(b!=0)
            System.out.println(b+" tane   Lahmacun     : "+b_tutar+" TL");
        if(c!=0)
            System.out.println(c+" tane   Borsh        : "+c_tutar+" TL");
        if(d!=0)
            System.out.println(d+" tane   Palov        : "+d_tutar+" TL");
            System.out.println("---------------------------------");
            System.out.println("Toplam Tutar          : "+(a_tutar+b_tutar+c_tutar+d_tutar)+" TL");
    }
}
