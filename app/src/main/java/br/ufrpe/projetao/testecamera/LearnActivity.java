package br.ufrpe.projetao.testecamera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Lucas on 15/04/2016.
 */
public class LearnActivity extends AppCompatActivity {

private ImageView imageView2;
private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13;
private Button button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26;
private Button button27,button28,button29,button30,button31,button32,button33,button34,button35,button36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_activity);

        button1 =(Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView) findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.zero);
            }
        });

        button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.um);
            }
        });

        button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.dois);
            }
        });

        button4 = (Button)findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.tres);
            }
        });

        button5 = (Button)findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.quatro);
            }
        });

        button6 = (Button)findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.cinco);
            }
        });

        button7 = (Button)findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.seis);
            }
        });

        button8 = (Button)findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.sete);
            }
        });

        button9 = (Button)findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.oito);
            }
        });

        button10 = (Button)findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.nove);
            }
        });

        button11 = (Button)findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letraa);
            }
        });

        button12 = (Button)findViewById(R.id.button12);

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrab);
            }
        });

        button13 = (Button)findViewById(R.id.button13);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrac);
            }
        });

        button14 = (Button)findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrad);
            }
        });

        button15 = (Button)findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrae);
            }
        });

        button16 = (Button)findViewById(R.id.button16);

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letraf);
            }
        });

        button17 = (Button)findViewById(R.id.button17);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrag);
            }
        });

        button18 = (Button)findViewById(R.id.button18);

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrah);
            }
        });

        button19 = (Button)findViewById(R.id.button19);

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrai);
            }
        });

        button20 = (Button)findViewById(R.id.button20);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letraj);
            }
        });

        button21 = (Button)findViewById(R.id.button21);

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrak);
            }
        });

        button22 = (Button)findViewById(R.id.button22);

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letral);
            }
        });

        button23 = (Button)findViewById(R.id.button23);

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letram);
            }
        });

        button24 = (Button)findViewById(R.id.button24);

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letran);
            }
        });

        button25 = (Button)findViewById(R.id.button25);

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrao);
            }
        });

        button26 = (Button)findViewById(R.id.button26);

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrap);
            }
        });

        button27 = (Button)findViewById(R.id.button27);

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letraq);
            }
        });

        button28 = (Button)findViewById(R.id.button28);

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrar);
            }
        });

        button29 = (Button)findViewById(R.id.button29);

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letras);
            }
        });

        button30 = (Button)findViewById(R.id.button30);

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrat);
            }
        });

        button31 = (Button)findViewById(R.id.button31);

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrau);
            }
        });

        button32 = (Button)findViewById(R.id.button32);

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrav);
            }
        });

        button33 = (Button)findViewById(R.id.button33);

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letraw);
            }
        });

        button34 = (Button)findViewById(R.id.button34);

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letray);
            }
        });

        button35 = (Button)findViewById(R.id.button35);

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letrax);
            }
        });

        button36 = (Button)findViewById(R.id.button36);

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2 = (ImageView)findViewById(R.id.imageView2);
                imageView2.setImageResource(R.drawable.letraz);
            }
        });


    }




}
