package illia.popov.n01421791.mid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switchButton = findViewById(R.id.switch1);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    showSnackbar(getString(R.string.switch_on_status));
                } else {
                    showSnackbar(getString(R.string.switch_off_status));
                }
            }
        });
        ImageButton imageButton = findViewById(R.id.ill_image);
        imageButton.setOnClickListener(new View.OnClickListener() {
            int counter = 0;
            final String[] imageNames = {"@drawable/ic_view", "@drawable/ic_sun", "@drawable/ic_humber", "@drawable/ic_macedonian"};

            @Override
            public void onClick(View v) {
                counter+=1;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                displayToast("Counter: " + Integer.toString(counter));
            }
        });
    }
    private void showSnackbar(String message) {
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }

    private void displayToast(String msg)
    {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();
    }
}