package com.example.dataunificationclient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sajjadpervaiz
 */
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "twiiter_Id")
    private Long twitterId;

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(Long twitterId) {
        this.twitterId = twitterId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", twitterId=" + twitterId +
                '}';
    }
}
