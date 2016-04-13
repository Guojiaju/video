package com.future.api.resources.domain;

import com.future.commons.domain.AbstractAuditingEntity;

public class Resources extends AbstractAuditingEntity {

    private String resourceName;

    private String enable;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
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
        sb.append(", resourceName=").append(resourceName);
        sb.append(", enable=").append(enable);
        sb.append("]");
        return sb.toString();
    }
}