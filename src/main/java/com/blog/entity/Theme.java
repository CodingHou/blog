package com.blog.entity;

import java.time.LocalDateTime;
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
 * @since 2019-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Theme implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String state;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String image;


}
