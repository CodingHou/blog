package com.blog.entity;

import java.time.LocalDateTime;
import java.sql.Blob;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author codinghou
 * @since 2019-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer theme;

    private Blob markdownValue;

    private Blob htmlValue;

    private Integer state;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public Blob getMarkdownValue() {
        return markdownValue;
    }

    public void setMarkdownValue(Blob markdownValue) {
        this.markdownValue = markdownValue;
    }

    public Blob getHtmlValue() {
        return htmlValue;
    }

    public void setHtmlValue(Blob htmlValue) {
        this.htmlValue = htmlValue;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
