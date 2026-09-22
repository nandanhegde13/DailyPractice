public class LastNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "Nandan";
        char result = '\0';

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            boolean repeating = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && ch == str.charAt(j)) {
                    repeating = true;
                    break;
                }
            }

            if (!repeating) {
                result = ch;
                break;
            }
        }

        if (result != '\0')
            System.out.println("Last non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found");
    }
}