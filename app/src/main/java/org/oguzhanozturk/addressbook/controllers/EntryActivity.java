package org.oguzhanozturk.addressbook.controllers;

import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import org.oguzhanozturk.addressbook.R;
import org.oguzhanozturk.addressbook.interfaces.SplashFragmentInterface;

public class EntryActivity extends AppCompatActivity implements SplashFragmentInterface {

    private FragmentManager fragmentManager;

    public EntryActivity(){
        super(R.layout.activity_entry);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fragmentManager = getSupportFragmentManager();
        setSplashFragment();

    }

    private void setSplashFragment(){

        fragmentManager.beginTransaction()
                .add(R.id.enrtyFragmentHolder,SplashFragment.class,null)
                .commit();

    }

    @Override
    public void switchPage() {
            fragmentManager.beginTransaction()
                    .replace(R.id.enrtyFragmentHolder,LoginFragment.class,null)
                    .commit();
    }
}
