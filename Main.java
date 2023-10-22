package seminars.first;

import seminars.first.Calculator.Calculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        double price = Calculator.calculatingDiscount(100.0, 10);
        System.out.println(price);
}}