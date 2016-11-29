package shyam0507.github.com.tablayoutexample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shyam0507.github.com.tablayoutexample.R;

/**
 * Created by Shyamnath Vishwakarma on 05/09/16.
 */
public class ThirdFragmnet extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
}
