package cn.hp.springboot2.mapper;



import cn.hp.springboot2.pojo.bookInfo;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository("infoMapper")
public interface InfoMapper {
    //查询所有书籍
    List<bookInfo> findAll();
    //查询单条
    bookInfo findOne(int bookid);
    //添加
    int saveInfo(bookInfo bookInfo);
    //删除
    int delById(int bookid);
    //修改
    int update(bookInfo bookInfo);
}
