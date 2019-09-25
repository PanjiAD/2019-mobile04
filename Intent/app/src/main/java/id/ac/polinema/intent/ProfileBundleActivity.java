package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView outputUsername;
    private TextView outputName;
    private TextView outputAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        outputUsername = findViewById(R.id.text_username);
        outputName = findViewById(R.id.text_name);
        outputAge = findViewById(R.id.text_age);
        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            outputUsername.setText(extras.getString(BundleActivity.USERNAME_KEY));
            outputName.setText(extras.getString(BundleActivity.NAME_KEY));
            outputAge.setText(String.valueOf(extras.getInt(BundleActivity.AGE_KEY)));
        }
    }
}
