package com.yao.musespider;

import com.yao.musespider.constants.ProxyPool;
import com.yao.musespider.entity.Page;
import com.yao.musespider.client.BaseHttpClient;
import com.yao.musespider.service.ISeriesService;
import com.yao.musespider.task.NacrFinishedSeriesTask;
import com.yao.musespider.task.NacrSeriesPageTask;
import com.yao.musespider.utils.HttpClientUtil;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.*;

public class SeriesClient extends BaseHttpClient {

    private ThreadPoolExecutor finishSerThreadPool;

    @Autowired
    ISeriesService seriesService;

    public void init() {
        finishSerThreadPool = new ThreadPoolExecutor(20,40,100,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>(50));
    }
    public static void main(String[] args) {
//        seriesList("http://mcar.cc/forum.php?mod=forumdisplay&fid=129&typeid=59&orderby=lastpost&filter=typeid&typeid=59&orderby=lastpost&page=1");
        seriesListCallable("http://mcar.cc/forum.php?mod=forumdisplay&fid=129&typeid=59&orderby=lastpost&typeid=59&orderby=lastpost&filter=typeid&page=");
        //爬取具体某个美剧信息
//        seriesPage("http://mcar.cc/forum.php?mod=viewthread&tid=32299&extra=page%3D2%26filter%3Dtypeid%26typeid%3D59%26orderby%3Dlastpost");

    }

    private static void seriesList(String s) {
        String url = s;
        Thread thread = new Thread(new NacrFinishedSeriesTask(url, false));
        thread.start();
    }
     private static void seriesListCallable(String url) {
         try {
             Page p = getInstance().getPage(url+1);
             HttpGet request1 = new HttpGet(url+1);
             HttpHost proxy1 = new HttpHost("117.156.234.3", 8060);
             request1.setConfig(HttpClientUtil.getRequestConfigBuilder().setProxy(proxy1).build());
             Page page1 = BaseHttpClient.getInstance().getPage(request1);

             HttpGet request = new HttpGet(url+1);
             HttpHost proxy = new HttpHost("218.207.212.86", 80);
             request.setConfig(HttpClientUtil.getRequestConfigBuilder().setProxy(proxy).build());
             Page page = BaseHttpClient.getInstance().getPage(request);



             System.out.println("qw");
         } catch (IOException e) {
             e.printStackTrace();
         }
        /* NacrFinishedSeriesTask task = new NacrFinishedSeriesTask(url+2,false);
         FutureTask<List> futureTask = new FutureTask<>(task);
         Thread thread = new Thread(futureTask);
         thread.start();
         try {
             List list = futureTask.get();
             System.out.println(list);
         } catch (InterruptedException e) {
             e.printStackTrace();
         } catch (ExecutionException e) {
             e.printStackTrace();
         }*/
     }

    private static void seriesPage(String s) {
        String url = s;
        Thread thread = new Thread(new NacrSeriesPageTask(url, false));
        thread.start();
    }

}
