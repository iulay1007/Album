package com.example.photo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.photo.ShowPictureFragment;
import static com.example.photo.adapter.RecyclerviewAdapter.pic_position;


import java.util.List;

public class PictureSlideAdapter extends FragmentStatePagerAdapter {

  //  List<Fragment> fragmentlist;
    public PictureSlideAdapter(@NonNull FragmentManager fm) {
        super(fm);
        //this.fragmentlist=fragmentlist;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       // pic_position++;
        return new ShowPictureFragment();
    }

    @Override
    public int getCount() {
        //!!!!lise.size();
        return 100;
    }
}
