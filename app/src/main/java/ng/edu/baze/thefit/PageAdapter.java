package ng.edu.baze.thefit;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int numberofTab;
    public PageAdapter(FragmentManager fm, int numberofTab){
        super(fm);
        this.numberofTab=numberofTab;

    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new BlankFragment();
            case 1:
                return new BlankFragment2();
            case 2:
                return new BlankFragment3();
            case 3:
                return new BlankFragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberofTab;
    }
}
