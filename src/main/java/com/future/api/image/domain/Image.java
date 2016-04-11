package com.future.api.image.domain;

import com.future.commons.domain.AbstractAuditingEntity;

import java.io.Serializable;
import java.util.Date;

public class Image extends AbstractAuditingEntity {

    private String localPath;

    private String url;

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
        sb.append(", localPath=").append(localPath);
        sb.append(", url=").append(url);
        sb.append("]");
        return sb.toString();
    }
}