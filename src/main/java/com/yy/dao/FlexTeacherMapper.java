package com.yy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yy.bean.FlexTeacher;

public interface FlexTeacherMapper {
    /**
    * 根据主键删除纪录：     表 flex_teacher
    **/
    int deleteByPrimaryKey(Long flexTeacherId);

    /**
    * 根据主键插入纪录：     表 flex_teacher
    **/
    int insert(FlexTeacher record);

    /**
    * 根据主键获取纪录：     表 flex_teacher
    **/
    FlexTeacher selectByUid(@Param("uid") Long uid);

    /**
    * 根据主键更新纪录：     表 flex_teacher
    **/
    int updateByPrimaryKey(FlexTeacher record);
    List<Long> selectOnlineTeacherUids();
}