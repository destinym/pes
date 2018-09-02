package hello.model;

import javax.persistence.*;

/**
 * Created by mengliang on 2018/8/31.
 * Copyright (c) 2015年 Vipshop Holdings Limited. All rights reserved.
 */


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "pes_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;

//    @OneToOne(mappedBy = "winnerUser")
//    private Season season;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public Season getSeason() {
//        return season;
//    }
//
//    public void setSeason(Season season) {
//        this.season = season;
//    }
}