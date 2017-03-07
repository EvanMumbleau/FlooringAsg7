package css.evanmumbleau.flooringasg7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    static TextView tvResult;
    Double Length, Width, Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = (TextView) findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        Length = extras.getDouble("tvLength");
        Width = extras.getDouble("tvWidth");

        Area = Length*Width;
        tvResult.setText("Flooring needed: \nWidth is " + Width + " and Length is " + Length + " and flooring needed is " + Area);
    }
}
