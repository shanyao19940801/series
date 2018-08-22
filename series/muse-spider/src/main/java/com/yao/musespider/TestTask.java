package com.yao.musespider;

import com.yao.musespider.constants.ProxyPool;
import com.yao.musespider.entity.Page;
import com.yao.musespider.task.AbstractTask;
import com.yao.musespider.utils.HttpClientUtil;
import org.apache.http.HttpHost;

public class TestTask extends AbstractTask<TestTask> {
    @Override
    public void retry() {

    }

    @Override
    public void handle(Page page) {

    }

    @Override
    public void run() {
        String url = "http://mcar.cc/forum.php?mod=forumdisplay&fid=129&typeid=59&orderby=lastpost&filter=typeid&typeid=59&orderby=lastpost&page="
;        try {
            getPage(url+1);
            getPage(url+1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
