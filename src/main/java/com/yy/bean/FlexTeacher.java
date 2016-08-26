package com.yy.bean;

import java.util.Date;

public class FlexTeacher {
    /**
     *  主键，自增,所属表字段为flex_teacher.flex_teacher_id
     */
    private Long flexTeacherId;

    /**
     *  用户uid。唯一。不为空,所属表字段为flex_teacher.uid
     */
    private Long uid;

    /**
     *  用户yy号,所属表字段为flex_teacher.yy_num
     */
    private Long yyNum;

    /**
     *  yy昵称,所属表字段为flex_teacher.nick_name
     */
    private String nickName;

    /**
     *  运营自定义昵称,所属表字段为flex_teacher.diy_nick_name
     */
    private String diyNickName;

    /**
     *  是否启用运营自定义昵称。6: active, 8: inactive,所属表字段为flex_teacher.diy_nick_name_active
     */
    private Byte diyNickNameActive;

    /**
     *  yy用户头像url,所属表字段为flex_teacher.head_url
     */
    private String headUrl;

    /**
     *  运营自定义用户头像url,所属表字段为flex_teacher.diy_head_url
     */
    private String diyHeadUrl;

    /**
     *  是否启用运营自定义头像url。6: active, 8: inactive,所属表字段为flex_teacher.diy_head_url_active
     */
    private Byte diyHeadUrlActive;

    /**
     *  财经讲师的领域分类。stock: 股票, gold: 贵金属, other: 其他类别, undef: 暂时还没有被分类,所属表字段为flex_teacher.fin_type
     */
    private String finType;

    /**
     *  此讲师是否开播中。6:  在非加密频道开通(开播中), 7:在加密频道开播(加密中),8: 没有开播,所属表字段为flex_teacher.live_status
     */
    private Byte liveStatus;

    /**
     *  直播状态更新的类型，pc | task， pc 接口主动更新，task 定时更新。,所属表字段为flex_teacher.live_status_update_type
     */
    private String liveStatusUpdateType;

    /**
     *  直播状态最近一次被更新的时间。,所属表字段为flex_teacher.live_status_update_time
     */
    private Date liveStatusUpdateTime;

    /**
     *  直播的顶级频道号,所属表字段为flex_teacher.live_sid
     */
    private Long liveSid;

    /**
     *  直播的子频道号,所属表字段为flex_teacher.live_ssid
     */
    private Long liveSsid;

    /**
     *  live sid 的别名,所属表字段为flex_teacher.live_sid_alias
     */
    private Long liveSidAlias;

    /**
     *  直播的流标识，用于支持 h5 的播放,所属表字段为flex_teacher.stream_id
     */
    private String streamId;

    /**
     *  观看直播的 ip 数。即频道的真实人气。,所属表字段为flex_teacher.ip_users
     */
    private Long ipUsers;

    /**
     *  直播的在线人数。即频道人气。,所属表字段为flex_teacher.live_population
     */
    private Long livePopulation;

    /**
     *  已开播时间。单位是分钟。,所属表字段为flex_teacher.live_time
     */
    private Integer liveTime;

    /**
     *  记录加入的时间点,所属表字段为flex_teacher.add_time
     */
    private Date addTime;

    /**
     *  记录被最后更新的时间点,所属表字段为flex_teacher.last_update_time
     */
    private Date lastUpdateTime;

    /**
     *  记录状态。6: active, 8: inactive, 9: deleted,所属表字段为flex_teacher.status
     */
    private Byte status;

    /**
     *  文本区域字段a(标题),所属表字段为flex_teacher.text_zone_a
     */
    private String textZoneA;

    /**
     *  文本区域字段b( 左标签),所属表字段为flex_teacher.text_zone_b
     */
    private String textZoneB;

    /**
     *  文本区域字段c(右标签),所属表字段为flex_teacher.text_zone_c
     */
    private String textZoneC;

    /**
     *  文本区域字段d(简介),所属表字段为flex_teacher.text_zone_d
     */
    private String textZoneD;

    /**
     *  文本区域字段e(讲师封面图片地址),所属表字段为flex_teacher.text_zone_e
     */
    private String textZoneE;

    /**
     *  文本区域字段f(推荐语),所属表字段为flex_teacher.text_zone_f
     */
    private String textZoneF;

    /**
     *  文本区域字段g(大直播海报),所属表字段为flex_teacher.text_zone_g
     */
    private String textZoneG;

    /**
     *  文本区域字段h（讲师分类默认海报）,所属表字段为flex_teacher.text_zone_h
     */
    private String textZoneH;

    /**
     *  数字区域字段a,所属表字段为flex_teacher.num_zone_a
     */
    private Long numZoneA;

    /**
     *  数字区域字段b(头条卡的活动榜单名次),所属表字段为flex_teacher.num_zone_b
     */
    private Long numZoneB;

    /**
     *  备注,所属表字段为flex_teacher.description
     */
    private String description;

    /**
     *  最近一次直播时的所在频道名称,所属表字段为flex_teacher.live_channel_name
     */
    private String liveChannelName;

    /**
     *  最近一次直播时所在子频道的名称,所属表字段为flex_teacher.live_sub_channel_name
     */
    private String liveSubChannelName;

    /**
     *  同步讲师成长体系数据：讲师当前成长值,所属表字段为flex_teacher.grow
     */
    private Long grow;

    /**
     *  同步讲师成长体系数据：讲师下一级所需成长值,所属表字段为flex_teacher.next_grow
     */
    private Long nextGrow;

    /**
     *  同步讲师成长体系数据：讲师当前级别,所属表字段为flex_teacher.level
     */
    private Integer level;

    /**
     *  同步讲师成长体系数据：讲师当前级别的头衔,所属表字段为flex_teacher.level_title
     */
    private String levelTitle;

    /**
     *  直播单张截图,所属表字段为flex_teacher.live_thumb
     */
    private String liveThumb;

    /**
     *  直播三屏截图,格式:url|url|url,所属表字段为flex_teacher.live_multi_screen
     */
    private String liveMultiScreen;

    /**
     *  是否使用默认的封面, 1 是,其他 否,所属表字段为flex_teacher.cover_status
     */
    private Byte coverStatus;

    /**
     *  讲师签约的频道,所属表字段为flex_teacher.contract_sid
     */
    private Long contractSid;

    /**
     *  讲师签约频道短号,所属表字段为flex_teacher.contract_sid_alias
     */
    private Long contractSidAlias;

    /**
     *  异步社区昵称,所属表字段为flex_teacher.social_nick_name
     */
    private String socialNickName;

    /**
     *  异步社区简介,所属表字段为flex_teacher.social_introduction
     */
    private String socialIntroduction;

    /**
     *  异步社区头像,所属表字段为flex_teacher.social_head_url
     */
    private String socialHeadUrl;

    /**
     *  首页对应页卡 id,所属表字段为flex_teacher.page_tag_id
     */
    private Long pageTagId;

    /**
     *  订阅数量,所属表字段为flex_teacher.fans_count
     */
    private Integer fansCount;

    /**
     *  徒弟数量,所属表字段为flex_teacher.apprentice_count
     */
    private Long apprenticeCount;

    /**
     *  真实姓名,所属表字段为flex_teacher.real_name
     */
    private String realName;

    /**
     *  ,所属表字段为flex_teacher.real_name_md5
     */
    private String realNameMd5;

    /**
     *  ,所属表字段为flex_teacher.id_card_num_md5
     */
    private String idCardNumMd5;

    /**
     *  身份证号,所属表字段为flex_teacher.id_card_num
     */
    private String idCardNum;

    /**
     *  性别：1男，2女,所属表字段为flex_teacher.gender
     */
    private String gender;

    /**
     *  ,所属表字段为flex_teacher.mobile_phone
     */
    private String mobilePhone;

    /**
     *  邮箱,所属表字段为flex_teacher.mail
     */
    private String mail;

    /**
     *  执证编号,所属表字段为flex_teacher.cert_no
     */
    private String certNo;

    /**
     *  执证类型:1一般证券业务 2证券经纪业务营销 3证券经纪人 4证券投资咨询业务(分析师) 5证券投资咨询业务(投资顾问) 6证券投资咨询业务(其他),所属表字段为flex_teacher.cert_type
     */
    private String certType;

    /**
     *  职业：security 证券，fund 基金，future 期货，other 其他,所属表字段为flex_teacher.profession
     */
    private String profession;

    /**
     *  就职所在地,所属表字段为flex_teacher.address
     */
    private String address;

    /**
     *  从业年限：0_3:3年以下，3_5:3~5年 ，5_10:5~10年,10_ 10年以上,所属表字段为flex_teacher.work_year
     */
    private String workYear;

    /**
     *  是否申请视频直播权限:no否yes有,所属表字段为flex_teacher.is_apply_live
     */
    private String isApplyLive;

    /**
     *  直播上线实际生效人数,所属表字段为flex_teacher.live_actual_num
     */
    private Integer liveActualNum;

    /**
     *  直播间人数上限,所属表字段为flex_teacher.live_max_num
     */
    private Integer liveMaxNum;

    /**
     *  成为投顾的日期,所属表字段为flex_teacher.tougu_time
     */
    private Date touguTime;

    /**
     *  对应的公司 id,所属表字段为flex_teacher.tougu_company_id
     */
    private Long touguCompanyId;

    /**
     *  是否申请投资策略权限no否yes是,所属表字段为flex_teacher.is_apply_strategy
     */
    private String isApplyStrategy;

    /**
     *  实名验证no否yes是,所属表字段为flex_teacher.is_name_auth
     */
    private String isNameAuth;

    /**
     *  提现验证no否yes是,所属表字段为flex_teacher.is_cash_auth
     */
    private String isCashAuth;

    /**
     *  是否被推荐，即当前讲师在 teacher_rel_rm_zone 是否存在有效记录,所属表字段为flex_teacher.is_recommend
     */
    private Boolean isRecommend;

    /**
     *  徒弟总数,所属表字段为flex_teacher.apprentice_all_count
     */
    private Long apprenticeAllCount;

    /**
     *  是否在后备推荐区,所属表字段为flex_teacher.is_in_back_show_zone
     */
    private Boolean isInBackShowZone;

    /**
     *  ,所属表字段为flex_teacher.last_gold_time
     */
    private Date lastGoldTime;

    /**
     *  ,所属表字段为flex_teacher.apply_live_time
     */
    private Date applyLiveTime;

    /**
     *  是否金牌投顾no否yes是,所属表字段为flex_teacher.is_gold_medal_teacher
     */
    private String isGoldMedalTeacher;

    /**
     * 获取 主键，自增,
     * @return  flex_teacher_id
     */
    public Long getFlexTeacherId() {
        return flexTeacherId;
    }

    /**
     * 设置主键，自增,flex_teacher_id
     * @param flexTeacherId
     */
    public void setFlexTeacherId(Long flexTeacherId) {
        this.flexTeacherId = flexTeacherId;
    }

    /**
     * 获取 用户uid。唯一。不为空,
     * @return  uid
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置用户uid。唯一。不为空,uid
     * @param uid
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取 用户yy号,
     * @return  yy_num
     */
    public Long getYyNum() {
        return yyNum;
    }

    /**
     * 设置用户yy号,yy_num
     * @param yyNum
     */
    public void setYyNum(Long yyNum) {
        this.yyNum = yyNum;
    }

    /**
     * 获取 yy昵称,
     * @return  nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置yy昵称,nick_name
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取 运营自定义昵称,
     * @return  diy_nick_name
     */
    public String getDiyNickName() {
        return diyNickName;
    }

    /**
     * 设置运营自定义昵称,diy_nick_name
     * @param diyNickName
     */
    public void setDiyNickName(String diyNickName) {
        this.diyNickName = diyNickName == null ? null : diyNickName.trim();
    }

    /**
     * 获取 是否启用运营自定义昵称。6: active, 8: inactive,
     * @return  diy_nick_name_active
     */
    public Byte getDiyNickNameActive() {
        return diyNickNameActive;
    }

    /**
     * 设置是否启用运营自定义昵称。6: active, 8: inactive,diy_nick_name_active
     * @param diyNickNameActive
     */
    public void setDiyNickNameActive(Byte diyNickNameActive) {
        this.diyNickNameActive = diyNickNameActive;
    }

    /**
     * 获取 yy用户头像url,
     * @return  head_url
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * 设置yy用户头像url,head_url
     * @param headUrl
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * 获取 运营自定义用户头像url,
     * @return  diy_head_url
     */
    public String getDiyHeadUrl() {
        return diyHeadUrl;
    }

    /**
     * 设置运营自定义用户头像url,diy_head_url
     * @param diyHeadUrl
     */
    public void setDiyHeadUrl(String diyHeadUrl) {
        this.diyHeadUrl = diyHeadUrl == null ? null : diyHeadUrl.trim();
    }

    /**
     * 获取 是否启用运营自定义头像url。6: active, 8: inactive,
     * @return  diy_head_url_active
     */
    public Byte getDiyHeadUrlActive() {
        return diyHeadUrlActive;
    }

    /**
     * 设置是否启用运营自定义头像url。6: active, 8: inactive,diy_head_url_active
     * @param diyHeadUrlActive
     */
    public void setDiyHeadUrlActive(Byte diyHeadUrlActive) {
        this.diyHeadUrlActive = diyHeadUrlActive;
    }

    /**
     * 获取 财经讲师的领域分类。stock: 股票, gold: 贵金属, other: 其他类别, undef: 暂时还没有被分类,
     * @return  fin_type
     */
    public String getFinType() {
        return finType;
    }

    /**
     * 设置财经讲师的领域分类。stock: 股票, gold: 贵金属, other: 其他类别, undef: 暂时还没有被分类,fin_type
     * @param finType
     */
    public void setFinType(String finType) {
        this.finType = finType == null ? null : finType.trim();
    }

    /**
     * 获取 此讲师是否开播中。6:  在非加密频道开通(开播中), 7:在加密频道开播(加密中),8: 没有开播,
     * @return  live_status
     */
    public Byte getLiveStatus() {
        return liveStatus;
    }

    /**
     * 设置此讲师是否开播中。6:  在非加密频道开通(开播中), 7:在加密频道开播(加密中),8: 没有开播,live_status
     * @param liveStatus
     */
    public void setLiveStatus(Byte liveStatus) {
        this.liveStatus = liveStatus;
    }

    /**
     * 获取 直播状态更新的类型，pc | task， pc 接口主动更新，task 定时更新。,
     * @return  live_status_update_type
     */
    public String getLiveStatusUpdateType() {
        return liveStatusUpdateType;
    }

    /**
     * 设置直播状态更新的类型，pc | task， pc 接口主动更新，task 定时更新。,live_status_update_type
     * @param liveStatusUpdateType
     */
    public void setLiveStatusUpdateType(String liveStatusUpdateType) {
        this.liveStatusUpdateType = liveStatusUpdateType == null ? null : liveStatusUpdateType.trim();
    }

    /**
     * 获取 直播状态最近一次被更新的时间。,
     * @return  live_status_update_time
     */
    public Date getLiveStatusUpdateTime() {
        return liveStatusUpdateTime;
    }

    /**
     * 设置直播状态最近一次被更新的时间。,live_status_update_time
     * @param liveStatusUpdateTime
     */
    public void setLiveStatusUpdateTime(Date liveStatusUpdateTime) {
        this.liveStatusUpdateTime = liveStatusUpdateTime;
    }

    /**
     * 获取 直播的顶级频道号,
     * @return  live_sid
     */
    public Long getLiveSid() {
        return liveSid;
    }

    /**
     * 设置直播的顶级频道号,live_sid
     * @param liveSid
     */
    public void setLiveSid(Long liveSid) {
        this.liveSid = liveSid;
    }

    /**
     * 获取 直播的子频道号,
     * @return  live_ssid
     */
    public Long getLiveSsid() {
        return liveSsid;
    }

    /**
     * 设置直播的子频道号,live_ssid
     * @param liveSsid
     */
    public void setLiveSsid(Long liveSsid) {
        this.liveSsid = liveSsid;
    }

    /**
     * 获取 live sid 的别名,
     * @return  live_sid_alias
     */
    public Long getLiveSidAlias() {
        return liveSidAlias;
    }

    /**
     * 设置live sid 的别名,live_sid_alias
     * @param liveSidAlias
     */
    public void setLiveSidAlias(Long liveSidAlias) {
        this.liveSidAlias = liveSidAlias;
    }

    /**
     * 获取 直播的流标识，用于支持 h5 的播放,
     * @return  stream_id
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * 设置直播的流标识，用于支持 h5 的播放,stream_id
     * @param streamId
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId == null ? null : streamId.trim();
    }

    /**
     * 获取 观看直播的 ip 数。即频道的真实人气。,
     * @return  ip_users
     */
    public Long getIpUsers() {
        return ipUsers;
    }

    /**
     * 设置观看直播的 ip 数。即频道的真实人气。,ip_users
     * @param ipUsers
     */
    public void setIpUsers(Long ipUsers) {
        this.ipUsers = ipUsers;
    }

    /**
     * 获取 直播的在线人数。即频道人气。,
     * @return  live_population
     */
    public Long getLivePopulation() {
        return livePopulation;
    }

    /**
     * 设置直播的在线人数。即频道人气。,live_population
     * @param livePopulation
     */
    public void setLivePopulation(Long livePopulation) {
        this.livePopulation = livePopulation;
    }

    /**
     * 获取 已开播时间。单位是分钟。,
     * @return  live_time
     */
    public Integer getLiveTime() {
        return liveTime;
    }

    /**
     * 设置已开播时间。单位是分钟。,live_time
     * @param liveTime
     */
    public void setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
    }

    /**
     * 获取 记录加入的时间点,
     * @return  add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置记录加入的时间点,add_time
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取 记录被最后更新的时间点,
     * @return  last_update_time
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置记录被最后更新的时间点,last_update_time
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 获取 记录状态。6: active, 8: inactive, 9: deleted,
     * @return  status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置记录状态。6: active, 8: inactive, 9: deleted,status
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取 文本区域字段a(标题),
     * @return  text_zone_a
     */
    public String getTextZoneA() {
        return textZoneA;
    }

    /**
     * 设置文本区域字段a(标题),text_zone_a
     * @param textZoneA
     */
    public void setTextZoneA(String textZoneA) {
        this.textZoneA = textZoneA == null ? null : textZoneA.trim();
    }

    /**
     * 获取 文本区域字段b( 左标签),
     * @return  text_zone_b
     */
    public String getTextZoneB() {
        return textZoneB;
    }

    /**
     * 设置文本区域字段b( 左标签),text_zone_b
     * @param textZoneB
     */
    public void setTextZoneB(String textZoneB) {
        this.textZoneB = textZoneB == null ? null : textZoneB.trim();
    }

    /**
     * 获取 文本区域字段c(右标签),
     * @return  text_zone_c
     */
    public String getTextZoneC() {
        return textZoneC;
    }

    /**
     * 设置文本区域字段c(右标签),text_zone_c
     * @param textZoneC
     */
    public void setTextZoneC(String textZoneC) {
        this.textZoneC = textZoneC == null ? null : textZoneC.trim();
    }

    /**
     * 获取 文本区域字段d(简介),
     * @return  text_zone_d
     */
    public String getTextZoneD() {
        return textZoneD;
    }

    /**
     * 设置文本区域字段d(简介),text_zone_d
     * @param textZoneD
     */
    public void setTextZoneD(String textZoneD) {
        this.textZoneD = textZoneD == null ? null : textZoneD.trim();
    }

    /**
     * 获取 文本区域字段e(讲师封面图片地址),
     * @return  text_zone_e
     */
    public String getTextZoneE() {
        return textZoneE;
    }

    /**
     * 设置文本区域字段e(讲师封面图片地址),text_zone_e
     * @param textZoneE
     */
    public void setTextZoneE(String textZoneE) {
        this.textZoneE = textZoneE == null ? null : textZoneE.trim();
    }

    /**
     * 获取 文本区域字段f(推荐语),
     * @return  text_zone_f
     */
    public String getTextZoneF() {
        return textZoneF;
    }

    /**
     * 设置文本区域字段f(推荐语),text_zone_f
     * @param textZoneF
     */
    public void setTextZoneF(String textZoneF) {
        this.textZoneF = textZoneF == null ? null : textZoneF.trim();
    }

    /**
     * 获取 文本区域字段g(大直播海报),
     * @return  text_zone_g
     */
    public String getTextZoneG() {
        return textZoneG;
    }

    /**
     * 设置文本区域字段g(大直播海报),text_zone_g
     * @param textZoneG
     */
    public void setTextZoneG(String textZoneG) {
        this.textZoneG = textZoneG == null ? null : textZoneG.trim();
    }

    /**
     * 获取 文本区域字段h（讲师分类默认海报）,
     * @return  text_zone_h
     */
    public String getTextZoneH() {
        return textZoneH;
    }

    /**
     * 设置文本区域字段h（讲师分类默认海报）,text_zone_h
     * @param textZoneH
     */
    public void setTextZoneH(String textZoneH) {
        this.textZoneH = textZoneH == null ? null : textZoneH.trim();
    }

    /**
     * 获取 数字区域字段a,
     * @return  num_zone_a
     */
    public Long getNumZoneA() {
        return numZoneA;
    }

    /**
     * 设置数字区域字段a,num_zone_a
     * @param numZoneA
     */
    public void setNumZoneA(Long numZoneA) {
        this.numZoneA = numZoneA;
    }

    /**
     * 获取 数字区域字段b(头条卡的活动榜单名次),
     * @return  num_zone_b
     */
    public Long getNumZoneB() {
        return numZoneB;
    }

    /**
     * 设置数字区域字段b(头条卡的活动榜单名次),num_zone_b
     * @param numZoneB
     */
    public void setNumZoneB(Long numZoneB) {
        this.numZoneB = numZoneB;
    }

    /**
     * 获取 备注,
     * @return  description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置备注,description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取 最近一次直播时的所在频道名称,
     * @return  live_channel_name
     */
    public String getLiveChannelName() {
        return liveChannelName;
    }

    /**
     * 设置最近一次直播时的所在频道名称,live_channel_name
     * @param liveChannelName
     */
    public void setLiveChannelName(String liveChannelName) {
        this.liveChannelName = liveChannelName == null ? null : liveChannelName.trim();
    }

    /**
     * 获取 最近一次直播时所在子频道的名称,
     * @return  live_sub_channel_name
     */
    public String getLiveSubChannelName() {
        return liveSubChannelName;
    }

    /**
     * 设置最近一次直播时所在子频道的名称,live_sub_channel_name
     * @param liveSubChannelName
     */
    public void setLiveSubChannelName(String liveSubChannelName) {
        this.liveSubChannelName = liveSubChannelName == null ? null : liveSubChannelName.trim();
    }

    /**
     * 获取 同步讲师成长体系数据：讲师当前成长值,
     * @return  grow
     */
    public Long getGrow() {
        return grow;
    }

    /**
     * 设置同步讲师成长体系数据：讲师当前成长值,grow
     * @param grow
     */
    public void setGrow(Long grow) {
        this.grow = grow;
    }

    /**
     * 获取 同步讲师成长体系数据：讲师下一级所需成长值,
     * @return  next_grow
     */
    public Long getNextGrow() {
        return nextGrow;
    }

    /**
     * 设置同步讲师成长体系数据：讲师下一级所需成长值,next_grow
     * @param nextGrow
     */
    public void setNextGrow(Long nextGrow) {
        this.nextGrow = nextGrow;
    }

    /**
     * 获取 同步讲师成长体系数据：讲师当前级别,
     * @return  level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置同步讲师成长体系数据：讲师当前级别,level
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取 同步讲师成长体系数据：讲师当前级别的头衔,
     * @return  level_title
     */
    public String getLevelTitle() {
        return levelTitle;
    }

    /**
     * 设置同步讲师成长体系数据：讲师当前级别的头衔,level_title
     * @param levelTitle
     */
    public void setLevelTitle(String levelTitle) {
        this.levelTitle = levelTitle == null ? null : levelTitle.trim();
    }

    /**
     * 获取 直播单张截图,
     * @return  live_thumb
     */
    public String getLiveThumb() {
        return liveThumb;
    }

    /**
     * 设置直播单张截图,live_thumb
     * @param liveThumb
     */
    public void setLiveThumb(String liveThumb) {
        this.liveThumb = liveThumb == null ? null : liveThumb.trim();
    }

    /**
     * 获取 直播三屏截图,格式:url|url|url,
     * @return  live_multi_screen
     */
    public String getLiveMultiScreen() {
        return liveMultiScreen;
    }

    /**
     * 设置直播三屏截图,格式:url|url|url,live_multi_screen
     * @param liveMultiScreen
     */
    public void setLiveMultiScreen(String liveMultiScreen) {
        this.liveMultiScreen = liveMultiScreen == null ? null : liveMultiScreen.trim();
    }

    /**
     * 获取 是否使用默认的封面, 1 是,其他 否,
     * @return  cover_status
     */
    public Byte getCoverStatus() {
        return coverStatus;
    }

    /**
     * 设置是否使用默认的封面, 1 是,其他 否,cover_status
     * @param coverStatus
     */
    public void setCoverStatus(Byte coverStatus) {
        this.coverStatus = coverStatus;
    }

    /**
     * 获取 讲师签约的频道,
     * @return  contract_sid
     */
    public Long getContractSid() {
        return contractSid;
    }

    /**
     * 设置讲师签约的频道,contract_sid
     * @param contractSid
     */
    public void setContractSid(Long contractSid) {
        this.contractSid = contractSid;
    }

    /**
     * 获取 讲师签约频道短号,
     * @return  contract_sid_alias
     */
    public Long getContractSidAlias() {
        return contractSidAlias;
    }

    /**
     * 设置讲师签约频道短号,contract_sid_alias
     * @param contractSidAlias
     */
    public void setContractSidAlias(Long contractSidAlias) {
        this.contractSidAlias = contractSidAlias;
    }

    /**
     * 获取 异步社区昵称,
     * @return  social_nick_name
     */
    public String getSocialNickName() {
        return socialNickName;
    }

    /**
     * 设置异步社区昵称,social_nick_name
     * @param socialNickName
     */
    public void setSocialNickName(String socialNickName) {
        this.socialNickName = socialNickName == null ? null : socialNickName.trim();
    }

    /**
     * 获取 异步社区简介,
     * @return  social_introduction
     */
    public String getSocialIntroduction() {
        return socialIntroduction;
    }

    /**
     * 设置异步社区简介,social_introduction
     * @param socialIntroduction
     */
    public void setSocialIntroduction(String socialIntroduction) {
        this.socialIntroduction = socialIntroduction == null ? null : socialIntroduction.trim();
    }

    /**
     * 获取 异步社区头像,
     * @return  social_head_url
     */
    public String getSocialHeadUrl() {
        return socialHeadUrl;
    }

    /**
     * 设置异步社区头像,social_head_url
     * @param socialHeadUrl
     */
    public void setSocialHeadUrl(String socialHeadUrl) {
        this.socialHeadUrl = socialHeadUrl == null ? null : socialHeadUrl.trim();
    }

    /**
     * 获取 首页对应页卡 id,
     * @return  page_tag_id
     */
    public Long getPageTagId() {
        return pageTagId;
    }

    /**
     * 设置首页对应页卡 id,page_tag_id
     * @param pageTagId
     */
    public void setPageTagId(Long pageTagId) {
        this.pageTagId = pageTagId;
    }

    /**
     * 获取 订阅数量,
     * @return  fans_count
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * 设置订阅数量,fans_count
     * @param fansCount
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * 获取 徒弟数量,
     * @return  apprentice_count
     */
    public Long getApprenticeCount() {
        return apprenticeCount;
    }

    /**
     * 设置徒弟数量,apprentice_count
     * @param apprenticeCount
     */
    public void setApprenticeCount(Long apprenticeCount) {
        this.apprenticeCount = apprenticeCount;
    }

    /**
     * 获取 真实姓名,
     * @return  real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名,real_name
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取 ,
     * @return  real_name_md5
     */
    public String getRealNameMd5() {
        return realNameMd5;
    }

    /**
     * 设置,real_name_md5
     * @param realNameMd5
     */
    public void setRealNameMd5(String realNameMd5) {
        this.realNameMd5 = realNameMd5 == null ? null : realNameMd5.trim();
    }

    /**
     * 获取 ,
     * @return  id_card_num_md5
     */
    public String getIdCardNumMd5() {
        return idCardNumMd5;
    }

    /**
     * 设置,id_card_num_md5
     * @param idCardNumMd5
     */
    public void setIdCardNumMd5(String idCardNumMd5) {
        this.idCardNumMd5 = idCardNumMd5 == null ? null : idCardNumMd5.trim();
    }

    /**
     * 获取 身份证号,
     * @return  id_card_num
     */
    public String getIdCardNum() {
        return idCardNum;
    }

    /**
     * 设置身份证号,id_card_num
     * @param idCardNum
     */
    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum == null ? null : idCardNum.trim();
    }

    /**
     * 获取 性别：1男，2女,
     * @return  gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别：1男，2女,gender
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取 ,
     * @return  mobile_phone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置,mobile_phone
     * @param mobilePhone
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    /**
     * 获取 邮箱,
     * @return  mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置邮箱,mail
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * 获取 执证编号,
     * @return  cert_no
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置执证编号,cert_no
     * @param certNo
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * 获取 执证类型:1一般证券业务 2证券经纪业务营销 3证券经纪人 4证券投资咨询业务(分析师) 5证券投资咨询业务(投资顾问) 6证券投资咨询业务(其他),
     * @return  cert_type
     */
    public String getCertType() {
        return certType;
    }

    /**
     * 设置执证类型:1一般证券业务 2证券经纪业务营销 3证券经纪人 4证券投资咨询业务(分析师) 5证券投资咨询业务(投资顾问) 6证券投资咨询业务(其他),cert_type
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * 获取 职业：security 证券，fund 基金，future 期货，other 其他,
     * @return  profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * 设置职业：security 证券，fund 基金，future 期货，other 其他,profession
     * @param profession
     */
    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    /**
     * 获取 就职所在地,
     * @return  address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置就职所在地,address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取 从业年限：0_3:3年以下，3_5:3~5年 ，5_10:5~10年,10_ 10年以上,
     * @return  work_year
     */
    public String getWorkYear() {
        return workYear;
    }

    /**
     * 设置从业年限：0_3:3年以下，3_5:3~5年 ，5_10:5~10年,10_ 10年以上,work_year
     * @param workYear
     */
    public void setWorkYear(String workYear) {
        this.workYear = workYear == null ? null : workYear.trim();
    }

    /**
     * 获取 是否申请视频直播权限:no否yes有,
     * @return  is_apply_live
     */
    public String getIsApplyLive() {
        return isApplyLive;
    }

    /**
     * 设置是否申请视频直播权限:no否yes有,is_apply_live
     * @param isApplyLive
     */
    public void setIsApplyLive(String isApplyLive) {
        this.isApplyLive = isApplyLive == null ? null : isApplyLive.trim();
    }

    /**
     * 获取 直播上线实际生效人数,
     * @return  live_actual_num
     */
    public Integer getLiveActualNum() {
        return liveActualNum;
    }

    /**
     * 设置直播上线实际生效人数,live_actual_num
     * @param liveActualNum
     */
    public void setLiveActualNum(Integer liveActualNum) {
        this.liveActualNum = liveActualNum;
    }

    /**
     * 获取 直播间人数上限,
     * @return  live_max_num
     */
    public Integer getLiveMaxNum() {
        return liveMaxNum;
    }

    /**
     * 设置直播间人数上限,live_max_num
     * @param liveMaxNum
     */
    public void setLiveMaxNum(Integer liveMaxNum) {
        this.liveMaxNum = liveMaxNum;
    }

    /**
     * 获取 成为投顾的日期,
     * @return  tougu_time
     */
    public Date getTouguTime() {
        return touguTime;
    }

    /**
     * 设置成为投顾的日期,tougu_time
     * @param touguTime
     */
    public void setTouguTime(Date touguTime) {
        this.touguTime = touguTime;
    }

    /**
     * 获取 对应的公司 id,
     * @return  tougu_company_id
     */
    public Long getTouguCompanyId() {
        return touguCompanyId;
    }

    /**
     * 设置对应的公司 id,tougu_company_id
     * @param touguCompanyId
     */
    public void setTouguCompanyId(Long touguCompanyId) {
        this.touguCompanyId = touguCompanyId;
    }

    /**
     * 获取 是否申请投资策略权限no否yes是,
     * @return  is_apply_strategy
     */
    public String getIsApplyStrategy() {
        return isApplyStrategy;
    }

    /**
     * 设置是否申请投资策略权限no否yes是,is_apply_strategy
     * @param isApplyStrategy
     */
    public void setIsApplyStrategy(String isApplyStrategy) {
        this.isApplyStrategy = isApplyStrategy == null ? null : isApplyStrategy.trim();
    }

    /**
     * 获取 实名验证no否yes是,
     * @return  is_name_auth
     */
    public String getIsNameAuth() {
        return isNameAuth;
    }

    /**
     * 设置实名验证no否yes是,is_name_auth
     * @param isNameAuth
     */
    public void setIsNameAuth(String isNameAuth) {
        this.isNameAuth = isNameAuth == null ? null : isNameAuth.trim();
    }

    /**
     * 获取 提现验证no否yes是,
     * @return  is_cash_auth
     */
    public String getIsCashAuth() {
        return isCashAuth;
    }

    /**
     * 设置提现验证no否yes是,is_cash_auth
     * @param isCashAuth
     */
    public void setIsCashAuth(String isCashAuth) {
        this.isCashAuth = isCashAuth == null ? null : isCashAuth.trim();
    }

    /**
     * 获取 是否被推荐，即当前讲师在 teacher_rel_rm_zone 是否存在有效记录,
     * @return  is_recommend
     */
    public Boolean getIsRecommend() {
        return isRecommend;
    }

    /**
     * 设置是否被推荐，即当前讲师在 teacher_rel_rm_zone 是否存在有效记录,is_recommend
     * @param isRecommend
     */
    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    /**
     * 获取 徒弟总数,
     * @return  apprentice_all_count
     */
    public Long getApprenticeAllCount() {
        return apprenticeAllCount;
    }

    /**
     * 设置徒弟总数,apprentice_all_count
     * @param apprenticeAllCount
     */
    public void setApprenticeAllCount(Long apprenticeAllCount) {
        this.apprenticeAllCount = apprenticeAllCount;
    }

    /**
     * 获取 是否在后备推荐区,
     * @return  is_in_back_show_zone
     */
    public Boolean getIsInBackShowZone() {
        return isInBackShowZone;
    }

    /**
     * 设置是否在后备推荐区,is_in_back_show_zone
     * @param isInBackShowZone
     */
    public void setIsInBackShowZone(Boolean isInBackShowZone) {
        this.isInBackShowZone = isInBackShowZone;
    }

    /**
     * 获取 ,
     * @return  last_gold_time
     */
    public Date getLastGoldTime() {
        return lastGoldTime;
    }

    /**
     * 设置,last_gold_time
     * @param lastGoldTime
     */
    public void setLastGoldTime(Date lastGoldTime) {
        this.lastGoldTime = lastGoldTime;
    }

    /**
     * 获取 ,
     * @return  apply_live_time
     */
    public Date getApplyLiveTime() {
        return applyLiveTime;
    }

    /**
     * 设置,apply_live_time
     * @param applyLiveTime
     */
    public void setApplyLiveTime(Date applyLiveTime) {
        this.applyLiveTime = applyLiveTime;
    }

    /**
     * 获取 是否金牌投顾no否yes是,
     * @return  is_gold_medal_teacher
     */
    public String getIsGoldMedalTeacher() {
        return isGoldMedalTeacher;
    }

    /**
     * 设置是否金牌投顾no否yes是,is_gold_medal_teacher
     * @param isGoldMedalTeacher
     */
    public void setIsGoldMedalTeacher(String isGoldMedalTeacher) {
        this.isGoldMedalTeacher = isGoldMedalTeacher == null ? null : isGoldMedalTeacher.trim();
    }
}