package net.atlassian.khtn15hcb_group4.translateorc.Main;

import android.widget.Button;
/**
 * Created by Hidro Le on 8/5/2016.
 */
public interface MainPresenter {
    void onResume();

    void onButtonClicked(Button btn);

    void onDestroy();
}
