package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализировать полученные данные
     */

    public static void main(String[] args) {
        new CoolNumbers();
        long startTime = System.nanoTime();
        List<String> generatedNumbers = new ArrayList<>(CoolNumbers.generateCoolNumbers());
        String number = "Х999ХХ199";
        HashSet<String> hashSet = new HashSet<>(generatedNumbers);
        TreeSet<String> treeSet = new TreeSet<>(generatedNumbers);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " nanoseconds");
        CoolNumbers.binarySearchInList(generatedNumbers, number);
        CoolNumbers.bruteForceSearchInList(generatedNumbers, number);
        CoolNumbers.searchInHashSet(hashSet, number);
        CoolNumbers.searchInTreeSet(treeSet, number);

    }
}
