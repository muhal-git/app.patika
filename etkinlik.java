import java.util.*;

public class etkinlik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sicaklik;

        while (true) {
            System.out.print("Sicaklik degerini giriniz: ");
            sicaklik = scanner.nextInt();

            if (sicaklik < -90 || sicaklik > 70) {
                System.out.println("Gecerli bir sicaklik degeri giriniz! Tekrar deneyiniz...");
            } else {
                if (sicaklik<5) {
                    System.out.print("Sağlık durumunuz iyi mi? Evet/Hayır\n>> ");
                    scanner.next();
                    String saglikDurumu;
                    saglikDurumu = scanner.nextLine().toLowerCase();
                    if (saglikDurumu.equals("evet")) {
                        System.out.println("Kayak yapabilirsiniz!");
                    } else if (saglikDurumu.equals("hayır")) {
                        System.out.println("Sagliginiza dikkat edin, evde kalin...");
                    } else {
                        System.out.println("Gecerli bir cevap vermediniz!");
                    }
                }
                else if (sicaklik>=5 && sicaklik<15) {
                    System.out.println("Sinemeya gidebilirsiniz.");
                }
                else if (sicaklik>=15 && sicaklik<25) {
                    System.out.print("Hava yagmurlu mu? Evet/Hayır\n>> ");
                    scanner.next();
                    String havaDurumu;
                    havaDurumu = scanner.nextLine().toLowerCase();
                    if (havaDurumu.equals("evet")) {
                        System.out.println("Kısa bir yuruyus yapabilirsiniz!");
                    } else if (havaDurumu.equals("hayır")) {
                        System.out.println("Piknige gidebilirsiniz...");
                    } else {
                        System.out.println("Gecerli bir cevap vermediniz!");
                    }
                }
                else if (sicaklik>=25) {
                    while (true) {
                        System.out.print("Yuzme biliyor musunuz? Evet/Hayır >> ");
                        String yuzmeDurum = scanner.next().toLowerCase();
                        System.out.print("durum: "+yuzmeDurum);
                        if (yuzmeDurum.equals("evet")) {
                            System.out.println("Yuzmeye gidebilirsiniz!");
                            break;
                        } else if (yuzmeDurum.equals("hayır")) {
                            System.out.println("Piknige gidebilirsiniz...");
                            break;
                        } else {
                            System.out.println("Gecerli bir cevap vermediniz!");
                        }
                    }
                }
                break;
            }

        }

    }
}
