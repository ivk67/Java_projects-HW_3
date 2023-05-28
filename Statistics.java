/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
 из этого списка. Collections.max() */

package HW_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statistics {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int min = Collections.min(numbers);
        System.out.println("Минимальное значение: " + min);

        int max = Collections.max(numbers);
        System.out.println("Максимальное значение: " + max);

        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();
        System.out.println("Среднее арифметическое: " + average);
    }
}
