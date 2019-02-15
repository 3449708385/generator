package com.yishenxiao.usermanager.beans;

import java.math.BigDecimal;
import java.util.Date;

public class DistributionRecord {
    private Long id;

    private Date createtime;

    private Date updatetime;

    private String phone;

    private String nickname;

    private Integer distributionlevel;

    private BigDecimal molamount;

    private Long fromuserid;

    private Long userid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getDistributionlevel() {
        return distributionlevel;
    }

    public void setDistributionlevel(Integer distributionlevel) {
        this.distributionlevel = distributionlevel;
    }

    public BigDecimal getMolamount() {
        return molamount;
    }

    public void setMolamount(BigDecimal molamount) {
        this.molamount = molamount;
    }

    public Long getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(Long fromuserid) {
        this.fromuserid = fromuserid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}