import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    int n1, n2, select;
    Scanner in = new Scanner(System.in);
    System.out.print("Birinci Sayıyı Giriniz:");
    n1= in.nextInt();
    System.out.print("İkinci Sayıyı Giriniz:");
    n2=in.nextInt();
    System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
    select= in.nextInt();

switch (select){
    case 1:
        System.out.println("Toplam:"+ (n1+n2) );
        break;
    case 2:
        System.out.println("Çıkarma:" + (n1-n2));
        break;
    case 3:
        if (n2 != 0) {
            System.out.println("Bölüm:" + (n1 / n2));
        }else {
            System.out.println("Bir sayı 0'a bölünenemez.");
        }
        break;
    case 4:
        System.out.println("Çarpım:"+(n1*n2));
        break;
    default:
        System.out.println("Hatalı bir seçim yaptınız. Lütfen 1 ile 4 arasında bir seçim yapınız");
        break;

}
    }
    }
