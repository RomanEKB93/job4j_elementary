package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert300RblThen5Dollar() {
        float in = 300;
        float expected = 5;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert4EuroThen280Rbl() {
        float in = 4;
        float expected = 280;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert7DollarThen420Rbl() {
        float in = 7;
        float expected = 420;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0DollarThen0Rbl() {
        float in = 0;
        float expected = 0;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen0Dollar() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}