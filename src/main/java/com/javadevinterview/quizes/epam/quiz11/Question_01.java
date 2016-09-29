package com.javadevinterview.quizes.epam.quiz11;

import com.javadevinterview.quizes.QuestionTemplate;
import com.javadevinterview.quizes.QuizTemplate;

public class Question_01 implements QuizTemplate, QuestionTemplate {

    @Override
    public void startQiez() {
        System.out.print(getTitle());
        System.out.println(getCategory());
        System.out.println(getDescription());
        System.out.println(getAnswerList());
        System.out.println(getAnswer());
    }

    @Override
    public String getTitle() {
        String title = "EPAM Quiz 11 task 01\r\n";
        return title;
    }

    @Override
    public String getCategory() {
        String category = "Data struccture. Interface Set realization LinkedHashSet()\r\n";
        return category;
    }

    @Override
    public String getDescription() {
        String description =
                "Question:\r\n" +
                "\tclass HashTest {" +
                "\t    private static Set<String> set = new LinkedHashSet<String>();\r\n" +
                "\t    public static void main(String[] args) {\r\n" +
                "\t        set.add(\"one\");\r\n" +
                "\t        set.add(\"two\");\r\n" +
                "\t        set.add(\"three\");\r\n" +
                "\t        set.add(\"/u000a\");\r\n" +
                "\t        set.add(\"/u000d\");\r\n" +
                "\t        set.add(\"/u000c\");\r\n" +
                "\t        set.add(\"1\");\r\n" +
                "\t        set.add(\"2\");\r\n" +
                "\t        set.add(\"3\");\r\n" +
                "\t                       \r\n" +
                "\t        for (String string : set) { \r\n" +
                "\t            System.out.print(string + \" \");" +
                "\t        } \r\n" +
                "\t    } \r\n" +
                "\t}\r\n";
        return description;
    }

    @Override
    public String getAnswerList() {
        String answerList =
                "List of options:\r\n" +
                "\ta) RuntimeException\r\n" +
                "\tb) /u000a /u000c /u000d 1 2 3 one three two \r\n" +
                "\tc) one two three /u000a /u000d /u000c 1 2 3 \r\n" +
                "\td) 3 2 two 1 /u000a one three /u000c /u000d \r\n" +
                "\te) Compile Error\r\n" +
                "\tf) None of the above-listed\r\n";
        return answerList;
    }

    @Override
    public String getAnswer() {
        String answer =
                "Answer:\r\n" +
                        "\tc) one two three /u000a /u000d /u000c 1 2 3\r\n";
        return answer;
    }
}
