package com.example.a18801.calculator;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.renderscript.Script;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            setContentView(R.layout.activity_main);
            EditText edit=(EditText)findViewById(R.id.input);
            edit.setInputType(InputType.TYPE_NULL);
        }
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            setContentView(R.layout.activity_main_land);
            EditText edit1=(EditText)findViewById(R.id.input1);
            edit1.setInputType(InputType.TYPE_NULL);
        }

    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menu1:
                Intent intent=new Intent(MainActivity.this,HelpActivity.class);
                startActivityForResult(intent,1);
                break;
            case R.id.menu2:
                finish();
                break;
            case R.id.menu3:
                Intent intent1=new Intent(MainActivity.this,ChangeActivity.class);
                startActivityForResult(intent1,1);
                break;
            default:
                break;
        }
        return true;
    }
}

