package imtihon.uchinchi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Pattern pattern=Pattern.compile("[0-9]{2,}");
        BufferedReader bufferedReader=new BufferedReader(new FileReader("sinovTest.txt"));
        StringBuilder stringBuilder=new StringBuilder();
        while (bufferedReader.ready()){
            stringBuilder.append(bufferedReader.readLine());
            stringBuilder.append(" ");
        }
        String string = stringBuilder.toString();
        String[] s = string.split(" ");
        for (int i = 0; i < s.length; i++) {
            Matcher matcher = pattern.matcher(s[i]);
            while (matcher.find())
            {
                System.out.println(matcher.group());
            }
        }



    }
}
