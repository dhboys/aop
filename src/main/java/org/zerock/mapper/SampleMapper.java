package org.zerock.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SampleMapper {

	@Insert("insert into tbl_board (title , content , writer ) values (#{title} , #{content} , #{writer})")
	void insert3(@Param("title") String title ,
				 @Param("content")String content ,
				 @Param("writer") String writer );
	@Select("select last_insert_id()")
	Long getLast();
	
	@Insert("insert into tbl_sample1 (col1) values ( #{str} )")
	void insert1(String str);
	
	@Insert("insert into tbl_sample2 (col2) values ( #{str} )")
	void insert2(String str);
	
}
