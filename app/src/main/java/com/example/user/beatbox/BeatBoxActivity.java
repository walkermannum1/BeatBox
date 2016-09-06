package com.example.user.beatbox;

import android.support.v4.app.Fragment;

/**
 * Created by user on 2016/9/6.
 */
public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
