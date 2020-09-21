package cn.hp.springboot2.mapper;



import cn.hp.springboot2.pojo.bookType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("typeMapper")
public interface TypeMapper {
    //查询所有类型
    List<bookType> findAll();
    //查询单条
    bookType findOneType(int typeid);
    //添加
    int saveType(bookType bookType);
    //删除
    int delTypeById(int typeid);
    //修改
    int update(bookType bookType);
    
}
