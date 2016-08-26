package com.yy.bean;

import java.util.Date;

public class TeacherRecommend {
    /**
     *  自增主键,所属表字段为teacher_recommend.id
     */
    private Long id;

    /**
     *  老师UID,所属表字段为teacher_recommend.uid
     */
    private Long uid;

    /**
     *  频道号SID,所属表字段为teacher_recommend.sid
     */
    private Long sid;

    /**
     *  子频道号SSID,所属表字段为teacher_recommend.ssid
     */
    private Long ssid;

    /**
     *  频道标题,所属表字段为teacher_recommend.channel_title
     */
    private String channelTitle;

    /**
     *  频道海报,所属表字段为teacher_recommend.channel_cover_url
     */
    private String channelCoverUrl;

    /**
     *  是否为频道推荐,所属表字段为teacher_recommend.is_channel_recommend
     */
    private Boolean isChannelRecommend;

    /**
     *  推荐区域,所属表字段为teacher_recommend.area
     */
    private Integer area;

    /**
     *  是否必须推荐,所属表字段为teacher_recommend.is_special
     */
    private Boolean isSpecial;

    /**
     *  开始时间,所属表字段为teacher_recommend.start_date
     */
    private Date startDate;

    /**
     *  结束时间,所属表字段为teacher_recommend.end_date
     */
    private Date endDate;

    /**
     *  开始时间点,所属表字段为teacher_recommend.start_time
     */
    private Date startTime;

    /**
     *  结束时间点,所属表字段为teacher_recommend.end_time
     */
    private Date endTime;

    /**
     *  周（1-7分别表示周一到周日）,所属表字段为teacher_recommend.days
     */
    private String days;

    /**
     * 获取 自增主键,
     * @return  id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增主键,id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 老师UID,
     * @return  uid
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置老师UID,uid
     * @param uid
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取 频道号SID,
     * @return  sid
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置频道号SID,sid
     * @param sid
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取 子频道号SSID,
     * @return  ssid
     */
    public Long getSsid() {
        return ssid;
    }

    /**
     * 设置子频道号SSID,ssid
     * @param ssid
     */
    public void setSsid(Long ssid) {
        this.ssid = ssid;
    }

    /**
     * 获取 频道标题,
     * @return  channel_title
     */
    public String getChannelTitle() {
        return channelTitle;
    }

    /**
     * 设置频道标题,channel_title
     * @param channelTitle
     */
    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle == null ? null : channelTitle.trim();
    }

    /**
     * 获取 频道海报,
     * @return  channel_cover_url
     */
    public String getChannelCoverUrl() {
        return channelCoverUrl;
    }

    /**
     * 设置频道海报,channel_cover_url
     * @param channelCoverUrl
     */
    public void setChannelCoverUrl(String channelCoverUrl) {
        this.channelCoverUrl = channelCoverUrl == null ? null : channelCoverUrl.trim();
    }

    /**
     * 获取 是否为频道推荐,
     * @return  is_channel_recommend
     */
    public Boolean getIsChannelRecommend() {
        return isChannelRecommend;
    }

    /**
     * 设置是否为频道推荐,is_channel_recommend
     * @param isChannelRecommend
     */
    public void setIsChannelRecommend(Boolean isChannelRecommend) {
        this.isChannelRecommend = isChannelRecommend;
    }

    /**
     * 获取 推荐区域,
     * @return  area
     */
    public Integer getArea() {
        return area;
    }

    /**
     * 设置推荐区域,area
     * @param area
     */
    public void setArea(Integer area) {
        this.area = area;
    }

    /**
     * 获取 是否必须推荐,
     * @return  is_special
     */
    public Boolean getIsSpecial() {
        return isSpecial;
    }

    /**
     * 设置是否必须推荐,is_special
     * @param isSpecial
     */
    public void setIsSpecial(Boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    /**
     * 获取 开始时间,
     * @return  start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始时间,start_date
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取 结束时间,
     * @return  end_date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束时间,end_date
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取 开始时间点,
     * @return  start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间点,start_time
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取 结束时间点,
     * @return  end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间点,end_time
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 周（1-7分别表示周一到周日）,
     * @return  days
     */
    public String getDays() {
        return days;
    }

    /**
     * 设置周（1-7分别表示周一到周日）,days
     * @param days
     */
    public void setDays(String days) {
        this.days = days == null ? null : days.trim();
    }
}