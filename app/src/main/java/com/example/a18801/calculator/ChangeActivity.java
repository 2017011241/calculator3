package com.example.a18801.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ChangeActivity extends AppCompatActivity {

    private List<CharSequence> originalList=null;
    private ArrayAdapter<CharSequence>originaladapter=null;
    private Spinner originalspinner=null;
    private List<CharSequence> changeList=null;
    private ArrayAdapter<CharSequence> changeadapter=null;
    private Spinner changespinner=null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        EditText edit=(EditText)findViewById(R.id.editText1);
        edit.setInputType(InputType.TYPE_NULL);
        originalspinner=(Spinner)findViewById(R.id.spinner);
        originalspinner.setPrompt("请选择单位");
        originalList=new ArrayList<CharSequence>();
        originalList.add("人民币");
        originalList.add("美元");
        originalList.add("欧元");
        originalList.add("日元");
        originaladapter=new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,originalList);
        originaladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        originalspinner.setAdapter(originaladapter);
        changespinner=(Spinner)findViewById(R.id.spinner2);
        changespinner.setPrompt("请选择单位");
        changeList=new ArrayList<CharSequence>();
        changeList.add("人民币");
        changeList.add("美元");
        changeList.add("欧元");
        changeList.add("日元");
        changeadapter=new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,changeList);
        changeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        changespinner.setAdapter(changeadapter);
    }
}
