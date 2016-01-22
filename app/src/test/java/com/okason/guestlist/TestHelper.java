package com.okason.guestlist;

import android.view.View;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Valentine on 12/27/2015.
 */
public class TestHelper {


    public static void assertViewIsVisible(View view){
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }


}
