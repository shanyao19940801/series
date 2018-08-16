package com.yao.musespider.parser;

import com.yao.musespider.task.NacrFinishedSeriesTask;
import org.junit.Test;

public class NcarFinishedSerPerParserTest {

    @Test
    public void parser() {
        String urlPer = "http://mcar.cc/forum.php?mod=viewthread&tid=32703&extra=page%3D2%26filter%3Dtypeid%26typeid%3D59%26orderby%3Dlastpost";
        Thread threadPer = new Thread(new NacrFinishedSeriesTask(urlPer,false));
        threadPer.start();

    }
}