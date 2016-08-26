package com.yy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yy.bean.TeacherRecommend;

public interface TeacherRecommendMapper {
    /**
    * 根据主键删除纪录：     表 teacher_recommend
    **/
    int deleteByPrimaryKey(Long id);

    /**
    * 根据主键插入纪录：     表 teacher_recommend
    **/
    int insert(TeacherRecommend record);

    /**
    * 根据主键获取纪录：     表 teacher_recommend
    **/
    TeacherRecommend selectByPrimaryKey(Long id);

    /**
    * 根据主键更新纪录：     表 teacher_recommend
    **/
    int updateByPrimaryKey(TeacherRecommend record);
    
    List<TeacherRecommend> getAreaSpecial(@Param("area") Integer area);
}