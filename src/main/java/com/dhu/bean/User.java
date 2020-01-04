package com.dhu.bean;

public class User {
    private String userid;

    private String username;

    private String userpassword;

    private String usergender;

    private String userphone;

    private String userstatus;

    private String userimage;

    private String usermajor;

    private String useremail;

    private String usertoken;

    private String status;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsergender() {
        return usergender;
    }

    public void setUsergender(String usergender) {
        this.usergender = usergender == null ? null : usergender.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus == null ? null : userstatus.trim();
    }

    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage == null ? null : userimage.trim();
    }

    public String getUsermajor() {
        return usermajor;
    }

    public void setUsermajor(String usermajor) {
        this.usermajor = usermajor == null ? null : usermajor.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUsertoken() {
        return usertoken;
    }

    public void setUsertoken(String usertoken) {
        this.usertoken = usertoken == null ? null : usertoken.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {

        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString()//这个函数为了输出的是一个能让人们读懂的实体类
    {
        return "User [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + ", usergender="
                + usergender + ", userphone=" + userphone + ", userstatus=" + userstatus + ", userimage=" + userimage +
                ", usermajor=" + usermajor + ", useremail=" + useremail + ", usertoken=" + usertoken + "status=" + status + "]";
    }

}