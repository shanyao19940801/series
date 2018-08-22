package com.yao.musespider.utils;

import java.io.*;

public class IOUtils {
    /**
     * 一次性读取文件内所有内容
     * @param path  文件路劲
     * @return
     */
    public static String getProxysStringAll(String path) {
        File file = new File(path);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];

        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(filecontent);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            return new String(filecontent,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
