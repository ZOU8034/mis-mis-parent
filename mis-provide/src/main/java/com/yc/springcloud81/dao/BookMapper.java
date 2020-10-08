package com.yc.springcloud81.dao;


import com.yc.springcloud81.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper//tk.mtbatis这个接口自动生成实现类
public interface BookMapper extends MisBaseMapper<Book>{

}