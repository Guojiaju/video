package com.future.api.movie.domain;

import com.future.commons.domain.AbstractAuditingEntity;

public class Movie extends AbstractAuditingEntity{

    private String imgId;

    private String name;

    private String type;

    private String director;

    private String score;

    private String shortMessage;

    private String staror;

    private String area;

    private Integer productionYear;

    private String ownerId;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId == null ? null : imgId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage == null ? null : shortMessage.trim();
    }

    public String getStaror() {
        return staror;
    }

    public void setStaror(String staror) {
        this.staror = staror == null ? null : staror.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imgId=").append(imgId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", director=").append(director);
        sb.append(", score=").append(score);
        sb.append(", shortMessage=").append(shortMessage);
        sb.append(", staror=").append(staror);
        sb.append(", area=").append(area);
        sb.append(", productionYear=").append(productionYear);
        sb.append(", ownerId=").append(ownerId);
        sb.append("]");
        return sb.toString();
    }
}