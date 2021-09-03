
package com.moringaschool.beccafirst;

import static org.junit.Assert.assertTrue;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import java.text.BreakIterator;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity mainActivityTest;

    @Before
    public void setUp() throws Exception{
        mainActivityTest = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void validateTextviewContent() {
        TextView restaurantsTextview = mainActivityTest.findViewById(R.id.restaurantTextview);
        assertTrue("MyRestaurants".equals(restaurantsTextview.getText().toString()));
    }
}
