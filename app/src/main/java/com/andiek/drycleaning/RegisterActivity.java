package com.andiek.drycleaning;

import androidx.fragment.app.Fragment;

public class RegisterActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return RegisterFragment.newInstance();
    }
}