package com.example.myhealth;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import android.content.Context;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UnitTest {

    private static final String FAKE_STRING = "Login was successful";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        LoginInfo myObjectUnderTest = new LoginInfo(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.("user", "user");

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }

}