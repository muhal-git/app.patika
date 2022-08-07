import java.util.Arrays;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class MineSweeper {

    private int tarlaSatirSayisi;
    private int tarlaSutunSayisi;
    private int mayinSayisi;
    private String[][] mayinTarlasi;
    private  String[][] dummyMayinTarlasi;




    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


    public MineSweeper() {
        System.out.println("Mayin tarlasi oyununa hosgeldiniz !");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("ZAMAN : " + dtf.format(now));
        System.out.println("Mayin tarlasi satir sutun sayisini giriniz !");
        while ( true ){
            try {
                System.out.print("Satir sayisi: ");
                tarlaSatirSayisi = Integer.parseInt(scanner.next());
                if ( tarlaSatirSayisi <=0 ){
                    System.out.println("Lutfen sifirdan buyuk bir deger giriniz !");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("Lutfen sayi degeri giriniz !");
            }
        }
        while ( true ){
            try {
                System.out.print("Sutun sayisi: ");
                tarlaSutunSayisi = Integer.parseInt(scanner.next());
                if ( tarlaSutunSayisi <=0 ){
                    System.out.println("Lutfen sifirdan buyuk bir deger giriniz !");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("Lutfen sayi degeri giriniz !");
            }
        }
        this.tarlaSatirSayisi = tarlaSatirSayisi;
        this.tarlaSutunSayisi = tarlaSutunSayisi;
        this.mayinSayisi = ( tarlaSatirSayisi * tarlaSutunSayisi ) / 4;
        mayinTarlasi = new String[tarlaSatirSayisi][tarlaSutunSayisi];
        dummyMayinTarlasi = new String[tarlaSatirSayisi][tarlaSutunSayisi];
        System.out.println("Tarla olusturuldu !");
    }


    public void tarlaGoster(String[][] arr){
        for (int i = 0; i < arr[0].length +2; i++) {
            System.out.print("+ ");
        }
        System.out.println("");
        for (String[] i:arr){
            System.out.print("+ ");
            for ( String s:i ){
                System.out.print(s + " ");
            }
            System.out.print("+\n");
        }
        for (int i = 0; i < arr[0].length +2; i++) {
            System.out.print("+ ");
        }
        System.out.println("");
    }

    public boolean contains(int[] arr, int element){
        for ( int i: arr ){
            if(i==element){
                return true;
            }
        }
        return false;
    }

    public void tarlaMayinDoldur(){
        System.out.println("Tarlaya mayinlar doseniyor...");
        int[] mayinSatir = new int[this.mayinSayisi];
        int[] mayinSutun = new int[this.mayinSayisi];
        Arrays.fill(mayinSatir,-1);
        Arrays.fill(mayinSutun,-1);
        for (int i = 0; i < this.tarlaSatirSayisi; i++) {
            for (int j = 0; j < this.tarlaSutunSayisi; j++) {
                mayinTarlasi[i][j] = "-";
                dummyMayinTarlasi[i][j]="-";
            }
        }



        for (int i = 0; i < this.mayinSayisi; i++) {
            int mayinKonum1, mayinKonum2;
            mayinKonum1 = (int) Math.floor(Math.random() * getTarlaSatirSayisi());
            mayinKonum2 = (int) Math.floor(Math.random() * getTarlaSutunSayisi());
            //System.out.println(i + ": " + mayinKonum1 + " - " + i + ": " + mayinKonum2);
            boolean b = true;
            for (int j = 0; j < mayinSatir.length; j++) {
                if ( (mayinSatir[j]==mayinKonum1) && (mayinSutun[j]==mayinKonum2) ){
                    b = false;
                    break;
                }
            }

            //System.out.println("b: " + b);
            if ( b ){
                mayinSatir[i] = mayinKonum1;
                mayinSutun[i] = mayinKonum2;
            }
            else {
                i--;
                //System.out.println("--");
            }
        }


        System.out.println("==============MAYINLAR==============");
        System.out.println(Arrays.toString(mayinSatir));
        System.out.println(Arrays.toString(mayinSutun));
        System.out.println("==============MAYINLAR==============");



        for (int i = 0; i < mayinSatir.length; i++) {
            this.mayinTarlasi[mayinSatir[i]][mayinSutun[i]] = "*";
        }
        System.out.println("Mayinlar dosendi !");
    }

    public int tarlaMayinTarama(String[][] tarla, int girilenSatir, int girilenSutun){
        try {
            if( tarla[girilenSatir][girilenSutun].equals("*") ){
                return 1;
            }
        }catch (Exception e){
            return 0;
        }
        return 0;
    }

    public boolean isWin(){
        for (int i = 0; i < this.tarlaSatirSayisi; i++) {
            for (int j = 0; j < this.tarlaSutunSayisi; j++) {
                if ( dummyMayinTarlasi[i][j].equals("-") && mayinTarlasi[i][j].equals("-") ){
                    return false;
                }
            }
        }
        return true;
    }

    public int puanHesaplamaAraci(String[][] arr){
        int sayac = 0;
        for (int i = 0; i < this.tarlaSatirSayisi; i++) {
            for (int j = 0; j < this.tarlaSutunSayisi; j++) {
                if ( this.mayinTarlasi[i][j].equals("*") ){
                    continue;
                }else if( arr[i][j].equals("-") ){
                    sayac++;
                }
            }
        }
        return sayac;
    }

    public void mayinTarlasiOyna(){
        System.out.println("============== OYUN BASLADI ==============");
        double puanHesabi = puanHesaplamaAraci(dummyMayinTarlasi);
        System.out.println("ilk:" + puanHesaplamaAraci(dummyMayinTarlasi));
            while(true){
            try {
                if ( isWin() ){
                    System.out.println("==========================================");
                    System.out.println("OYUN BITTI. KAZANDINIZ \\_(^ 0 ^)_/");
                    double puan = ((puanHesabi-puanHesaplamaAraci(dummyMayinTarlasi))/puanHesabi) * 100;
                    System.out.print("PUAN: ");
                    System.out.printf("%,.2f ",puan);
                    System.out.println(" / 100 \uD83D\uDE00 \uD83D\uDE00 \uD83D\uDE00");
                    tarlaGoster(dummyMayinTarlasi);
                    System.out.println("Cikmak icin ENTER'a basiniz !");
                    System.out.print("==========================================");
                    try{System.in.read();}
                    catch(Exception e){}
                    return;
                }
                //tarlaGoster(mayinTarlasi);
                System.out.println("==========================================");
                tarlaGoster(dummyMayinTarlasi);
                int maxSatir = this.tarlaSatirSayisi-1;
                int maxSutun = this.tarlaSutunSayisi-1;
                System.out.print("( 0 - " + maxSatir + " ) Satir giriniz: ");
                int girilenSatir = Integer.parseInt(scanner.next());
                System.out.print("( 0 - " + maxSutun + " ) Sutun giriniz: ");
                int girilenSutun = Integer.parseInt(scanner.next());
                if ( girilenSatir >= this.tarlaSatirSayisi | girilenSutun >= this.tarlaSutunSayisi ){
                    System.out.println("Hatali giris yapildi, yeniden giris yapiniz !");
                    continue;
                }
                else if ( mayinTarlasi[girilenSatir][girilenSutun].equals("*") ){
                    System.out.println("==========================================");
                    dummyMayinTarlasi[girilenSatir][girilenSutun] = "*";
                    tarlaGoster(dummyMayinTarlasi);
                    System.out.println("MAYINA BASTINIZ... OYUN BiTTi!");
                    double puan = ((puanHesabi-puanHesaplamaAraci(dummyMayinTarlasi))/puanHesabi) * 100;
                    System.out.print("PUAN: ");
                    System.out.printf("%,.2f ",puan);
                    System.out.println(" / 100");
                    System.out.println("Cikmak icin ENTER'a basiniz !");
                    System.out.print("==========================================");
                    try{System.in.read();}
                    catch(Exception e){}
                    return;
                }else {
                    int mayinDegeri = 0;

                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir,girilenSutun-1);
                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir,girilenSutun+1);
                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir-1,girilenSutun-1);
                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir-1,girilenSutun);
                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir-1,girilenSutun+1);
                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir+1,girilenSutun-1);
                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir+1,girilenSutun);
                    mayinDegeri += tarlaMayinTarama(mayinTarlasi,girilenSatir+1,girilenSutun+1);

                    System.out.println("Mayin tehlike degeri: " + mayinDegeri);
                    dummyMayinTarlasi[girilenSatir][girilenSutun] = String.valueOf(mayinDegeri);
                }

            }catch (Exception e){
                System.out.println("LUTFEN BELiRTiLEN ARALIKTA SAYI DEGERi GiRiNiZ !");
            }
            }
    }
/*
		i-1,j-1		i-1,j		i-1,j+1
		  i,j-1		  i,j	  	  i,j+1
		i+1,j-1		i+1,j		i+1,j+1
 */

    public int getTarlaSatirSayisi() {
        return tarlaSatirSayisi;
    }

    public void setTarlaSatirSayisi(int tarlaSatirSayisi) {
        this.tarlaSatirSayisi = tarlaSatirSayisi;
    }

    public int getTarlaSutunSayisi() {
        return tarlaSutunSayisi;
    }

    public void setTarlaSutunSayisi(int tarlaSutunSayisi) {
        this.tarlaSutunSayisi = tarlaSutunSayisi;
    }

    public int getMayinSayisi() {
        return mayinSayisi;
    }

    public void setMayinSayisi(int mayinSayisi) {
        this.mayinSayisi = mayinSayisi;
    }

    public String[][] getMayinTarlasi() {
        return mayinTarlasi;
    }

    public void setMayinTarlasi(String[][] mayinTarlasi) {
        this.mayinTarlasi = mayinTarlasi;
    }

    public String[][] getDummyMayinTarlasi() {
        return dummyMayinTarlasi;
    }

    public void setDummyMayinTarlasi(String[][] dummyMayinTarlasi) {
        this.dummyMayinTarlasi = dummyMayinTarlasi;
    }

}
