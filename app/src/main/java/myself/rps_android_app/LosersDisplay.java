package myself.rps_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LosersDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losers_display);

        configureBackbutton_Loser() ;
    }

    public void configureBackbutton_Loser() {
        Button Backbutton2 = (Button) findViewById(R.id.Backbutton2) ;

        Backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                finish();
            }


                                       }




        );



    }


}
