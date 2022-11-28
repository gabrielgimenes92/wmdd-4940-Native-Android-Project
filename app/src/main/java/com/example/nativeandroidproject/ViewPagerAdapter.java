package com.example.nativeandroidproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ComicsFragment();
            case 1:
                return new MoviesFragment();
            case 2:
                return new SeriesFragment();
            default:
                return new ComicsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
