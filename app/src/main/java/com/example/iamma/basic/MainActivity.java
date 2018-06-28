package com.example.iamma.basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton= (Button)findViewById(R.id.rollbutton);
        final ImageView leftDice =(ImageView) findViewById(R.id.dice_left);
        final ImageView rightDice =(ImageView) findViewById(R.id.dice_right);
        final int[] dicearray={R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("basic","the button is pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("basic","the number is" +number);
                leftDice.setImageResource(dicearray[number]);
                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(dicearray[number]);
            }
        });
    }
}
