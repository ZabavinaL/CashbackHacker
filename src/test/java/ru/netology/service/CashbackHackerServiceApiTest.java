package ru.netology.service;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackerServiceApiTest {

    @Test
    public void shouldIfAmountNull() {
        CashbackHackerService hackerService = new CashbackHackerService();

        int actual = hackerService.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountBelow1000() {
        CashbackHackerService hackerService = new CashbackHackerService();

        int actual = hackerService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountOver1000() {
        CashbackHackerService hackerService = new CashbackHackerService();

        int actual = hackerService.remain(1300);
        int expected = 700;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountEqual1000() {
        CashbackHackerService hackerService = new CashbackHackerService();

        int actual = hackerService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}