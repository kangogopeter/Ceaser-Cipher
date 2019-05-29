import java.io.Console;

public class App {
    public static void main(String[] args) {
        CeaserCipher ceaserCipher = new CeaserCipher();
        Console myConsole = System.console();
        System.out.println("input your name");

        String stringSentence = myConsole.readLine();
        System.out.println("enter the pin");
        String key = myConsole.readLine();
        int userKey = Integer.parseInt(key);

        String encryptResult = CeaserCipher.isEncrypt(stringSentence, userKey); 
        String decryptResult = CeaserCipher.runDecrypt(stringSentence,userKey);
    
        System.out.println("Choose 1 to Decrypt\nEnter 2 to Encrypt");

        String userCeaserCipher = myConsole.readLine();
        String ceaserCiphers = userCeaserCipher.toUpperCase();

        if (ceaserCiphers.equals("2")) {  

            System.out.println(encryptResult);
        }
        else if(ceaserCiphers.equals("1")){ 
            System.out.println(decryptResult);
        }
        else{
            System.out.println("Not a valid choice");
        }
    }

}