package com.okason.guestlist.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.okason.guestlist.MainActivity;
import com.okason.guestlist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppStateFragment extends Fragment {

    MainActivity parentActivity;

    public AppStateFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        parentActivity = (MainActivity) getActivity();
        openFragment(GuestListFragment.newInstance(), "Guest List");
    }

    private void openFragment(Fragment fragment, String screenTitle){

        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
        parentActivity.getSupportActionBar().setTitle(screenTitle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app_state, container, false);
    }

}
