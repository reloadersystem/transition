package resembrink.dev.transition;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    long animationDuration=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= findViewById(R.id.imageView);


        movarribabajo();



    }

    private void movarribabajo() {

        ObjectAnimator animatorX= ObjectAnimator.ofFloat(imageView,"x",150f);
        ObjectAnimator animatorY= ObjectAnimator.ofFloat(imageView,"y",300f);

        ObjectAnimator alphanimation= ObjectAnimator.ofFloat(imageView,View.ALPHA,0.0f,1.0f);
        alphanimation.setDuration(animationDuration);


        ObjectAnimator rotation= ObjectAnimator.ofFloat(imageView,"rotation",0f,360f);
        rotation.setDuration(animationDuration);


        animatorX.setDuration(animationDuration);
        animatorY.setDuration(animationDuration);

        AnimatorSet animatorSet= new AnimatorSet();
        animatorSet.playTogether(animatorX,animatorY,alphanimation,rotation);
        animatorSet.start();

    }


}
