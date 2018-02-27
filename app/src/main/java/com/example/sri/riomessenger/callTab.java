package com.example.sri.riomessenger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class callTab extends Fragment {
    RecyclerView recyclerView;
    CallAdapter adapter;
    List<Call> callList = new ArrayList<>();
    public callTab()
    {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=inflater.inflate(R.layout.fragment_call_tab,container,false);
        recyclerView =view.findViewById(R.id.calListRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        createcallList(); // Create the data.

        // Set data into adapter and adapter to recyclerView.
        adapter = new CallAdapter(callList, R.layout.list_item);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void createcallList() {

        // Create data...
        java.util.Date date= new Date();
        String sdf= new SimpleDateFormat("MM-EEE").format(new Date());

        Call call1 = new Call();
        call1.setName("sri");
        call1.setMessage_txt("Incoming ");
        call1.setTimestamp(sdf);

        Call call2 = new Call();
        call2.setName("suhas");
        call2.setMessage_txt("Outgoing ");
        call2.setTimestamp(sdf);

        Call call3 = new Call();
        call3.setName("suji");
        call3.setMessage_txt("Incoming");
        call3.setTimestamp(sdf);

        Call call4 = new Call();
        call4.setName("taru");
        call4.setMessage_txt("Incoming ");
        call4.setTimestamp(sdf);

        Call call5 = new Call();
        call5.setName("meri");
        call5.setMessage_txt("Incoming ");
        call5.setTimestamp(sdf);

        Call call6 = new Call();
        call6.setName("abhi");
        call6.setMessage_txt("Outgoing");
        call6.setTimestamp(sdf);

        Call call7 = new Call();
        call7.setName("lilly");
        call7.setMessage_txt("Outgoing ");
        call7.setTimestamp(sdf);

        Call call8 = new Call();
        call8.setName("Ted");
        call8.setMessage_txt("Outgoing ");
        call8.setTimestamp(sdf);

        Call call9 = new Call();
        call9.setName("barney");
        call9.setMessage_txt("Outgoing ");
        call9.setTimestamp(sdf);

        Call call10 = new Call();
        call10.setName("guy");
        call10.setMessage_txt("Outgoing ");
        call10.setTimestamp(sdf);

        callList.add(call1);
        callList.add(call2);
        callList.add(call3);
        callList.add(call4);
        callList.add(call5);
        callList.add(call6);
        callList.add(call7);
        callList.add(call8);
        callList.add(call9);
        callList.add(call10);
    }
}
