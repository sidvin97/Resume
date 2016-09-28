package com.example.android.resume;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }
 @Override
 public Fragment getItem(int position)
 {
     if (position == 0) {
         return new AcademicFragment();
     } else {
         return new ExtraCurricularFragment();
     }
 }

    @Override
     public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.title_activity_academic_fragment);
        } else {
            return mContext.getString(R.string.title_activity_extra_curricular_fragment);
        }
    }
}
