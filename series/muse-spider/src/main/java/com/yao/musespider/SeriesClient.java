package com.yao.musespider;

import com.yao.musespider.http.client.BaseHttpClient;
import com.yao.musespider.task.FinishedSeriesTask;

public class SeriesClient extends BaseHttpClient {

    public static void main(String[] args) {
        String url = "http://mcar.cc/forum.php?mod=forumdisplay&fid=129&typeid=59&orderby=lastpost&filter=typeid&typeid=59&orderby=lastpost&page=2";
        Thread thread = new Thread(new FinishedSeriesTask(url,false));
        thread.start();
    }

}
