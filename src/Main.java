import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double yariCap,merkezAci,daireDilimininAlani;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yariCap= input.nextDouble();

        System.out.print("Daire Diliminin Merkez Açısını Giriniz: ");
        merkezAci= input.nextDouble();

        //Kullanıcıdan aldığımız yarıçapla ve açıyla alan hesaplıyoruz.

        daireDilimininAlani=(3.14*(yariCap*yariCap)*merkezAci)/360;

        System.out.println("Daire Diliminin Alanı: "+daireDilimininAlani);
    }
}