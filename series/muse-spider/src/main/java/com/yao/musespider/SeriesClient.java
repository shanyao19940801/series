package com.yao.musespider;

import com.yao.musespider.http.client.BaseHttpClient;
import com.yao.musespider.task.FinishedSeriesTask;

public class SeriesClient extends BaseHttpClient {

    public static void main(String[] args) {
        String url = "http://mcar.cc/forum.php?mod=forumdisplay&fid=129&typeid=59&orderby=lastpost&filter=typeid&typeid=59&orderby=lastpost&page=2";
        Thread thread = new Thread(new FinishedSeriesTask(url,false));
        thread.start();
        //爬取具体某个美剧信息
        String urlPer = "http://mcar.cc/forum.php?mod=viewthread&tid=32703&extra=page%3D2%26filter%3Dtypeid%26typeid%3D59%26orderby%3Dlastpost";
        Thread threadPer = new Thread(new FinishedSeriesTask(urlPer,false));
        threadPer.start();

    }

}
