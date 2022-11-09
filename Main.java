import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zNo : Zodiac Number
        //zSign: Zodiac Sign

        Scanner inp=new Scanner(System.in);
        int birthYear,zNo;
        String zSign;

        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear=inp.nextInt();
        zNo=birthYear%12;
        switch (zNo)
        {
            case 0:
                zSign="Maymun";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 1:
                zSign="Horoz";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 2:
                zSign="Köpek";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 3:
                zSign="Domuz";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 4:
                zSign="Fare";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 5:
                zSign="Öküz";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 6:
                zSign="Kaplan";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 7:
                zSign="Tavşan";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 8:
                zSign="Ejderha";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 9:
                zSign="Yılan";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 10:
                zSign="At";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            case 11:
                zSign="Koyun";
                System.out.println("Çiz Zodyağı Burcunuz: "+ zSign);
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız..!!");
        }


    }
}