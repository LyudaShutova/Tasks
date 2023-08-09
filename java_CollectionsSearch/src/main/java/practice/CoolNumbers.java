package practice;

import java.util.*;

import static java.lang.String.format;

public class CoolNumbers {
    public static List<String> generateCoolNumbers() {

        ArrayList<String> coolNumbers = new ArrayList<>();
        ArrayList<String> coolNumbersListWithoutRegion = new ArrayList<>();

        String numberplate;

        List<String> allowedLetters = new ArrayList<>(Arrays.asList("А", "В", "Е", "Е", "К", "М", "Н",
                "О", "Р", "С", "Т", "У", "Х"));

        for (String firstLetter : allowedLetters) {
            for (String secondLetter : allowedLetters) {
                for (String thirdLetter : allowedLetters) {
                    for (int n = 1; n < 10; n++) {
                        String numberplateWithoutRegion = String.format("%s%d%d%d%s%s", firstLetter
                                , n, n, n, secondLetter, thirdLetter);
                        coolNumbersListWithoutRegion.add(numberplateWithoutRegion);
                    }
                }
            }
        }

        for (String numberWithoutRegion : coolNumbersListWithoutRegion) {
            for (int j = 1; j <= 199; j++) {
                if (j < 10) {
                    numberplate = format("%s0%d", numberWithoutRegion, j);
                } else {
                    numberplate = format("%s%d", numberWithoutRegion, j);
                }
                coolNumbers.add(numberplate);
            }
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {

        boolean result;
        long time = System.nanoTime();
        if (list.contains(number)) {
            System.out.println("Поиск перебором. Номер найден " + number);
            time = System.nanoTime() - time;
            System.out.println("Потрачено " + time);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        boolean result;
        Collections.sort(sortedList);
        long time = System.nanoTime();
        int binarySearch = Collections.binarySearch(sortedList, number);
        if (binarySearch >= 0) {
            System.out.println("Бинарный поиск. Номер найден " + number);
            time = System.nanoTime() - time;
            System.out.println("Потрачено " + time);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        boolean result;
        long time = System.nanoTime();
        if (hashSet.contains(number)) {
            System.out.println("Хэш поиск. Номер найден " + number);
            time = System.nanoTime() - time;
            System.out.println("Потрачено " + time);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        boolean result;
        long time = System.nanoTime();
        if (treeSet.contains(number)) {
            System.out.println("Трисет поиск. Номер найден " + number);
            time = System.nanoTime() - time;
            System.out.println("Потрачено " + time);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
