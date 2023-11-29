package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;
    private static String TAG="MainActivity";

    EditText txtName, txtId, txtYear, txtND;
    Button btnSave;

    CheckBox dabong, choigame;
    RadioButton nam, nu;


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choigame = findViewById(R.id.choigame);
        dabong = findViewById(R.id.dabong);
        nam = findViewById(R.id.nam);
        nu = findViewById(R.id.nu);
        txtName = findViewById(R.id.txtName);
        txtId = findViewById(R.id.txtId);
        txtYear = findViewById(R.id.txtYear);
        txtND = findViewById(R.id.txtND);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txtName.getText().toString();
                String id = txtId.getText().toString();
                String year = txtYear.getText().toString();

                boolean choigameChecked = choigame.isChecked();
                boolean dabongChecked = dabong.isChecked();

                String dabongText = dabongChecked ? "da bong" : "";
                String choigameText = choigameChecked ? "choi game" : "";
                String gender = (nam.isChecked()) ? "nam" : "nu";

                String result = "ten: " + name + "\n"
                        + "mssv: " + id + "\n"
                        + "tuoi: " + year + "\n" + "gioi tinh: " + gender
                        + "\nso thich: "
                        + choigameText + "\n"
                        + dabongText + "\n";


                txtND.setText(result);

            }
        });

    }
}