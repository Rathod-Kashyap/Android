package com.example.retro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    ArrayList<videoModel> videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager2=findViewById(R.id.viewPager);
        videos=new ArrayList<>();
        for (int i = 0; i < 5; i++) {


            videoModel ob1 = new videoModel("https://vod-progressive.akamaized.net/exp=1652445231~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F829%2F10%2F254146872%2F927072573.mp4~hmac=3fad603c8b55a1b3e93d2bb131077ad4ffb5feb4c4a82838f3ba71cf8427d38b/vimeo-prod-skyfire-std-us/01/829/10/254146872/927072573.mp4?filename=Animation+-+14035.mp4", "Hello", "World Kashyap");
            videos.add(ob1);

            videoModel ob2 = new videoModel("https://media.istockphoto.com/videos/young-couple-gardening-together-in-house-backyard-video-id1332993552", "Hello", "World Kashyap");
            videos.add(ob2);

            videoModel ob3 = new videoModel("https://media.istockphoto.com/videos/container-ship-isometric-3d-loopable-animation-video-id1220204077", "Hello", "World Kashyap");
            videos.add(ob3);
            videoModel ob4 = new videoModel("https://media.istockphoto.com/videos/3d-render-precision-concept-seamless-loop-of-an-array-of-golden-balls-video-id1302647775", "Hello", "World Kashyap");
            videos.add(ob4);
            videoModel ob5 = new videoModel("https://media.istockphoto.com/videos/abstract-3d-render-red-geometric-background-with-cubes-motion-design-video-id1300951702", "Hello", "World Kashyap");
            videos.add(ob5);
            videoModel ob6 = new videoModel("https://media.istockphoto.com/videos/abstract-3d-render-red-geometric-background-with-cubes-motion-design-video-id1300951702", "Hello", "World Kashyap");
            videos.add(ob6);
        }

        viewPager2.setAdapter(new videoAdapter(videos));

    }
}