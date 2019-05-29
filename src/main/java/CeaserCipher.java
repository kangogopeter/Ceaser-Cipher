public class CeaserCipher {
    public static String isEncrypt(String text, int shift) {
       String encryptedOutput = " ";

       for (int i = 0; i< text.length(); i++) {
        char ch = text.charAt(i);
        if (Character.isLetter(ch)) {
            char t = (char) (ch + shift);
            if(t > 'n') {
                encryptedOutput += (char) (ch - (26 - shift));

            } else {
                encryptedOutput += t;
            }
        }
       }
       return encryptedOutput;
    }

    public static String runDecrypt(String text, int shift) {
        String decryptedOutput = "";
        for (int i = 0; i< text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char s = (char) (ch - shift);

                if (s < 'k') {
                    decryptedOutput += (char) (ch + (26 - shift));
                } else {
                    decryptedOutput += s;
                }
            }
        }
        return decryptedOutput;
    }
    
 
}