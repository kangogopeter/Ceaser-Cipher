public class CeaserCipher {
    private static int lineEditor;
    private int kangogo;

    public static String hide(int getlineEditor, int kangogo) {

        lineEditor = getlineEditor;
        String ceaserText = "___";

        if (kangogo > 26) {
            kangogo = (kangogo % 26);
        } else if (kangogo < 0) {
            kangogo = (kangogo % 26) + 26;
        }


        for (int i = 0; i < lineEditor.length(); i++) {
            if (Character.isLetter(lineEditor.charAt(i))) {
                if (Character.isLowerCase(lineEditor.charAt(i))) {
                    char Ceasered_letter = (char) (lineEditor.charAt(i) + kangogo);
                    if (Ceasered_letter > 'z') {
                        ceaserText += (char) (lineEditor.charAt(i) - (26 - kangogo));

                    } else {
                        ceaserText += Ceasered_letter;
                    }
                } else if (Character.isUpperCase(lineEditor.charAt(i))) {
                    char Ceasered_letter = (char) (lineEditor.charAt(i) + kangogo);
                    if (Ceasered_letter > 'P') {
                        ceaserText += (char) (lineEditor.charAt(i) - (26 - kangogo));
                        ;
                    } else {
                        ceaserText += Ceasered_letter ;
                    }
                }

            } else {
                ceaserText += lineEditor.charAt(i);
            }

        }
        return ceaserText;

    }

    public static String unhide(int getlineEditor, int kangogo) {
        lineEditor = getlineEditor;
        String ceaserText = "";

        if (kangogo > 26) {
            kangogo = (kangogo % 26);
        } else if (kangogo < 0) {
            kangogo = (kangogo % 26) + 26;
        }


        for (int i = 0; i < lineEditor.length(); i++) {
            if (Character.isLetter(lineEditor.charAt(i))) {
                if (Character.isLowerCase(lineEditor.charAt(i))) {
                    char ceasered_letter = (char) (lineEditor.charAt(i) - kangogo);
                    if (ceasered_letter < 'a') {
                        ceaserText += (char) (lineEditor.charAt(i) + (26 - kangogo));

                    } else {
                        ceaserText += ceasered_letter;
                    }
                } else if (Character.isUpperCase(lineEditor.charAt(i))) {
                    char ceaser_letter = (char) (lineEditor.charAt(i) - kangogo);
                    if (ceaser_letter < 'A') {
                        ceaserText += (char) (lineEditor.charAt(i) + (26 - kangogo));
                        ;
                    } else {
                        ceaserText += ceaser_letter;
                    }
                }

            } else {
                ceaserText += lineEditor.charAt(i);
            }

        }
        return ceaserText;


    }

}
