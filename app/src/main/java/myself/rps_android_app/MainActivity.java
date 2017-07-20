package myself.rps_android_app;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.util.Log ;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton ;
    ImageButton imageButton2 ;
    ImageButton imageButton3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        configureImageButton();
        configureImageButton2() ;
        configureImageButton3() ;

    }


        public void configureImageButton() {
            ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton) ;

            Random rnd = new Random() ;
            final int Compint = rnd.nextInt(3) ;


            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Compint== 1 ) {
                    startActivity(new Intent(MainActivity.this , Winners_Display.class)); //1 is rock
                    }
                    else if (Compint ==2) {
                        startActivity(new Intent(MainActivity.this , LosersDisplay.class)); //2 is scissors
                    }
                    else {
                        startActivity(new Intent(MainActivity.this, Tie_Display.class)); //3 is paper
                    }
                    ;
                }



            } );

    }

        public void configureImageButton2() {
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2) ;
            Random rnd1 = new Random() ;
            final int Compint= rnd1.nextInt(3) ;

            imageButton2.setOnClickListener(new View.OnClickListener() { //scissor
                @Override
                public void onClick(View view) {
                    if (Compint==1) {
                        startActivity(new Intent(MainActivity.this ,LosersDisplay.class)); //scissor vs rock
                    }
                    else if (Compint ==2 ) {
                        startActivity(new Intent(MainActivity.this , Tie_Display.class)); //scissor vs. scissor
                    }
                    else
                        startActivity(new Intent(MainActivity.this, Winners_Display.class));


                }
            });
        }



        public void configureImageButton3() {
            ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3) ;
            Random rnd2 = new Random() ;
            final int Compint = rnd2.nextInt(3) ;


            imageButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Compint==1) { //rock
                        startActivity(new Intent(MainActivity.this , Tie_Display.class));
                    }
                    else if (Compint==2) {
                        startActivity(new Intent(MainActivity.this , Winners_Display.class));
                    }
                    else  {
                        startActivity(new Intent(MainActivity.this , LosersDisplay.class));
                    }
                }
            });



        }






    /*
        imageButton.setImageDrawable(getBaseContext().getResources().getDrawable(R.drawable.Paper_backdrop));
        imageButton2.setImageDrawable(getBaseContext().getResources().getDrawable(R.drawable.Scissors_backdrop));
        imageButton3.setImageDrawable(getBaseContext().getResources().getDrawable(R.drawable.rock_backdrop)) ;

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                imageButton2.setSelected(!imageButton2.isSelected());
                if (imageButton2.isSelected()) {
                    scissors = true ;
                    Log.d( msg ,"Hello it is working") ;
                }
                else
                    scissors = false ;
            }
                                        }
        ) ;


        imageButton3. setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick (View view) {
                imageButton3.setSelected(!imageButton3.isSelected());
                if (imageButton3.isSelected()) {
                    rock = true;
                }
                else
                    rock = false ;
            }
                                        }
        );



        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setSelected(!imageButton.isSelected());

                if(imageButton.isSelected()) {
                    paper = true ;
                }
                else
                    paper = false ;


                }
        }); */






    }

