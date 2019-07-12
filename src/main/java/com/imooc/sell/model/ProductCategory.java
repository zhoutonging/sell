package com.imooc.sell.model;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目模型
 *
 * @author : ZHOUTONG
 * @date : 2019/7/8 09:14
 */
@Data
@Entity
@DynamicUpdate
public class ProductCategory {

    /**
     * 类目id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;

    @CreationTimestamp
    private Date createTime;

    private Date updateTime;
}
