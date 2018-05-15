package com.example.calculator;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class CalculatorPage {

    public static void inputDataFirstNumber(String input) {
        onView(withId(R.id.edt_first))
                .perform(replaceText(input), closeSoftKeyboard());
    }

    public static void inputDataSecondNumber(String input) {
        onView(withId(R.id.edt_second))
                .perform(replaceText(input), closeSoftKeyboard());
    }

}
