package com.example.myhealth;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.StringContains.containsString;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

public class UnitTest {
    @RunWith(AndroidJUnit4.class)
    public class EditTextTest {


        @Test
        public void editTextTest() {
            onView(withId(R.id.password)).check(matches(withText(containsString("SOME_TEXT"))));
        }

    }
}
