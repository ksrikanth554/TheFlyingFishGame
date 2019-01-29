package com.sritech.www.theflyingfishgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    private Button StartGameAgain;
    private TextView DisplayScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        StartGameAgain=findViewById(R.id.play_again_btn);
        DisplayScore=findViewById(R.id.displayscore);
        String score=getIntent().getExtras().get("score").toString();

        StartGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent=new Intent(GameOver.this,MainActivity.class);
                startActivity(mainIntent);

            }
        });

        DisplayScore.setText("Your Score is : "+score);
    }
}
