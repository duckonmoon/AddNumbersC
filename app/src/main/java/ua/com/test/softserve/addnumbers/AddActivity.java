package ua.com.test.softserve.addnumbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    static {
        System.loadLibrary("add");
    }

    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private Button equalsButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        initView();
        setListeners();
    }

    private void setListeners() {
        equalsButton.setOnClickListener((v) -> {
            int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
            int result = addNumbers(firstNumber, secondNumber);
            resultTextView.setText(getString(R.string.result_is, result));
        });
    }

    private void initView() {
        firstNumberEditText = findViewById(R.id.first_number_edit_text);
        secondNumberEditText = findViewById(R.id.second_number_edit_text);
        equalsButton = findViewById(R.id.equals_button);
        resultTextView = findViewById(R.id.result_text_view);
    }

    public native int addNumbers(int i, int m);

}
