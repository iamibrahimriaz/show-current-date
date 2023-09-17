package com.example.currentdate;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView currentDateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView currentDateTimeText = findViewById(R.id.currentDateTimeText);
        currentDateText = findViewById(R.id.currentDateText);

        final Button showDateTimeButton = findViewById(R.id.showDateTimeButton);
        showDateTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentDateAndTime = getCurrentDateAndTime();
                currentDateTimeText.setText("Current Date & Time:");
                currentDateText.setText(currentDateAndTime);
            }
        });

        final Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentDateTimeText.setText("Current Date & Time");
                currentDateText.setText("");
            }
        });
    }

    private String getCurrentDateAndTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd--MM-yyyy HH:mm:ss", Locale.getDefault());
        return sdf.format(new Date());
    }
}
