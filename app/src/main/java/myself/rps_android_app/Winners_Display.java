package myself.rps_android_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View ;

public class Winners_Display extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winners__display);

        configureBackbutton() ; }


    public void configureBackbutton() {
        Button Backbutton= (Button) findViewById(R.id.Backbutton) ;

        Backbutton.setOnClickListener(new View.OnClickListener() {

        @Override
                public void onClick(View view) {
                    finish(); }


         ;



    } );


} }

