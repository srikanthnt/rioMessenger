package com.example.sri.riomessenger.Adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sri.riomessenger.Message;
import com.example.sri.riomessenger.R;

import java.util.List;


public class MessageAdapter extends Adapter<MessageAdapter.MessageViewHolder> {

    private List<Message> messages;
    private int rowLayout;

    public MessageAdapter(List<Message> messages, int rowLayout) {
        this.messages = messages;
        this.rowLayout = rowLayout;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, final int position) {
        holder.name.setText(messages.get(position).getName());
        holder.details.setText(messages.get(position).getMessage_txt());
        holder.timestamp.setText(messages.get(position).getTimestamp());
        holder.icon_profile.setImageResource(R.drawable.ic_account_circle_black_40dp);

    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView details;
        TextView timestamp;
        ImageView icon_profile;

        public MessageViewHolder(View v) {
            super(v);
            name =  v.findViewById(R.id.name);
            details =  v.findViewById(R.id.details);
            timestamp=v.findViewById(R.id.timestamp);
            icon_profile=v.findViewById(R.id.icon_profile);

        }
    }
}
