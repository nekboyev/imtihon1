import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
       /* List<Question> questions = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("questions.txt"));
        while (bufferedReader.ready()) {
            stringBuffer.append(bufferedReader.readLine());
            stringBuffer.append("$$");
        }
        String string = stringBuffer.toString();
        String[] javoblars = string.split("----------------------------------------");

        for (int i = 0; i < javoblars.length; i++) {
            Question question = new Question();
            int hard = javoblars[i].indexOf("HARD");
            int medium = javoblars[i].indexOf("MEDIUM");
            int easy = javoblars[i].indexOf("EASY");
            if (hard != -1) {
                question.setLevel(QuestionLevelEnum.valueOf("HARD"));
            } else if (medium != -1) {
                question.setLevel(QuestionLevelEnum.valueOf("MEDIUM"));
            } else question.setLevel(QuestionLevelEnum.valueOf("EASY"));
            String javoblar = javoblars[i];
            String[] javoblars1 = javoblar.split("Javoblar");
            question.setText(javoblars1[0].split("\\)")[1].replace("$", "").trim());
            List<Option> options = new ArrayList<>();
            String s = javoblars1[1];
            String[] split = s.split("\\$\\$");
            for (int j = 1; j < split.length; j++) {
                options.add(new Option(split[j].trim(), j == 1));
            }
            question.setOpions(options);
            questions.add(question);


        }
        List<String> belgi = new ArrayList<>();
        String coorect = "✅";
        String wrong = "❌";
       //for (int i = 0; i < questions.size(); i++) {
      //      System.out.println(questions.get(i).toString());
      //  }
       // Scanner scannerStr = new Scanner(System.in);
      //  Scanner scannerInt = new Scanner(System.in);
     //   Collections.shuffle(questions);
       // int hard = 0;
      //  int midiem = 0;
      //  int easy = 0;
      //  int anwers = 0;
     //   for (int i = 0; i < questions.size(); i++) {

            if (questions.get(i).getLevel().getBall() == 1 && easy != 15) {
                ++easy;
                System.out.println(questions.get(i).getText());

                Collections.shuffle(questions.get(i).getOpions());
                System.out.println("A." + questions.get(i).getOpions().get(0).getText());
                boolean correct = questions.get(i).getOpions().get(0).isCorrect();
                System.out.println("B." + questions.get(i).getOpions().get(1).getText());
                boolean correct1 = questions.get(i).getOpions().get(1).isCorrect();
                System.out.println("C." + questions.get(i).getOpions().get(2).getText());
                boolean correct2 = questions.get(i).getOpions().get(2).isCorrect();
                System.out.println("D." + questions.get(i).getOpions().get(3).getText());
                boolean correct3 = questions.get(i).getOpions().get(3).isCorrect();
                String s = scannerStr.nextLine();
                if (s.equals("1")) {
                    continue;
                } else if (s.equals("0")) break;
                else {
                    if (s.equals("A") && correct) {
                        belgi.add(coorect);
                                ++ anwers;
                    } else if (s.equals("B") && correct1) {
                        belgi.add(coorect);

                        ++anwers;
                    } else if (s.equals("C") && correct2) {
                        belgi.add(coorect);
                        ++anwers;
                    } else if (s.equals("D") && correct3) {
                        belgi.add(coorect);
                        ++anwers;
                    }
                    else belgi.add(wrong);
                }
            } else if (questions.get(i).getLevel().getBall() == 2 && midiem != 10) {
                ++midiem;
                System.out.println(questions.get(i).getText());

                Collections.shuffle(questions.get(i).getOpions());
                System.out.println("A." + questions.get(i).getOpions().get(0).getText());
                boolean correct = questions.get(i).getOpions().get(0).isCorrect();
                System.out.println("B." + questions.get(i).getOpions().get(1).getText());
                boolean correct1 = questions.get(i).getOpions().get(1).isCorrect();
                System.out.println("C." + questions.get(i).getOpions().get(2).getText());
                boolean correct2 = questions.get(i).getOpions().get(2).isCorrect();
                System.out.println("D." + questions.get(i).getOpions().get(3).getText());
                boolean correct3 = questions.get(i).getOpions().get(3).isCorrect();
                String s = scannerStr.nextLine();
                if (s.equals("1")) {
                    continue;
                } else if (s.equals("0")) break;
                else {
                    if (s.equals("A") && correct) {
                        belgi.add(coorect);
                        ++anwers;
                    } else if (s.equals("B") && correct1) {
                        belgi.add(coorect);
                        ++anwers;
                    } else if (s.equals("C") && correct2) {
                        belgi.add(coorect);
                        ++anwers;
                    } else if (s.equals("D") && correct3) {belgi.add(coorect);

                        ++anwers;
                    }
                    else belgi.add(wrong);
                }
            } else if (questions.get(i).getLevel().getBall() == 3 && hard != 5) {
                ++hard;
                System.out.println(questions.get(i).getText());

                Collections.shuffle(questions.get(i).getOpions());
                System.out.println("A." + questions.get(i).getOpions().get(0).getText());
                boolean correct = questions.get(i).getOpions().get(0).isCorrect();
                System.out.println("B." + questions.get(i).getOpions().get(1).getText());
                boolean correct1 = questions.get(i).getOpions().get(1).isCorrect();
                System.out.println("C." + questions.get(i).getOpions().get(2).getText());
                boolean correct2 = questions.get(i).getOpions().get(2).isCorrect();
                System.out.println("D." + questions.get(i).getOpions().get(3).getText());
                boolean correct3 = questions.get(i).getOpions().get(3).isCorrect();
                String s = scannerStr.nextLine();
                if (s.equals("1")) {
                    continue;
                } else if (s.equals("0")) break;
                else {
                    if (s.equals("A") && correct) {
                        belgi.add(coorect);
                        ++anwers;
                    } else if (s.equals("B") && correct1) {
                        belgi.add(coorect);
                        ++anwers;
                    } else if (s.equals("C") && correct2) {
                        belgi.add(coorect);
                        ++anwers;
                    } else if (s.equals("D") && correct3) {
                        belgi.add(coorect);
                        ++anwers;
                    }
                    else belgi.add(wrong);
                }
            }

            if (easy == 15 && hard == 5 && midiem == 10) break;


        }
        for (int i = 0; i < belgi.size(); i++) {
            System.out.println((i+1)+belgi.get(i));
        }
        System.out.println("ballingiz " + anwers);
        FileReader fileReader=new FileReader("k");*/
        Pattern pattern=Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("11");
        System.out.println("matcher.matches() = " + matcher.matches());
        System.out.println("matcher.lookingAt() = " + matcher.lookingAt());
        System.out.println("matcher.find() = " + matcher.find());


    }

}