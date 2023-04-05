package com.andiek.drycleaning;

import androidx.fragment.app.Fragment;

public class GreetingActivity extends SingleFragmentActivity{
    @Override
    public Fragment createFragment() {
        return GreetingFragment.newInstance();
    }
}
