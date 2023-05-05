package com.example.englishbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.englishbook.model.GetData;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
private TextView text1;
private RadioButton check1;
    private RadioButton check2;
    private TextView text2;
    private RadioButton check3;
    private RadioButton check4;
    private TextView text3;
    private RadioButton check5;
    private RadioButton check6;
    private TextView text4;
    private RadioButton check7;
    private RadioButton check8;
    private TextView text5;
    private RadioButton check9;
    private RadioButton check10;
    private TextView text6;
    private RadioButton check11;
    private RadioButton check12;
    private Button score;
    private int counter;
    private EditText finall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        text1=findViewById(R.id.first);
        check1=findViewById(R.id.checkBox);
        check2=findViewById(R.id.checkBox2);
        text2=findViewById(R.id.second);
        check3=findViewById(R.id.check2);
        check4=findViewById(R.id.check3);
        text3=findViewById(R.id.Third);
        score=findViewById(R.id.getscore);
        check5=findViewById(R.id.check4);
        check6=findViewById(R.id.check5);
        text4=findViewById(R.id.fourth);
        check7=findViewById(R.id.check6);
        check8=findViewById(R.id.check7);
        finall=findViewById(R.id.finall);
        text5=findViewById(R.id.five);
        check9=findViewById(R.id.check8);
        check10=findViewById(R.id.check9);
        text6=findViewById(R.id.sixth);
        check11=findViewById(R.id.check10);
        check12=findViewById(R.id.check11);
        text1.setVisibility(View.GONE);
        check1.setVisibility(View.GONE);
        check2.setVisibility(View.GONE);
        text2.setVisibility(View.GONE);
        check3.setVisibility(View.GONE);
        check4.setVisibility(View.GONE);
        text3.setVisibility(View.GONE);
        check5.setVisibility(View.GONE);
        check6.setVisibility(View.GONE);
        text4.setVisibility(View.GONE);
        check7.setVisibility(View.GONE);
        check8.setVisibility(View.GONE);
        text5.setVisibility(View.GONE);
        check9.setVisibility(View.GONE);
        check10.setVisibility(View.GONE);
        text6.setVisibility(View.GONE);
        check11.setVisibility(View.GONE);
        check12.setVisibility(View.GONE);
        score.setVisibility(View.GONE);
        Spinner();

    }
    private void Spinner(){
        GetData data=new GetData();
        String [] type=data.types();
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,type);
        spinner.setAdapter(adapter);
    }


    public void btnonclick(View view) {
        String text = spinner.getSelectedItem().toString();
        finall.setText("");
        if(text.compareToIgnoreCase("past simple")==0){
            text1.setVisibility(View.VISIBLE);
            check1.setVisibility(View.VISIBLE);
            check2.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            check3.setVisibility(View.VISIBLE);
            check4.setVisibility(View.VISIBLE);
            text3.setVisibility(View.VISIBLE);
            check5.setVisibility(View.VISIBLE);
            check6.setVisibility(View.VISIBLE);

            text4.setVisibility(View.GONE);
            check7.setVisibility(View.GONE);
            check8.setVisibility(View.GONE);
            text5.setVisibility(View.GONE);
            check9.setVisibility(View.GONE);
            check10.setVisibility(View.GONE);
            text6.setVisibility(View.GONE);
            check11.setVisibility(View.GONE);
            check12.setVisibility(View.GONE);

        }else{
            text4.setVisibility(View.VISIBLE);
            check7.setVisibility(View.VISIBLE);
            check8.setVisibility(View.VISIBLE);
            text5.setVisibility(View.VISIBLE);
            check9.setVisibility(View.VISIBLE);
            check10.setVisibility(View.VISIBLE);
            text6.setVisibility(View.VISIBLE);
            check11.setVisibility(View.VISIBLE);
            check12.setVisibility(View.VISIBLE);
            text1.setVisibility(View.GONE);
            check1.setVisibility(View.GONE);
            check2.setVisibility(View.GONE);
            text2.setVisibility(View.GONE);
            check3.setVisibility(View.GONE);
            check4.setVisibility(View.GONE);
            text3.setVisibility(View.GONE);
            check5.setVisibility(View.GONE);
            check6.setVisibility(View.GONE);
        }

        score.setVisibility(View.VISIBLE);


    }

    public void btnonclickk(View view) {
        String text = spinner.getSelectedItem().toString();
        String answer="";
        if(text.compareToIgnoreCase("Past Simple")==0){
            if(check1.isChecked()){
                answer=answer+check1.getText()+",";
            } if(check2.isChecked()){
                answer=answer+check2.getText()+",";
            }
            if(check3.isChecked()){
                answer=answer+check3.getText()+",";
            }
            if(check4.isChecked()){
                answer=answer+check4.getText()+",";
            }
            if(check5.isChecked()){
                answer=answer+check5.getText()+",";
            }
            else{
                answer=answer+check6.getText()+",";
            }

      } if(text.compareToIgnoreCase("Present Simple")==0) {
            if (check7.isChecked()) {
                answer = answer + check7.getText() + ",";
            }
            if (check8.isChecked()) {
                answer = answer + check8.getText() + ",";
            }
            if (check9.isChecked()) {
                answer = answer + check9.getText() + ",";
            }
            if (check10.isChecked()) {
                answer = answer + check10.getText() + ",";
            }
            if (check11.isChecked()) {
                answer = answer + check11.getText() + ",";
            } else {
                answer = answer + check12.getText() + ",";
            }
        }

          GetData score=new GetData ();

          finall.setText( score.score(answer,text));


    }


    }
