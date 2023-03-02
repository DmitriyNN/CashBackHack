package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() { // Тестируем случай, когда сумма покупки меньше граничных значений
        CashbackHackService service = new CashbackHackService();
        int amount = 120;
        int actual = service.remain(amount);
        int expected = 880;
        assertEquals(actual, expected);
    }

    @Test
    public void remain1() { // Тестируем граничные значения
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void remain2() { // Тестируем граничные значения
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void remain3() { // Тестируем граничные значения
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void remain4() { // Тестируем случай, когда сумма покупки больше граничных значений
        CashbackHackService service = new CashbackHackService();
        int amount = 4263;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
