import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    public static void translate(String filename, HashMap<String, String> dict) throws FileReadException {
        try {
            String[] text;
            try (Scanner in = new Scanner(new File(filename))) {
                while (in.hasNextLine()) {
                    String res = "";
                    String word = in.nextLine().toLowerCase();
                    String transl = dict.get(word);
                    if (transl != null) {
                        res += transl;
                        res += ' ';
                    }
                    else {
                        text = word.split(" ");
                        int num = text.length;
                        int counter = 0;
                        for(int i = 0; i < num; i++) {
                            counter += text[i].length();
                            String a = text[i];
                            transl = dict.get(a);
                            String transl1 = dict.get(word.substring(counter-1, word.length()-1));
                            if (transl != null) {
                                res += transl;
                                res += ' ';
                            }
                            else {
                                res += text[i];
                                res += ' ';
                            }
                            if(transl1 != null) {
                                res += transl1;
                                res += ' ';
                                break;
                            }
                        }
                    }
                    System.out.println(res);
                }
            }
        }
        catch (Exception e) {
            throw new FileReadException("File with text cannot be opened " + e.getMessage());
        }
    }
}
