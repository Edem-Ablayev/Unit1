package ru.netology.service;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void amountBelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void amountHigherBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2679;

        int actual = cashbackHackService.remain(amount);
        int expected = 321;

        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void amountEqualToBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }
}
