package com.mgp.usermanager.pojo;

import java.util.Date;

public class Role {
    private Long roleid;

    private String rolename;

    private String roledesc;

    private Date rolecreatetime;

    private Date rolemodifiedtime;

    private Integer rolestatus;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }

    public Date getRolecreatetime() {
        return rolecreatetime;
    }

    public void setRolecreatetime(Date rolecreatetime) {
        this.rolecreatetime = rolecreatetime;
    }

    public Date getRolemodifiedtime() {
        return rolemodifiedtime;
    }

    public void setRolemodifiedtime(Date rolemodifiedtime) {
        this.rolemodifiedtime = rolemodifiedtime;
    }

    public Integer getRolestatus() {
        return rolestatus;
    }

    public void setRolestatus(Integer rolestatus) {
        this.rolestatus = rolestatus;
    }
}