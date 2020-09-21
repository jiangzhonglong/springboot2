package cn.hp.springboot2.service;


import cn.hp.springboot2.pojo.bookInfo;
import cn.hp.springboot2.pojo.bookType;
import cn.hp.springboot2.utils.JsonData;

public interface InfoService {
    //第一张表
    JsonData allInfo(int page,int limit);
    JsonData findOne(int bookid);
    JsonData saveInfo(bookInfo bookInfo);
    JsonData delById(int bookid);
    //第二张表
    JsonData allType();


}
