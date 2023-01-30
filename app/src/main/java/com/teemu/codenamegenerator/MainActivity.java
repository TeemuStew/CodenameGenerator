package com.teemu.codenamegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etLast;
    Button btnInput;
    TextView tvCode, tvCode2;
    String nimi, nimi2;
    int random, random2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        centerTitle();

        etFirst = findViewById(R.id.etFirst);
        etLast = findViewById(R.id.etLast);
        tvCode = findViewById(R.id.tvCode);
        tvCode2 = findViewById(R.id.tvCode2);
        btnInput = findViewById(R.id.btnInput);


        btnInput.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] arrays;

                nimi = etFirst.getText().toString();
                String first = nimi.substring(0, 1);
                nimi2 = etLast.getText().toString();
                String last = nimi2.substring(0, 1);

                //First name
                if(first.contains("A")) {
                    arrays = getResources().getStringArray(R.array.ArraysA);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("B")) {
                    arrays = getResources().getStringArray(R.array.ArraysB);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("C")) {
                    arrays = getResources().getStringArray(R.array.ArraysC);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("D")) {
                    arrays = getResources().getStringArray(R.array.ArraysD);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("E")) {
                    arrays = getResources().getStringArray(R.array.ArraysE);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("F")) {
                    arrays = getResources().getStringArray(R.array.ArraysF);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("G")) {
                    arrays = getResources().getStringArray(R.array.ArraysG);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("H")) {
                    arrays = getResources().getStringArray(R.array.ArraysH);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("I")) {
                    arrays = getResources().getStringArray(R.array.ArraysI);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("J")) {
                    arrays = getResources().getStringArray(R.array.ArraysJ);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("K")) {
                    arrays = getResources().getStringArray(R.array.ArraysK);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("L")) {
                    arrays = getResources().getStringArray(R.array.ArraysL);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("M")) {
                    arrays = getResources().getStringArray(R.array.ArraysM);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("N")) {
                    arrays = getResources().getStringArray(R.array.ArraysN);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("O")) {
                    arrays = getResources().getStringArray(R.array.ArraysO);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("P")) {
                    arrays = getResources().getStringArray(R.array.ArraysP);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("Q")) {
                    arrays = getResources().getStringArray(R.array.ArraysQ);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("R")) {
                    arrays = getResources().getStringArray(R.array.ArraysR);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("S")) {
                    arrays = getResources().getStringArray(R.array.ArraysS);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("T")) {
                    arrays = getResources().getStringArray(R.array.ArraysT);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("U")) {
                    arrays = getResources().getStringArray(R.array.ArraysU);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("V")) {
                    arrays = getResources().getStringArray(R.array.ArraysV);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("W")) {
                    arrays = getResources().getStringArray(R.array.ArraysW);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("Y")) {
                    arrays = getResources().getStringArray(R.array.ArraysY);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("X")) {
                    arrays = getResources().getStringArray(R.array.ArraysX);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                } else if(first.contains("Z")) {
                    arrays = getResources().getStringArray(R.array.ArraysZ);
                    random = new Random().nextInt(arrays.length);
                    String randomName = arrays[random];
                    tvCode.setText(randomName);
                }

                //Last name
                if(last.contains("A")) {
                    arrays = getResources().getStringArray(R.array.WordsA);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("B")) {
                    arrays = getResources().getStringArray(R.array.WordsB);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("C")) {
                    arrays = getResources().getStringArray(R.array.WordsC);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("D")) {
                    arrays = getResources().getStringArray(R.array.WordsD);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("E")) {
                    arrays = getResources().getStringArray(R.array.WordsE);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("F")) {
                    arrays = getResources().getStringArray(R.array.WordsF);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("G")) {
                    arrays = getResources().getStringArray(R.array.WordsG);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("H")) {
                    arrays = getResources().getStringArray(R.array.WordsH);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("I")) {
                    arrays = getResources().getStringArray(R.array.WordsI);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("J")) {
                    arrays = getResources().getStringArray(R.array.WordsJ);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("K")) {
                    arrays = getResources().getStringArray(R.array.WordsK);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("L")) {
                    arrays = getResources().getStringArray(R.array.WordsL);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("M")) {
                    arrays = getResources().getStringArray(R.array.WordsM);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("N")) {
                    arrays = getResources().getStringArray(R.array.WordsN);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("O")) {
                    arrays = getResources().getStringArray(R.array.WordsO);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("P")) {
                    arrays = getResources().getStringArray(R.array.WordsP);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("Q")) {
                    arrays = getResources().getStringArray(R.array.WordsQ);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("R")) {
                    arrays = getResources().getStringArray(R.array.WordsR);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("S")) {
                    arrays = getResources().getStringArray(R.array.WordsS);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("T")) {
                    arrays = getResources().getStringArray(R.array.WordsT);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("U")) {
                    arrays = getResources().getStringArray(R.array.WordsU);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("V")) {
                    arrays = getResources().getStringArray(R.array.WordsV);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("W")) {
                    arrays = getResources().getStringArray(R.array.WordsW);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("Y")) {
                    arrays = getResources().getStringArray(R.array.WordsY);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("X")) {
                    arrays = getResources().getStringArray(R.array.WordsX);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                } else if(last.contains("Z")) {
                    arrays = getResources().getStringArray(R.array.WordsZ);
                    random2 = new Random().nextInt(arrays.length);
                    String randomName2 = arrays[random2];
                    tvCode2.setText(randomName2);
                }
            }
        });
    }
    private void centerTitle() {
        ArrayList<View> textViews = new ArrayList<>();

        getWindow().getDecorView().findViewsWithText(textViews, getTitle(), View.FIND_VIEWS_WITH_TEXT);

        if(textViews.size() > 0) {
            AppCompatTextView appCompatTextView = null;
            if(textViews.size() == 1) {
                appCompatTextView = (AppCompatTextView) textViews.get(0);
            } else {
                for(View v : textViews) {
                    if(v.getParent() instanceof Toolbar) {
                        appCompatTextView = (AppCompatTextView) v;
                        break;
                    }
                }
            }

            if(appCompatTextView != null) {
                ViewGroup.LayoutParams params = appCompatTextView.getLayoutParams();
                params.width = ViewGroup.LayoutParams.MATCH_PARENT;
                appCompatTextView.setLayoutParams(params);
                appCompatTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            }
        }
    }
}
