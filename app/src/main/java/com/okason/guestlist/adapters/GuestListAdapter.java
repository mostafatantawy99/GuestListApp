package com.okason.guestlist.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.okason.guestlist.R;
import com.okason.guestlist.models.Guest;
import com.squareup.picasso.Picasso;

import java.util.List;


public class GuestListAdapter extends ArrayAdapter<Guest> {
    private List<Guest> mGuest;
    private Context mContext;

    public GuestListAdapter(Context context, List<Guest> guests) {
        super(context, R.layout.guest_list_custom_row);
        mGuest = guests;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mGuest.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Holder mHolder;

        final Guest selectedGuest = mGuest.get(position);

        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.guest_list_custom_row, null);

            mHolder = new Holder();
            mHolder.guestName = (TextView)view.findViewById(R.id.text_view_guests_name);
            mHolder.guestEmail = (TextView)view.findViewById(R.id.text_view_guests_email);
            mHolder.guestHeadshot = (ImageView)view.findViewById(R.id.image_view_guest_head_shot);

            view.setTag(mHolder);
        }else {
            mHolder = (Holder)view.getTag();
        }

        mHolder.guestName.setText(selectedGuest.getName());
        Log.d("Adapter", selectedGuest.getName());
        mHolder.guestEmail.setText(selectedGuest.getEmailAddress());
        Picasso.with(mContext)
                .load(selectedGuest.getProfileImagePath())
                .fit()
                .placeholder(R.drawable.profile_icon)
                .into(mHolder.guestHeadshot);


        return view;
    }




    private class Holder{
        public ImageView guestHeadshot;
        public TextView guestName, guestEmail;
    }

    public void Add(Guest guest)
    {
        mGuest.add(guest);
        notifyDataSetChanged();
    }

    public void Update()
    {
        mGuest.clear();
        notifyDataSetChanged();
    }
}
