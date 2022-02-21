package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 210;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + expected + " euros" + ". Test result : " + passed);
        in = 300;
        expected = 5;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(in + " rubles are " + expected + " dollars" + ". Test result : " + passed);
        in = 4;
        expected = 280;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println(in + " euros are " + expected + " rubles" + ". Test result : " + passed);
        in = 7;
        expected = 420;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println(in + " dollars are " + expected + " rubles" + ". Test result : " + passed);
    }
}
