package com.example.jean.td_ihm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextName;
    private Button buttonSave;
    public final static String KEY_USERNAME = "USERNAME";

    private void initViews(){
        editTextName = findViewById(R.id.activity_form_editText_name);

        buttonSave = findViewById(R.id.activity_form_button_save);
        buttonSave.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        initViews();
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.activity_form_button_save:
                save();
                break;
        }
    }


    private void save(){
        String name = editTextName.getText().toString();
        DataManager.getInstance().addName(name);
        finish();
    }
}
