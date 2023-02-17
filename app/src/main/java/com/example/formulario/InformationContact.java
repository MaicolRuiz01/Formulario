package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.view.View;

public class InformationContact extends AppCompatActivity {

    private TextView tvName;
    private TextView tvPhone;
    private TextView tvEmail;
    private TextView tvDescription;
    private TextView tvFech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_contact);

        Bundle parametro    =getIntent().getExtras();

        String name = parametro.getString(getResources().getString(R.string.putName));
        String phone = parametro.getString(getResources().getString(R.string.putPhone));
        String email = parametro.getString(getResources().getString(R.string.putEmail));
        String description= parametro.getString(getResources().getString(R.string.putDescription));
        String fech = parametro.getString(getResources().getString(R.string.putFech));

        TextView tvName=(TextView) findViewById(R.id.tvName);
        TextView tvPhone=(TextView) findViewById(R.id.tvPhone);
        TextView tvEmail=(TextView) findViewById(R.id.tvEmail);
        TextView tvDescription=(TextView) findViewById(R.id.tvDescription);
        TextView tvFech=(TextView) findViewById(R.id.tvFech);


        tvName.setText(name);
        tvPhone.setText(phone);
        tvEmail.setText(email);
        tvDescription.setText(description);
        tvFech.setText(fech);
    }

    public void edit(View view){
        finish();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(InformationContact.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}