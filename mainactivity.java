package com.example.lostrng;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private GameLogic gameLogic;
    private AnimeCharacter playerCharacter;
    private AnimeCharacter enemyCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameLogic = new GameLogic();

        // UI Elements
        Button spinButton = findViewById(R.id.spinButton);
        Button battleButton = findViewById(R.id.battleButton);
        TextView characterText = findViewById(R.id.characterText);
        TextView battleResult = findViewById(R.id.battleResult);

        // Spin Button Logic
        spinButton.setOnClickListener(v -> {
            playerCharacter = gameLogic.spinForCharacter();
            characterText.setText("You got: " + playerCharacter.getName() + " from " + playerCharacter.getAnime());
        });

        // Battle Button Logic
        battleButton.setOnClickListener(v -> {
            if (playerCharacter != null) {
                enemyCharacter = gameLogic.spinForCharacter(); // Spin for enemy character
                String result = gameLogic.battle(playerCharacter, enemyCharacter);
                battleResult.setText(result);
            } else {
                battleResult.setText("Please spin for a character first!");
            }
        });
    }
}