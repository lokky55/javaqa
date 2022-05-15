package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest   //Вводим такой тип теста если костяк один но только параметры разные их задаем в параметрах метода test ниже
    @CsvFileSource (resources ={"/testdata.csv"})
    public void test(int amount, boolean isRegistered, int expected) { //название метода Test
        BonusService service = new BonusService();
        int actual = service.calculate(amount, isRegistered);
        //int expected = 30;  при замене на параметризированный тест ожидаемый результат вносим в параметры метода (test)
        Assertions.assertEquals(expected, actual);
    }
}
//    @Test
//    public void ShouldCalcBonusIfSmallAmountRegistered() {
//        BonusService service = new BonusService();
//        int actual = service.calculate(1000, true);
//        int expected = 30;
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void ShouldCalcBonusIfHugeAmountRegistered() {
//        BonusService service = new BonusService();
//        int actual = service.calculate(10_000_000, true);
//        int expected = 500;
//        Assertions.assertEquals(expected, actual);
//    }
//}

