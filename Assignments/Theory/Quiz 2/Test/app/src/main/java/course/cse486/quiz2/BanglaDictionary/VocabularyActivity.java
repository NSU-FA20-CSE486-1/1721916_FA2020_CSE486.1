package course.cse486.quiz2.BanglaDictionary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import io.paperdb.Paper;

public class VocabularyActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Word> wordList;
    WordAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        recyclerView = findViewById(R.id.rvList);

        Paper.init(this);
        wordList = Paper.book().read("words", new ArrayList<>());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setNestedScrollingEnabled(true);

        adapter = new WordAdapter(this);

        recyclerView.addOnItemTouchListener(new RecyclerViewClickLister(VocabularyActivity.this, recyclerView, (view, position) -> {
            Word word = adapter.getVocabulary(position);

            showDialog(word);
        }));

        recyclerView.setAdapter(adapter);
        adapter.setWordList(wordList);

    }

    private void showDialog(Word word) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.CustomDialog);

        builder.setTitle(word.getEnglishWord());
        builder.setMessage(word.getBanglaWord());
        builder.setCancelable(true);

        builder.show();
    }
}