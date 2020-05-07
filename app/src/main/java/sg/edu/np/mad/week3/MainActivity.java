package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media;
    VideoView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Load Audio
        media = MediaPlayer.create(this,R.raw.baby_laughing);
        media.start();

        //Load View
        view = findViewById(R.id.videoView);
        view.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid));
        view.start();

    }

    @Override
    protected void onStop() {
        super.onStop();
        media.release();
        media = null;
    }
}
