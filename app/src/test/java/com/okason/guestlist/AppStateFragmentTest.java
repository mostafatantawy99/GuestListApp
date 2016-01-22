package com.okason.guestlist;

import android.os.Build;

import com.okason.guestlist.fragments.AppStateFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Valentine on 1/21/2016.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class AppStateFragmentTest {
    private AppStateFragment fragment;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }


}
