package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryManagerTest {

    @Test
    public void ShouldSum() {
        SalaryManager manager = new SalaryManager();       // создаем обьект сервиса
        int[] salaries = {10_000, 6_000, 16_000, 11_000};  // создаем массив запрплат

        long actual = manager.sum(salaries);               // тестируем методом sum
        long expected = 10_000 + 6_000 + 16_000 + 11_000;  // суммируем все зарплаты, такая запись лучше чем подсчет в уме

        Assertions.assertEquals(actual, expected);         // сравниваем результаты
    }

    @Test
    public void ShouldFindMax() {
        SalaryManager manager = new SalaryManager();       // создаем обьект сервиса
        int[] salaries = {10_000, 6_000, 16_000, 11_000};  // создаем массив запрплат

        long actual = manager.max(salaries);               // тестируем методом max
        long expected = 16_000;                            // максимальная зп = 16_000

        Assertions.assertEquals(actual, expected);         // сравниваем результаты
    }

    @Test
    public void ShouldFindNumberOfMax() {
        SalaryManager manager = new SalaryManager();       // создаем обьект сервиса
        int[] salaries = {10_000, 6_000, 16_000, 11_000};  // создаем массив запрплат

        long actual = manager.maxi(salaries);               // тестируем методом maxi
        long expected = 2;                                  // максимальная зп находится во 2ой ячейке это 16_000

        Assertions.assertEquals(actual, expected);          // сравниваем результаты
    }
}

