package malmoteam.dailyactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button nextScreen = (Button) findViewById(R.id.oi);
        Button nextScreen2 = (Button) findViewById(R.id.di);
        Button nextScreen3 = (Button) findViewById(R.id.on);
        Button nextScreen4 = (Button) findViewById(R.id.dn);

        //Listening to button event
        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Starting a new Intent
                //saveInfo();
                Intent intent = new Intent(MainActivity.this, OI.class);
                //Intent intent = new Intent(FirstScreenActivity.this, SecondScreenActivity.class);
                startActivity(intent);
                //startActivity(intent);

            }
        });

        nextScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Starting a new Intent
                //saveInfo();
                Intent intent = new Intent(MainActivity.this, DI.class);
                //Intent intent = new Intent(FirstScreenActivity.this, SecondScreenActivity.class);
                startActivity(intent);
                //startActivity(intent);

            }
        });

        nextScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Starting a new Intent
                //saveInfo();
                Intent intent = new Intent(MainActivity.this, ON.class);
                //Intent intent = new Intent(FirstScreenActivity.this, SecondScreenActivity.class);
                startActivity(intent);
                //startActivity(intent);

            }
        });

        nextScreen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Starting a new Intent
                //saveInfo();
                Intent intent = new Intent(MainActivity.this, DN.class);
                //Intent intent = new Intent(FirstScreenActivity.this, SecondScreenActivity.class);
                startActivity(intent);
                //startActivity(intent);

            }
        });








    }
}
