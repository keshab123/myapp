package com.example.ctadmin.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public int quizScore=0;
    public Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                RadioGroup rbGroup1 = (RadioGroup) findViewById(R.id.rg1);
                int selectedId1= rbGroup1.getCheckedRadioButtonId();
                if (selectedId1 != -1)
                {
                    RadioButton selectedRadioButton1 = (RadioButton) findViewById(selectedId1);
                    String radioButtonText1 = selectedRadioButton1.getText().toString();
                    if ((radioButtonText1).equals(getString(R.string.a1)))
                    {
                        quizScore = quizScore + 1;
                    }
                }
                RadioGroup rbGroup2= (RadioGroup) findViewById(R.id.rg2);
                int selectedId2= rbGroup2.getCheckedRadioButtonId();
                if (selectedId2 != -1)
                {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId2);
                    String radioButtonText2 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText2).equals(getString(R.string.a2)))
                    {
                        quizScore = quizScore + 1;
                    }
                }
                RadioGroup rbGroup3 = (RadioGroup) findViewById(R.id.rg3);
                int selectedId3= rbGroup3.getCheckedRadioButtonId();
                if (selectedId3 != -1)
                {
                    RadioButton selectedRadioButton3 = (RadioButton) findViewById(selectedId3);
                    String radioButtonText3 = selectedRadioButton3.getText().toString();
                    if ((radioButtonText3).equals(getString(R.string.a3)))
                    {
                        quizScore = quizScore + 1;
                    }
                }
                Toast.makeText(Main2Activity.this, " your Score is" + quizScore, Toast.LENGTH_SHORT).show();
        }         });

    }

}
