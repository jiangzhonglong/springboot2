package cn.hp.springboot2.controller;

import cn.hp.springboot2.pojo.bookInfo;
import cn.hp.springboot2.service.InfoService;
import cn.hp.springboot2.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService infoService;


    //第一张表
    @RequestMapping("/allInfo")
    public JsonData allInfo(int page,int limit){
        JsonData jsonData=infoService.allInfo(page,limit);
        return jsonData;
    }
    @RequestMapping("/findOne")
    public JsonData findOne(int bookid){
        JsonData jsonData=infoService.findOne(bookid);
        return jsonData;
    }
    @RequestMapping("/saveInfo")
    public JsonData saveInfo(bookInfo bookInfo){
        JsonData jsonData=infoService.saveInfo(bookInfo);
        return jsonData;
    }
    @RequestMapping("/delById")
    public JsonData delById(int bookid){
        JsonData jsonData=infoService.delById(bookid);
        return jsonData;
    }

    //第二张表
    @RequestMapping("/allType")
    public JsonData allType(){
        System.out.println("123");
        JsonData jsonData=infoService.allType();
        return jsonData;
    }


}
