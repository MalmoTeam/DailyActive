package malmoteam.dailyactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class OI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oi);


        //Button back = (Button) findViewById(R.id.btnBack);
        ImageButton btn= (ImageButton) findViewById(R.id.btnBack);

        btn.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View arg0) {
                                        finish();
                                    }
                                }

        );


    }

}
