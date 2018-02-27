package com.example.sri.riomessenger;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.AnimalViewHolder> {

    private List<Call> calls;
    private int rowLayout;

    public CallAdapter(List<Call> calls, int rowLayout) {
        this.calls = calls;
        this.rowLayout = rowLayout;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, final int position) {
        holder.name.setText(calls.get(position).getName());
        holder.details.setText(calls.get(position).getCall_type());
        holder.timestamp.setText(calls.get(position).getTimestamp());
        holder.icon_profile.setImageResource(R.drawable.ic_account_circle_black_40dp);

    }

    @Override
    public int getItemCount() {
        return calls.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView details;
        TextView timestamp;
        ImageView icon_profile;

        public AnimalViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.name);
            details = (TextView) v.findViewById(R.id.details);
            timestamp=v.findViewById(R.id.timestamp);
            icon_profile=v.findViewById(R.id.icon_profile);

        }
    }
}
