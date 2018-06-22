package ir.faranesh.mehdiandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;


public class MainActivity extends Activity {
    Button btn_change;
    TextView display;
    EditText entery;
    Button web,dial,map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        inti();

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CALLweb =new Intent(Intent.ACTION_VIEW , Uri.parse("http://www.clicksite.org"));
                startActivity(CALLweb);

            }

        });


        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CALLdial = new Intent(Intent.ACTION_DIAL ,Uri.parse("tell:+989357443841"));
                startActivity(CALLdial);
            }
        });


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CALLmap = new Intent(Intent.ACTION_VIEW ,Uri.parse("geo:N35.773568E51.411127"));
                startActivity(CALLmap);

            }
        });


        btn_change = (Button) findViewById(R.id.bchange);
        display = (TextView) findViewById(R.id.tvDisplay);
        entery = (EditText) findViewById(R.id.etEntery);





        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data =entery.getText().toString();
                display.setText(data);
            }

        });


    }

    private void inti() {
        web = (Button) findViewById(R.id.btn_web);
        dial = (Button) findViewById(R.id.btn_dial);
        map = (Button)  findViewById(R.id.btn_map);
    }
}
