package cn.hp.springboot2.service.impl;



import cn.hp.springboot2.mapper.InfoMapper;
import cn.hp.springboot2.mapper.TypeMapper;
import cn.hp.springboot2.pojo.bookInfo;
import cn.hp.springboot2.pojo.bookType;
import cn.hp.springboot2.service.InfoService;
import cn.hp.springboot2.utils.JsonData;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoMapper;
    @Autowired
    private TypeMapper typeMapper;

    //第一张表 First table
    @Override
    public JsonData allInfo(int page,int limit) {
        PageHelper.startPage(page,limit);
        List<bookInfo> infos = infoMapper.findAll();
        PageInfo<bookInfo> pageInfo=new PageInfo<>(infos);
        return JsonData.buildSuc(pageInfo);
    }

    @Override
    public JsonData findOne(int bookid) {
        bookInfo bookInfo = infoMapper.findOne(bookid);
        return JsonData.buildSuc(bookInfo);
    }

    @Override
    public JsonData saveInfo(bookInfo bookInfo) {
        int result = 0;
        if (bookInfo.getBookid() == null) {
            result = infoMapper.saveInfo(bookInfo);
        } else {
            result = infoMapper.update(bookInfo);
        }
        if (result >= 0) {
            return JsonData.buildSuc("编辑成功");
        }
        return JsonData.buildError("编辑失败");
    }

    @Override
    public JsonData delById(int bookid) {
        int result = infoMapper.delById(bookid);
        if (result >= 0) {
            return JsonData.buildSuc("删除成功");
        }
        return JsonData.buildError("删除失败");

    }

    @Override
    public JsonData allType() {
        List<bookType> types= typeMapper.findAll();
        return JsonData.buildSuc(types);
    }

}

