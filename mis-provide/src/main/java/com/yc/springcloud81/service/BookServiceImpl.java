package com.yc.springcloud81.service;

import com.yc.springcloud81.bean.Book;
import com.yc.springcloud81.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired(required = false)
    private BookMapper bookMapper;

  @Override
    public Book getBook(Integer id){
        //selectByPrimaryKey 根据主键id查询
        return bookMapper.selectByPrimaryKey(id);

    }
}
