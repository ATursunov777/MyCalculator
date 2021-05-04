package kg.kingali.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button btnOne;
    private Button btntwo;
    private Button btnthree;
    private Button btnfour;
    private Button btnfive;
    private Button btnsix;
    private Button btnseven;
    private Button btneight;
    private Button btnnine;
    private Button btnzero;

    TextView textView;
    StringBuilder result = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.scoreboard);

        btnOne = findViewById(R.id.one);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnOne.getText());
                textView.setText(result.toString());
            }
        });
        btntwo = findViewById(R.id.two);
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btntwo.getText());
                textView.setText(result.toString());
            }
        });
        btnthree = findViewById(R.id.three);
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnthree.getText());
                textView.setText(result.toString());
            }
        });
        btnfour = findViewById(R.id.four);
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnfour.getText());
                textView.setText(result.toString());
            }
        });
        btnfive = findViewById(R.id.five);
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnfive.getText());
                textView.setText(result.toString());
            }
        });
        btnsix = findViewById(R.id.six);
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnsix.getText());
                textView.setText(result.toString());
            }
        });
        btnseven = findViewById(R.id.seven);
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnseven.getText());
                textView.setText(result.toString());
            }
        });
        btneight = findViewById(R.id.eight);
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btneight.getText());
                textView.setText(result.toString());
            }
        });
        btnnine = findViewById(R.id.nine);
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnnine.getText());
                textView.setText(result.toString());
            }
        });
        btnzero = findViewById(R.id.zero);
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(btnzero.getText());
                textView.setText(result.toString());
            }
        });
    }




}