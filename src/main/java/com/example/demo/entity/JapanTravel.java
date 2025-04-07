package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/**
 * JapanTravel情報 Entity
 */
@Entity
@Data
@Table(name = "travel")
public class JapanTravel {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 地名
     */
    @Column(name = "location_name")
    private String locationName;

    /**
     * 訪問済みかどうか
     */
    @Column(name = "visited")
    private Boolean visited;

    /**
     * 評価
     */
    @Column(name = "review")
    private String review;

    /**
     * 更新日時
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 登録日時
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 削除日時
     */
    @Column(name = "delete_date")
    private Date deleteDate;
}
