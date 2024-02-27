package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bgButton;
    public ConstraintLayout consLayout;
    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = findViewById(R.id.button_fon);
        consLayout = findViewById(R.id.constrainLayout);
        context = MainActivity.this;
        bgButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final CharSequence[] items = {getText(R.string.red),
                getText(R.string.yellow), getText(R.string.green), getText(R.string.white)
        };
        builder.setTitle(R.string.message);


        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0:

                        consLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;
                    case 1:

                        consLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;
                    case 2:


                        consLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();

                        break;
                    case 3:


                        consLayout.setBackgroundResource(R.color.white);
                        Toast.makeText(context, R.string.white, Toast.LENGTH_LONG).show();

                        break;
                }
            }



        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }



}