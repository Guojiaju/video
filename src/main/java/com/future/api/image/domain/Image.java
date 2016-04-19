package com.future.api.image.domain;

import com.future.commons.domain.AbstractAuditingEntity;

import java.io.Serializable;
import java.util.Date;

public class Image extends AbstractAuditingEntity {

    private String type;

    private String imageName;

    private String localPath;

    private String url;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath == null ? null : localPath.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", type=").append(type);
        sb.append(", imageName=").append(imageName);
        sb.append(", localPath=").append(localPath);
        sb.append(", url=").append(url);
        sb.append("]");
        return sb.toString();
    }
}