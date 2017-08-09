package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    SimpleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.activity_example_1_recyclerView);
        adapter=new SimpleAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
        adapter.setmStringList(getDeserts());
    }

    private List<String> getDeserts(){
        ArrayList<String> deserts=new ArrayList<>();
        deserts.add("gulabjamun");
        deserts.add("food");
        deserts.add("ice cream");
        deserts.add("gingerbread");
        return deserts;
    }
}
