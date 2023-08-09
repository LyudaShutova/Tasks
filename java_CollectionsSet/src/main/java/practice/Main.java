package practice;

import java.util.Scanner;

public class Main {


    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */
    public static String email = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду: \"ADD\" и e-mail или \"LIST\", чтоб получить список");
            String input = scanner.nextLine();
            String[] words = input.split("\\s+");
            if (input.equals("0")) {
                break;
            } else if (words[0].equals("LIST") && words.length == 1) {
                EmailList.getSortedEmails();

            } else if (words[0].equals("ADD") && words.length > 1) {
                email = words[1];
                EmailList.add(email);
                System.out.println(email);
            } else {
                System.out.println("Команда некорректна!");
            }

            //TODO: write code here

        }
    }
}
