package calcu.exmp.loanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText lamt,interest,years;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lamt=(EditText) findViewById(R.id.lamt);
        interest=(EditText) findViewById(R.id.interest);
        years=(EditText) findViewById(R.id.years);
    }

    public void Calc(View view){

    }
}