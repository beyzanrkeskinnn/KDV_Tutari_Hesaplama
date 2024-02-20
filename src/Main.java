import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvoran=0.18, kdvtutari, kdvlitutar;

       Scanner input=new Scanner(System.in);
       System.out.println("Ücret Tutarı Giriniz ");
       tutar=input.nextDouble();

       kdvtutari=tutar*kdvoran;
       kdvlitutar=tutar+kdvtutari;

       if(tutar>0&&tutar<1000){
           kdvoran=0.18;
       }
       else if(tutar>=1000) {
           kdvoran=0.8;
       }

        System.out.println("KDV'siz tutar: "+tutar+"TL");
        System.out.println("KDV Oranı: "+ kdvoran+"TL");
        System.out.println("KDV Tutarı: "+ kdvtutari+"TL");
        System.out.println("KDV'li tutar: "+kdvlitutar+"TL");




    }
}