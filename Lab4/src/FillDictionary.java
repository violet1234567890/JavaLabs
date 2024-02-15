import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class FillDictionary {
    public static void fillDict(HashMap<String, String> dict, String name) throws FileReadException, InvalidFileFormatException {
        try {
            String[] words;
            try (Scanner in = new Scanner(new File(name))) {
                while(in.hasNextLine()) {
                    String line = in.nextLine();
                    words = line.split(" \\| ");
                    if(words.length != 2) {
                        throw new InvalidFileFormatException("Invalid format");
                    }
                    if(!words[0].isEmpty() && !words[1].isEmpty()) {
                        dict.put(words[0].toLowerCase(), words[1].toLowerCase());
                    }
                    else {
                        throw new InvalidFileFormatException("Invalid file format");
                    }
                }
            }
        }
        catch (InvalidFileFormatException e) {
            throw new InvalidFileFormatException(e.getMessage());
        }
        catch (Exception e) {
            throw new FileReadException("File with dict cannot be opened " + e.getMessage());
        }
    }
}
