package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateWhenOneHundredRubleLackToThousand() {

        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWithFullThousand() {

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWhenNineHundredNinetyNineLackToTwoThousand() {

        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWhenOneRubleLackToThousand() {

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWhenNineHundredNinetyNineLackToThousand() {

        int expected = 999;
        int actual = service.remain(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWhenFullSumLack() {

        int expected = 1000;
        int actual = service.remain(0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWithNegativeSum() {

        int expected = 1001;
        int actual = service.remain(-1);
        Assert.assertEquals(actual, expected);
    }


}