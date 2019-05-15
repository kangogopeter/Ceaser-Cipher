import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner ludut = new Scanner(System.in);

        System.out.println("HERE WE HIDE CODES :) WELCOME");

            System.out.println("place/m 5.Encrypt/k 6.Decrypt/k 7.Exit");
            int place;
            Scanner pitt = null;
            place = pitt.nextInt();
            CeaserCipher luck = new CeaserCipher();
            if (place == 5) {
                System.out.println("Enter A Word:");
                int enter = pitt.nextInt();
                int pett;
                pett = pitt.nextInt();
                System.out.println("INPUT A NUMBER");
                System.out.println(luck.encrypt(enter, pett));

            }
            else if(place == 5) {
                System.out.println("Enter A letter to Unhide");
                int enter = pitt.nextInt();
                System.out.println("Enter A Number ~");
                System.out.println(luck.decrypt(enter, 7));
            }
            else if (place == 5){
     System.exit(0);
            }
            else{
            System.out.println("Not A Choice !");
            }
        }
    }

