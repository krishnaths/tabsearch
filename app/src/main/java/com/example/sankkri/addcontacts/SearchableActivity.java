package com.example.sankkri.addcontacts;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Searchable activity extends listactivity since the output is shown to the list.
public class SearchableActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.search); //TODO:What is this activity maybe coming soon

        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY); //retrieving the query
            //doMySearch(query); //TODO:To be defined later
        }
    }
}
