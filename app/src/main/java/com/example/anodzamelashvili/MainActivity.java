package com.example.anodzamelashvili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void signUp(View view) {
        EditText FirstName = (EditText) findViewById(R.id.editTextTextFirstName);
        EditText LastName = (EditText) findViewById(R.id.editTextTextLastName);
        EditText age = (EditText) findViewById(R.id.editTextAge);
        int Age = Integer.parseInt(age.getText().toString());
        if (FirstName.getText().toString().isEmpty()) {
            Toast.makeText(this, "you missed your firstname", Toast.LENGTH_SHORT).show();
        } else if (LastName.getText().toString().isEmpty()) {
            Toast.makeText(this, "you missed your Lastname", Toast.LENGTH_SHORT).show();
        } else if (age.getText().toString().isEmpty()) {
            Toast.makeText(this, "you missed your Age", Toast.LENGTH_SHORT).show();
        } else if (Age <=1) {
            Toast.makeText(this, "please,input your real age", Toast.LENGTH_SHORT).show();
        } else if (Age < 18) {
            Toast.makeText(this, "you are under Age", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "You sign up succesfully", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class User {

        private String firstName = null;
        private String lastName = null;
        private int birthYear = 0;


        public User(String first,
                        String last,
                        int year) {

            firstName = first;
            lastName = last;
            birthYear = year;

        }
    }
}