package course.cse486.signapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mUsername;
    EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = findViewById(R.id.et_username);
        mPassword = findViewById(R.id.et_password);
    }

    public void authenticate(View view) {
        String username = mUsername.getText().toString().trim();
        String password = mPassword.getText().toString().trim();

        if(username.equals("emran") && password.equals("1234")) {
            Toast.makeText(this, "Login Successfully!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
        }
    }
}