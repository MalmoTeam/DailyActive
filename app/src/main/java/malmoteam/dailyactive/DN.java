package malmoteam.dailyactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dn);


        Button back = (Button) findViewById(R.id.btnBackdn);

        back.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View arg0) {
                                        finish();
                                    }
                                }

        );
    }

}
