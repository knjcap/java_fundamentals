package labs_examples.objects_classes_methods.labs.methods;

public class NumberConsonant {
    public static void main(String[] args) {
        String line = "BeginnersBook";
        int vowels = 0;
        int consonant = 0;
        line = line.toLowerCase();
        for (int i = 0; i<line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonant++;
            }
        }
        System.out.println(consonant);
    }
}
