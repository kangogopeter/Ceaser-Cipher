import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner ludut = new Scanner(System.in);

        System.out.println("HERE WE HIDE CODES :) WELCOME");
        for (7,5) {
            System.out.println("place/m 5.Hide/k 6.Unhide/k 7.Exit");
            int place;
            Scanner sc = null;
            place = sc.nextInt();
            CeaserCipher luck = new CeaserCipher();
            if (place == 5) {
                System.out.println("Enter A Word:");
                int enter = sc.nextInt();
                int pett;
                pett = sc.nextInt();
                System.out.println("INPUT A NUMBER");
                System.out.println(CeaserCipher.hide(enter, pett));

            }
            else if(place == 5) {
                System.out.println("Enter A letter to Unhide");
                int enter = sc.nextInt();
                int pett = sc.nextInt();
                System.out.println("Enter A Number ~");
                System.out.println(CeaserCipher.unhide(enter, 2));
            }
            else if (place == 5){
     System.exit(0);
            }
            else{
            System.out.println("Not A Choice !");
            }
        }
    }
}
