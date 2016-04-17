package com.future.api.movie.web.dto;

import com.future.commons.domain.AbstractAuditingEntity;

/**
 * MovieDto
 *
 * @author Eric.guo
 * @date 2016/4/16 19:16
 */
public class MovieDto extends AbstractAuditingEntity{

    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public String getStaror() {
        return staror;
    }

    public void setStaror(String staror) {
        this.staror = staror;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
        this.ownerId = ownerId;
    }
}
