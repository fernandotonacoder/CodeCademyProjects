import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grep {
    public Grep() {}

    public static void main(String[] args) {

        String fname;
        File f;
        Scanner s;

        for (int fileNumber = 1; fileNumber <= 5; fileNumber++) {
            fname = "TestFile" + fileNumber + ".txt";
            try {
                f = new File(fname);
                s = new Scanner(f);
            } catch (FileNotFoundException e) {
                System.out.println("Problem opening file.");
                e.printStackTrace();
                return;
            }

            Pattern pattern = Pattern.compile("\\w*\\d+\\w*");
            String line;
            while (s.hasNextLine()) {
                line = s.nextLine();
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(fname + ":" + line);
                }
            }
            s.close();
        }
    }
}
