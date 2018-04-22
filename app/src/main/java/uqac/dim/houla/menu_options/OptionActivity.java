package uqac.dim.houla.menu_options;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import uqac.dim.houla.R;
import uqac.dim.houla.reveil.GameView;

import static uqac.dim.houla.ShowBitmap.decodeSampledBitmapFromResource;

public class OptionActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_option);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        //Afficher la vue d'options
        setContentView(R.layout.activity_option);
    }

    //Au clic sur le bouton de choix de jeu
    public void choisirJeu(View v)
    {

        Intent intent;
        try {
            switch (v.getId()) {

                case R.id.bourre:

                    break;
                case R.id.cash:
                    intent = new Intent(this, uqac.dim.houla.cash.GameView.class);
                    startActivity(intent);
                    break;
                case R.id.couette:

                    break;
                case R.id.course:
                    intent = new Intent(this, uqac.dim.houla.course.courseActivity.class);
                    startActivity(intent);
                    break;
                case R.id.pote:
                    intent = new Intent(this, uqac.dim.houla.pote.GameView.class);
                    startActivity(intent);
                    break;
                case R.id.redac:
                    intent = new Intent(this, uqac.dim.houla.redac.GameView.class);
                    startActivity(intent);
                    break;
                case R.id.reveil:
                    intent = new Intent(this, GameView.class);
                    startActivity(intent);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void retour(View v)
    {
        super.finish();
    }
}
