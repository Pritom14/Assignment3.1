package com.example.shaloin.thirdassignmenta;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editTextID);
    }

    public void clickme(View v){
        Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
        String str=editText.getText().toString();
        intent.putExtra(SearchManager.QUERY,str);
        startActivity(intent);
    }
}
