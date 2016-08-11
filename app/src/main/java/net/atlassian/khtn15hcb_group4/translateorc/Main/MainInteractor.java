package net.atlassian.khtn15hcb_group4.translateorc.Main;

import java.util.List;

/**
 * Created by Hidro Le on 8/5/2016.
 */
public interface MainInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }
}
