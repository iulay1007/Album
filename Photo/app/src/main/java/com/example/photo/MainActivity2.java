package com.example.photo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.photo.adapter.PictureSlideAdapter;
import com.example.photo.adapter.fragment.LeftFragment;
import com.example.photo.adapter.fragment.RightFragment;

import java.util.ArrayList;
import java.util.List;

import static com.example.photo.MainActivity.imageBeanList;

public class MainActivity2 extends AppCompatActivity {

    private List<ImageBean> list = new ArrayList<>();
    private List<Fragment> fragmentlist=new ArrayList<>();;
    ImageView imageView;
    private ViewPager viewPager;
    private PictureSlideAdapter pictureSlideAdapter;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // imageView=(ImageView)findViewById(R.id.imageview2);
        viewPager=(ViewPager)findViewById(R.id.viewpager);



        Fragment leftFragment = new LeftFragment();
        Fragment centerFragment=new ShowPictureFragment();
        Fragment rightFragment = new RightFragment();
        fragmentlist.add(centerFragment);
        fragmentlist.add(leftFragment);

        fragmentlist.add(rightFragment);


        pictureSlideAdapter=new PictureSlideAdapter(getSupportFragmentManager(),fragmentlist);
        viewPager.setAdapter(pictureSlideAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
      //  viewPager.addOnPageChangeListener();

        Intent intent=getIntent();

     //!!!!!(List<ImageBean>)
        //list=imageBeanList;
        //imageBeanList =  MediaApplication.getInstance().getPhotoList();
  //  int  position=intent.getIntExtra("position",0);
      //  Glide.with(imageView.getContext()).load(list.get(position).getPath()).into(imageView);


  //  imageBeanList=(List<ImageBean>) intent.<Parcelable>getSerializableExtra("list");

    }


}