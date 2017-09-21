package soundofpets.studio.com.soundofpets;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView dog;
    private ImageView cat;
    private ImageView lion;
    private ImageView monkey;
    private ImageView sheep;
    private ImageView cow;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = (ImageView) findViewById(R.id.imageDogId);
        cat = (ImageView) findViewById(R.id.imageCatId);
        lion = (ImageView) findViewById(R.id.imageLionId);
        monkey = (ImageView) findViewById(R.id.imageMonkeyId);
        sheep = (ImageView) findViewById(R.id.imageSheepId);
        cow = (ImageView) findViewById(R.id.imageCowId);

        dog.setOnClickListener(this);
        cat.setOnClickListener(this);
        lion.setOnClickListener(this);
        monkey.setOnClickListener(this);
        sheep.setOnClickListener(this);
        cow.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imageDogId:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                playSound();
                break;
            case R.id.imageCatId:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                playSound();
                break;
            case R.id.imageLionId:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                playSound();
                break;
            case R.id.imageMonkeyId:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                playSound();
                break;
            case R.id.imageSheepId:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                playSound();
                break;
            case R.id.imageCowId:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                playSound();
                break;
            
        }
    }

    private void playSound() {
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
