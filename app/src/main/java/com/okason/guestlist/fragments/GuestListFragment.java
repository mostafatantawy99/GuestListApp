package com.okason.guestlist.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.okason.guestlist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuestListFragment extends Fragment {


    public GuestListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guest_list, container, false);
    }

    public static GuestListFragment newInstance() {
        return new GuestListFragment();
    }

}
