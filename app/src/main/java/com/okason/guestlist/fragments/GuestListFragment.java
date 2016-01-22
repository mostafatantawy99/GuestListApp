package com.okason.guestlist.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.okason.guestlist.R;
import com.okason.guestlist.adapters.GuestListAdapter;
import com.okason.guestlist.data.SampleData;
import com.okason.guestlist.models.Guest;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuestListFragment extends Fragment {
    private View mLayout;
    private ListView mListView;
    private GuestListAdapter mAdapter;
    private List<Guest> mGuests;

    public GuestListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mLayout = inflater.inflate(R.layout.fragment_guest_list, container, false);
        initializeView();
        return mLayout;
    }

    private void initializeView() {
        mListView = (ListView) mLayout.findViewById(R.id.guestListView);
        mGuests = SampleData.getSampleGuests();
        mAdapter = new GuestListAdapter(getContext(), mGuests);
        mListView.setAdapter(mAdapter);
    }

    public static GuestListFragment newInstance() {
        return new GuestListFragment();
    }

}
