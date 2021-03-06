package css.evanmumbleau.flooringasg7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

/*
declare variables
 */
public class FloorAsg7 extends AppCompatActivity {

    private EditText tvWidth, tvLength;
    Button btnShowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_asg7);

        //initialize widgets
        tvWidth = (EditText) findViewById(R.id.editTextWidth);
        tvLength = (EditText) findViewById(R.id.editTextLength);
        btnShowResult = (Button) findViewById(R.id.btnResults);
    }

    public void onClickButn (View view){
        Intent calcIntent = new Intent(FloorAsg7.this, MainActivity.class);     //Call second activity
        calcIntent.putExtra("tvLength", Double.parseDouble(tvLength.getText().toString()));     //get length as string and convert to double
        calcIntent.putExtra("tvWidth", Double.parseDouble(tvWidth.getText().toString()));       //get width as string and convert to double
        startActivity(calcIntent);      //initiate second activity
    }
}
