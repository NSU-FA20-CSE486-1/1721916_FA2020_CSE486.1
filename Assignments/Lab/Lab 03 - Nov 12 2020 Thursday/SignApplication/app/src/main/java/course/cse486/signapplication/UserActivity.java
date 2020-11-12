package course.cse486.signapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void deAuthenticate(View view) {
        Intent ticket = new Intent(UserActivity.this, MainActivity.class);
        startActivity(ticket);
    }
}