package com.yao.musespider;

import com.yao.musespider.http.client.BaseHttpClient;
import com.yao.musespider.task.NacrFinishedSeriesTask;
import com.yao.musespider.task.NacrSeriesPageTask;

public class SeriesClient extends BaseHttpClient {

    public static void main(String[] args) {
        seriesList("http://mcar.cc/forum.php?mod=forumdisplay&fid=129&typeid=59&orderby=lastpost&filter=typeid&typeid=59&orderby=lastpost&page=1");
        //爬取具体某个美剧信息
//        seriesPage("http://mcar.cc/forum.php?mod=viewthread&tid=32299&extra=page%3D2%26filter%3Dtypeid%26typeid%3D59%26orderby%3Dlastpost");

    }

    private static void seriesList(String s) {
        String url = s;
        Thread thread = new Thread(new NacrFinishedSeriesTask(url, false));
        thread.start();
    }
    private static void seriesPage(String s) {
        String url = s;
        Thread thread = new Thread(new NacrSeriesPageTask(url, false));
        thread.start();
    }

}
