package com.future.api.role.domain;

import com.future.commons.domain.AbstractAuditingEntity;

public class Role extends AbstractAuditingEntity {

    private String roleName;

    private String enable;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleName=").append(roleName);
        sb.append(", enable=").append(enable);
        sb.append("]");
        return sb.toString();
    }
}