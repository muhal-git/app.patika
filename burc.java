import java.util.*;

public class burc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Doğum gününüz (gg.aa.yyyy): ");
        String dogumTarihi = scanner.nextLine();

        String[] dogum = dogumTarihi.split("[.]",0);

        int dogumGun = Integer.valueOf(dogum[0]);
        int dogumAy = Integer.valueOf(dogum[1]);
        int dogumYil = Integer.valueOf(dogum[2]);

        if ( (dogumAy==1 && dogumGun>=22) || (dogumAy==2 && dogumGun<=19))
        {
            System.out.println("Burcunuz: KOVA");
        }
        else if ( (dogumAy==2 && dogumGun>=20) || (dogumAy==3 && dogumGun<=20) ){
            System.out.println("Burcunuz: BALIK");
        }
        else if ( (dogumAy==3 && dogumGun>=21) || (dogumAy==4 && dogumGun<=20) ){
            System.out.println("Burcunuz: KOC");
        }
        else if ( (dogumAy==4 && dogumGun>=21) || (dogumAy==5 && dogumGun<=21) ){
            System.out.println("Burcunuz: BOGA");
        }
        else if ( (dogumAy==5 && dogumGun>=22) || (dogumAy==6 && dogumGun<=22) ){
            System.out.println("Burcunuz: IKIZLER");
        }
        else if ( (dogumAy==6 && dogumGun>=23) || (dogumAy==7 && dogumGun<=22) ){
            System.out.println("Burcunuz: YENGEC");
        }
        else if ( (dogumAy==7 && dogumGun>=23) || (dogumAy==8 && dogumGun<=22) ){
            System.out.println("Burcunuz: ASLAN");
        }
        else if ( (dogumAy==8 && dogumGun>=23) || (dogumAy==9 && dogumGun<=22) ){
            System.out.println("Burcunuz: BASAK");
        }
        else if ( (dogumAy==9 && dogumGun>=23) || (dogumAy==10 && dogumGun<=22) ){
            System.out.println("Burcunuz: TERAZI");
        }
        else if ( (dogumAy==10 && dogumGun>=23) || (dogumAy==11 && dogumGun<=21) ){
            System.out.println("Burcunuz: AKREP");
        }
        else if ( (dogumAy==11 && dogumGun>=22) || (dogumAy==12 && dogumGun<=21) ){
            System.out.println("Burcunuz: YAY");
        }
        else if ( (dogumAy==12 && dogumGun>=22) || (dogumAy==1 && dogumGun<=21) ){
            System.out.println("Burcunuz: OGLAK");
        }


    }
}
