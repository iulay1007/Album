package com.example.photo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.photo.ShowPictureFragment;

import java.util.List;

public class PictureSlideAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragmentlist;
    public PictureSlideAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentlist) {
        super(fm);
        this.fragmentlist=fragmentlist;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        //!!!!lise.size();
        return 3;
    }
}
