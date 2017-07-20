package myself.rps_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tie_Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tie__display);

        configureBackbutton3() ;
    }


    public void configureBackbutton3() {

        Button Backbutton3 = (Button) findViewById(R.id.Backbutton3);{
            Backbutton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }


    }




}
