package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextDate;
    Button btnNext;
    User user =new User();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextDate= findViewById(R.id.editTextDate);

        btnNext =(Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etName = (EditText) findViewById(R.id.etName);
                EditText etPhone = (EditText) findViewById(R.id.etPhone);
                EditText etEmail = (EditText) findViewById(R.id.etEmail);
                EditText etDescription = (EditText) findViewById(R.id.etDescription);
                EditText etFech = (EditText) findViewById(R.id.editTextDate);

                user.setName(etName.getText().toString());
                user.setPhone(etPhone.getText().toString());
                user.setEmail(etEmail.getText().toString());
                user.setDescription(etDescription.getText().toString());
                user.setFech(etFech.getText().toString());

                Intent intent=new Intent(MainActivity.this, InformationContact.class);
                intent.putExtra(getResources().getString(R.string.putName), user.getName());;
                intent.putExtra(getResources().getString(R.string.putPhone), user.getPhone());;
                intent.putExtra(getResources().getString(R.string.putEmail), user.getEmail());;
                intent.putExtra(getResources().getString(R.string.putDescription), user.getDescription());;
                intent.putExtra(getResources().getString(R.string.putFech), user.getFech());;
                startActivity(intent);

            }
        });


    }

    public void mostrarCalendario(View v){
        DatePickerDialog d=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int mounth, int day) {
                editTextDate.setText(year+"/"+(mounth+1)+"/"+day);
            }
        },2023, 3, 1);
        d.show();
    }

}