package course.cse486.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CalculatorActivity";

    private EditText mInput1;
    private EditText mInput2;
    private TextView mOutput;

    private Button mAdd;
    private Button mSub;
    private Button mDiv;
    private Button mMul;
    private Button mPow;

    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInput1 = findViewById(R.id.et_input1);
        mInput2 = findViewById(R.id.et_input2);
        mOutput = findViewById(R.id.tv_output);

        mAdd = findViewById(R.id.btn_add);
        mSub = findViewById(R.id.btn_sub);
        mDiv = findViewById(R.id.btn_div);
        mMul = findViewById(R.id.btn_mul);
        mPow = findViewById(R.id.btn_pow);

        calculator = new Calculator();

        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = mInput1.getText().toString();
                String number2 = mInput2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty() ) {
                    number1 = "0";
                    number2 = "0";
                }

                double input1 = Double.parseDouble(number1);
                double input2 = Double.parseDouble(number2);

                double result = calculator.addition(input1, input2);

                mOutput.setText(String.valueOf(result));
            }
        });

        mSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = mInput1.getText().toString();
                String number2 = mInput2.getText().toString();


                if(number1.isEmpty() || number2.isEmpty() ) {
                    number1 = "0";
                    number2 = "0";
                }

                double input1 = Double.parseDouble(number1);
                double input2 = Double.parseDouble(number2);

                double result = calculator.subtraction(input1, input2);

                mOutput.setText(String.valueOf(result));
            }
        });

        mDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = mInput1.getText().toString();
                String number2 = mInput2.getText().toString();


                if(number1.isEmpty() || number2.isEmpty() ) {
                    number1 = "0";
                    number2 = "0";
                }

                double input1 = Double.parseDouble(number1);
                double input2 = Double.parseDouble(number2);


                double result = 0;
                try {
                    result = calculator.division(input1, input2);

                } catch (ArithmeticException ex) {
                    mOutput.setText(ex.toString());
                }

                mOutput.setText(String.valueOf(result));
            }
        });

        mMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = mInput1.getText().toString();
                String number2 = mInput2.getText().toString();


                if(number1.isEmpty() || number2.isEmpty() ) {
                    number1 = "0";
                    number2 = "0";
                }

                double input1 = Double.parseDouble(number1);
                double input2 = Double.parseDouble(number2);

                double result = calculator.multiplication(input1, input2);

                mOutput.setText(String.valueOf(result));

            }
        });

        mPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = mInput1.getText().toString();
                String number2 = mInput2.getText().toString();


                if(number1.isEmpty() || number2.isEmpty() ) {
                    number1 = "0";
                    number2 = "0";
                }

                double input1 = Double.parseDouble(number1);
                double input2 = Double.parseDouble(number2);

                double result = calculator.power(input1, input2);

                mOutput.setText(String.valueOf(result));

            }
        });


    }

}