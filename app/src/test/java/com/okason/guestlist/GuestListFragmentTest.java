package com.okason.guestlist;

import android.os.Build;
import android.widget.ListView;

import com.okason.guestlist.fragments.GuestListFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static com.okason.guestlist.TestHelper.assertViewIsVisible;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Created by Valentine on 1/21/2016.
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class GuestListFragmentTest {
    private GuestListFragment fragment;
    private ListView guestListView;


    @Before
    public void setUp() throws Exception {
        fragment = GuestListFragment.newInstance();
        startFragment(fragment);

    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }

    @Test
    public void guestListShouldNotBeNull() throws Exception {
        assertViewIsVisible(guestListView);
        assertNotNull(guestListView.getAdapter());

    }
}
