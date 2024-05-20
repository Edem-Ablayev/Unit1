package ru.netology.service;
import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void amountBelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void amountHigherBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2679;

        int actual = cashbackHackService.remain(amount);
        int expected = 321;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void amountEqualToBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
