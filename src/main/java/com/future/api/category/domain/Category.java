package com.future.api.category.domain;

import com.future.commons.domain.AbstractAuditingEntity;

public class Category extends AbstractAuditingEntity {

    private String categoryName;

    private String parentId;

    private String enable;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
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
        sb.append(", categoryName=").append(categoryName);
        sb.append(", parentId=").append(parentId);
        sb.append(", enable=").append(enable);
        sb.append("]");
        return sb.toString();
    }
}