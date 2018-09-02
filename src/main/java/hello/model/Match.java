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
@Table(name = "pes_match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer seasonId;
    @OneToOne()
    @JoinColumn(name = "home")
    private User homeUser;
    @OneToOne()
    @JoinColumn(name = "away")
    private User awayUser;
    private Integer homeScore;
    private Integer awayScore;
    private Boolean finish;

    @CreationTimestamp
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;

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

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public User getHomeUser() {
        return homeUser;
    }

    public void setHomeUser(User homeUser) {
        this.homeUser = homeUser;
    }

    public User getAwayUser() {
        return awayUser;
    }

    public void setAwayUser(User awayUser) {
        this.awayUser = awayUser;
    }
}
