package com.test.mvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @Author zhouguanya
 * @Date 2018/12/16
 * @Description
 */
@XmlRootElement(name = "user")
public class User implements Serializable {
    private String userName;
    private int userAge;

    public String getUserName() {
        return userName;
    }
    @XmlElement
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }
    @XmlElement
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
