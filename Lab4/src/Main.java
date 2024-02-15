import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        try {
            FillDictionary.fillDict(dict, "src/in.txt");
            System.out.println(" ");
            Translator.translate("src/text.txt", dict);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
}