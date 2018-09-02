package hello.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by mengliang on 2018/8/31.
 * Copyright (c) 2015年 Vipshop Holdings Limited. All rights reserved.
 */
@Entity
@Table(name = "pes_season")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer totalMatch;
    private Integer leftMatch;


    @OneToOne()
    @JoinColumn(name = "winner")
    private User winnerUser;


    @CreationTimestamp
    private LocalDateTime createTime;
    @UpdateTimestamp
    private LocalDateTime updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalMatch() {
        return totalMatch;
    }

    public void setTotalMatch(Integer totalMatch) {
        this.totalMatch = totalMatch;
    }

    public Integer getLeftMatch() {
        return leftMatch;
    }

    public void setLeftMatch(Integer leftMatch) {
        this.leftMatch = leftMatch;
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

    public User getWinnerUser() {
        return winnerUser;
    }

    public void setWinnerUser(User winnerUser) {
        this.winnerUser = winnerUser;
    }
}
