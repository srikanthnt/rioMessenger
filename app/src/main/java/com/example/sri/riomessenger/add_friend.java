package com.example.sri.riomessenger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class add_friend extends AppCompatActivity {
    public add_friend()
    {}
    RecyclerView recyclerView;
    friendAdapter adapter;
    List<Friend> FriendList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);
        recyclerView =findViewById(R.id.friendListRecyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        createFriendList(); // Create the data.

        // Set data into adapter and adapter to recyclerView.
        adapter = new friendAdapter(FriendList,R.layout.list_item);
        recyclerView.setAdapter(adapter);
    }

    private void createFriendList() {

        // Create data...
        java.util.Date date= new Date();
        String sdf= new SimpleDateFormat("MM-EEE").format(new Date());

        Friend Friend1 = new Friend();
        Friend1.setName("sri");

        Friend Friend2 = new Friend();
        Friend2.setName("suhas");

        Friend Friend3 = new Friend();
        Friend3.setName("suji");

        Friend Friend4 = new Friend();
        Friend4.setName("taru");

        Friend Friend5 = new Friend();
        Friend5.setName("meri");

        Friend Friend6 = new Friend();
        Friend6.setName("abhi");

        Friend Friend7 = new Friend();
        Friend7.setName("lilly");

        Friend Friend8 = new Friend();
        Friend8.setName("Ted");

        Friend Friend9 = new Friend();
        Friend9.setName("barney");


        Friend Friend10 = new Friend();
        Friend10.setName("guy");

        FriendList.add(Friend1);
        FriendList.add(Friend2);
        FriendList.add(Friend3);
        FriendList.add(Friend4);
        FriendList.add(Friend5);
        FriendList.add(Friend6);
        FriendList.add(Friend7);
        FriendList.add(Friend8);
        FriendList.add(Friend9);
        FriendList.add(Friend10);
    }
}