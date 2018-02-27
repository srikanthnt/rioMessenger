package com.example.sri.riomessenger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sri.riomessenger.Adapter.MessageAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class messageTab extends Fragment {
    public messageTab()
    {}
    RecyclerView recyclerView;
    MessageAdapter adapter;
    List<Message> messageList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=inflater.inflate(R.layout.fragment_message_tab,container,false);
        recyclerView =view.findViewById(R.id.messagelistRecyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        createmessagelist(); // Create the data.

        // Set data into adapter and adapter to recyclerView.
        adapter = new MessageAdapter(messageList,R.layout.list_item);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void createmessagelist() {

        java.util.Date date= new Date();
        

        Message message1 = new Message();
        message1.setName("sri");
        message1.setMessage_txt("Monkeys are ");
        message1.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message2 = new Message();
        message2.setName("suhas");
        message2.setMessage_txt("The African ");
        message2.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message3 = new Message();
        message3.setName("suji");
        message3.setMessage_txt("The donkey ");
        message3.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message4 = new Message();
        message4.setName("taru");
        message4.setMessage_txt("The domestic dog ");
        message4.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message5 = new Message();
        message5.setName("meri");
        message5.setMessage_txt("The domestic goat ");
        message5.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message6 = new Message();
        message6.setName("abhi");
        message6.setMessage_txt("The tiger ");
        message6.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message7 = new Message();
        message7.setName("lilly");
        message7.setMessage_txt("The lion ");
        message7.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message8 = new Message();
        message8.setName("Ted");
        message8.setMessage_txt("The leopard ");
        message8.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message9 = new Message();
        message9.setName("barney");
        message9.setMessage_txt("The cheetah, ");
        message9.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        Message message10 = new Message();
        message10.setName("guy");
        message10.setMessage_txt("Rats are ");
        message10.setTimestamp(new SimpleDateFormat("MM-EEE").format(new Date()));

        messageList.add(message1);
        messageList.add(message2);
        messageList.add(message3);
        messageList.add(message4);
        messageList.add(message5);
        messageList.add(message6);
        messageList.add(message7);
        messageList.add(message8);
        messageList.add(message9);
        messageList.add(message10);
    }
}