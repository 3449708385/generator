package com.mgp.usermanager.pojo;

public class UserRole {
    private Long userrolerelationid;

    private Long relationuserid;

    private Long relationroleid;

    public Long getUserrolerelationid() {
        return userrolerelationid;
    }

    public void setUserrolerelationid(Long userrolerelationid) {
        this.userrolerelationid = userrolerelationid;
    }

    public Long getRelationuserid() {
        return relationuserid;
    }

    public void setRelationuserid(Long relationuserid) {
        this.relationuserid = relationuserid;
    }

    public Long getRelationroleid() {
        return relationroleid;
    }

    public void setRelationroleid(Long relationroleid) {
        this.relationroleid = relationroleid;
    }
}