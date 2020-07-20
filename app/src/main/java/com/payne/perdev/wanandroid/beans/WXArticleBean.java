package com.payne.perdev.wanandroid.beans;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.wanandroid.beans
 * Date       2020/07/20 - 15:15
 * Author     Payne.
 * About      类描述：微信公众号
 */
public class WXArticleBean {
    /*
     * {
     *         "children":[
     *
     *             ],
     *         "courseId":13,
     *             "id":428,
     *             "name":"程序亦非猿",
     *             "order":190012,
     *             "parentChapterId":407,
     *             "userControlSetTop":false,
     *             "visible":1
     *     }
     * */
    public int courseId;
    public int id;
    public String name;
    public int order;
    public int parentChapterId;
    public boolean userControlSetTop;
    public int visible;
}
