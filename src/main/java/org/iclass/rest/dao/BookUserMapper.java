package org.iclass.rest.dao;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.rest.dto.BookUser;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookUserMapper {

    BookUser login(Map<String, String> map);
    BookUser selectOne(String id);
    int isExist(String id);
    int insert(BookUser bookUser);
    int changeOneField(Map<String , Object> map);

    int changeMany(BookUser bookUser);
    int delete(String id);
    List<BookUser> selectAll();

}
