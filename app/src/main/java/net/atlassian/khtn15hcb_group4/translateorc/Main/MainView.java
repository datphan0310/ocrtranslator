package net.atlassian.khtn15hcb_group4.translateorc.Main;

import android.graphics.Bitmap;

/**
 * Created by Hidro Le on 8/5/2016.
 */
public interface MainView {
    void showProgress();

    void hideProgress();

    void setImage(Bitmap items);

    void showMessage(String message);
}
