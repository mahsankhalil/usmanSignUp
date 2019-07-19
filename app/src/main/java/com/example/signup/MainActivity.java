package com.example.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button submit;
    EditText name;
    EditText fatherName;
    ListView degreeListView;

    String firstName;
    String lastName;
    String degree;

    DegreeListViewAdapter degreeListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        submit = findViewById(R.id.sign_up_submit);
        submit.setOnClickListener(this);

        name = findViewById(R.id.sign_up_name);
        fatherName = findViewById(R.id.sign_up_father_name);
        degreeListView = findViewById(R.id.sign_up_degree_list);

        ArrayList<userDTO> arrayList = new ArrayList<>();

        arrayList.add(new userDTO("Ahsan",R.drawable.vision));
        arrayList.add(new userDTO("Talha",R.drawable.vision));
        arrayList.add(new userDTO("Usman",R.drawable.vision));
        arrayList.add(new userDTO("Ahsan",R.drawable.vision));
        arrayList.add(new userDTO("Talha",R.drawable.vision));
        arrayList.add(new userDTO("Usman",R.drawable.vision));
        arrayList.add(new userDTO("Ahsan",R.drawable.vision));
        arrayList.add(new userDTO("Talha",R.drawable.vision));
        arrayList.add(new userDTO("Usman",R.drawable.vision));


        degreeListViewAdapter = new DegreeListViewAdapter(getApplicationContext(),arrayList);
        degreeListView.setAdapter(degreeListViewAdapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_up_submit :{
                    firstName =  name.getText().toString();
                    lastName = fatherName.getText().toString();
                Toast.makeText(getApplicationContext(),firstName+lastName,Toast.LENGTH_LONG).show();
            }
        }
    }
}
