package com.codinghou.blog.entity;

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


}
