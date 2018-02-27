package com.example.sri.riomessenger;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class friendAdapter extends RecyclerView.Adapter<friendAdapter.FriendViewHolder> {

    private List<Friend> friends;
    private int rowLayout;

    public friendAdapter(List<Friend> friends, int rowLayout) {
        this.friends = friends;
        this.rowLayout = rowLayout;
    }

    @Override
    public FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendViewHolder holder, final int position) {
        holder.name.setText(friends.get(position).getName());
        holder.icon_profile.setImageResource(R.drawable.ic_account_circle_black_40dp);


    }

    @Override
    public int getItemCount() {
        return friends.size();
    }

    public static class FriendViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView icon_profile;
        Button btn;

        public FriendViewHolder(View v) {
            super(v);
            name =  v.findViewById(R.id.name);
            icon_profile=v.findViewById(R.id.icon_profile);
            btn=v.findViewById(R.id.confirm_btn);

        }


    }
}
