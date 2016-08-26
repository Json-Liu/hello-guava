package com.yy.dao;

import java.util.List;



import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yy.bean.TeacherRecommend;

/***
 ** @Author JosonLiu
 ** @Date 2016年8月1日
 ** @Version 1.0
 ***/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class TeacherRecommendTest {
	@Autowired
	private TeacherRecommendMapper teacherRecommendMapper;
	@Test
	public void test_getRecommededSpecialByAreaAndDate(){
		List<TeacherRecommend> areaSpecial = teacherRecommendMapper.getAreaSpecial(10);
		TeacherRecommend checkDateTime = getRecommendDateTime("2016-08-10","2016-08-14","08:00:00","09:00:00");
		for (TeacherRecommend each : areaSpecial) {
			System.out.println( isConflict(checkDateTime, each) );
		}
	}
	private boolean isConflict(TeacherRecommend o1,TeacherRecommend o2){
		boolean result = true;
		if(o1.getStartDate().getTime() > o2.getEndDate().getTime() || o1.getEndDate().getTime() < o2.getStartDate().getTime()){
			result = false;
		}else{//日期冲突的情况下判断时间
			if(o1.getStartTime().getTime() > o2.getEndTime().getTime()-1 || o1.getEndTime().getTime() < o2.getStartTime().getTime()+1 ){
				result = false;
			}
		}
		return result;
	}
	   private TeacherRecommend getRecommendDateTime(String startDate,String EndDate,String startTime,String endTime){
		   	TeacherRecommend result = new TeacherRecommend();
		   	result.setStartDate( strToDateTime(startDate, "yyyy-MM-dd").toDate() );
		   	result.setEndDate( strToDateTime(EndDate, "yyyy-MM-dd").toDate() );
		   	result.setStartTime( strToDateTime(startTime, "HH:mm:ss").toDate() );
		   	result.setEndTime( strToDateTime(endTime, "HH:mm:ss").toDate() );
		   	result.setIsSpecial(false);
		   	result.setIsChannelRecommend(false);
		   	result.setDays("1,2,3,4,5,6,7");
		   	return result;
	   }
	   /**
	    * 将相应字符串格式的时间转换为DateTime
	    * @param dateTime
	    * @param pattern
	    * @return
	    */
	   private DateTime strToDateTime(String dateTime,String pattern){
	       DateTime result = new DateTime();
	       DateTimeFormatter formatter = DateTimeFormat.forPattern(pattern);
	       result = formatter.parseDateTime(dateTime);
	       return result;
	   }
}
