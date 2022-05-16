package ru.netology.javaqa;

public class SalaryManager {                   // Создаем класс
    public long sum(int[] salaries) {          // создаем метод sum по поиску суммы всех ячеек массива
        int sum = 0;
        for (int salary : salaries) {          // задаем цикл перебора значений в массиве
            sum += salary;                     // sum = sum + salary
        }
        return sum;
    }

    public int max(int[] salaries) {            // создаем метод max - поиск максимальной зарплаты
        int max = 0;                            // АЗ // int max = salaries[0]  - возьми первую зарплату и далее сравнивай с ней
        for (int salary : salaries) {
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }

    public int maxi(int[] salaries) {                 // создаем метод поиска номера ячейки где лежит самая большая зп из массива
        int maxi = 0;
        for (int i = 0; i < salaries.length; i++) {   // проверь для каждого номера ячейки
            if (salaries[i] > salaries[maxi]) {       // больше ли зп проверяемого номера с той которую ты запомнил
                maxi = i;
            }
        }
        return maxi;
    }
}

