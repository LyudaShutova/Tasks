package practice;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    public static TreeSet<String> emailList = new TreeSet<>();
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        Pattern pattern = Pattern.compile("[^A-Z,\\s]+@+[^A-Z,\\s]+[.]+\\w{2,3}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            emailList.add(email);
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }

    }

    public static ArrayList<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        ArrayList<String> list = new ArrayList<>(emailList);
        emailList.clear();
        for (String j : list) {
            System.out.println(j);
        }
        return list;
    }

}
