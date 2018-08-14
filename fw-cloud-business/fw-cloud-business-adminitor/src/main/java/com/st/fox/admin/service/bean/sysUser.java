package com.st.fox.admin.service.bean;

/**
 * Created by project1 on 2018/8/14.
 */
public class sysUser {

   private String oldpass;
   private String newpass;

    public void setOldpass(String oldpass) {
        this.oldpass = oldpass;
    }

    public void setNewpass(String newpass) {
        this.newpass = newpass;
    }

    public String getOldpass() {
        return oldpass;
    }

    public String getNewpass() {
        return newpass;
    }
}
