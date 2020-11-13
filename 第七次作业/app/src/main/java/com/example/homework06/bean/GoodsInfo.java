package com.example.homework06.bean;

import com.example.homework06.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "YSL", "GUCCI", "CHANEL",
            "MAC", "ARMANI", "TF",
            "lancome","Dior"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "YSL 小粉条214",
            "GUCCI 308",
            "CHANEL 122",
            "MAC mocha",
            "ARMANI 红管405",
            "TF 01",
            "lancome 196",
            "Dior 740"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6299, 2199, 2499, 5299, 1899, 1998,1699,4999};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.ysl_s, R.drawable.gucci_s, R.drawable.chanel_s,
            R.drawable.mac_s, R.drawable.armani_s, R.drawable.tf_s,
            R.drawable.lancome_s,R.drawable.dior_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.ysl, R.drawable.gucci, R.drawable.chanel,
            R.drawable.mac, R.drawable.armani, R.drawable.tf,
            R.drawable.lancome,R.drawable.dior
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
