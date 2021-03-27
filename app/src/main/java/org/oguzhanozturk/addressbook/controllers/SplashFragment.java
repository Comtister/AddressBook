package org.oguzhanozturk.addressbook.controllers;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import org.oguzhanozturk.addressbook.R;
import org.oguzhanozturk.addressbook.interfaces.SplashFragmentInterface;

public class SplashFragment extends Fragment {


    private SplashFragmentInterface splashFragmentInterface;

    public SplashFragment(){
        super(R.layout.splash_screen);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        splashFragmentInterface = (EntryActivity) getActivity();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splashFragmentInterface.switchPage();
            }
        },1000);

    }

}
