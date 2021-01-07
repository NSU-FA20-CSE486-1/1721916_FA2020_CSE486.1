package course.cse486.quiz2.BanglaDictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    EditText englishEditText;
    EditText banglaEditText;

    Button saveButton;
    Button dictionaryButton;

    ArrayList<Word> wordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        englishEditText = findViewById(R.id.tvEnglish);
        banglaEditText = findViewById(R.id.tvBangla);

        Paper.init(this);
        wordList = Paper.book().read("words", new ArrayList<>());

        saveButton = findViewById(R.id.buttonSave);
        dictionaryButton = findViewById(R.id.buttonVocabulary);

        saveButton.setOnClickListener(v -> {
            String bangla = banglaEditText.getText().toString().trim();
            String english = englishEditText.getText().toString().trim();

            wordList.add(new Word(english, bangla));
            Paper.book().write("words", wordList);

            Toast.makeText(this, "saved!", Toast.LENGTH_LONG).show();
        });

        dictionaryButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VocabularyActivity.class);
            startActivity(intent);
        });

    }
}