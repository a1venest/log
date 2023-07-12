package com.company.log.contract;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "LOG_CONTRACT")
@Entity(name = "log_Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 1640750155078176495L;

    @Column(name="NUMBER")
    public String number;

    @Column(name = "DATE")
    public Date date;

    @Column(name = "STATE")
    public String state;

    public String getNumber(){return number;}
    public void setNumber(String number){this.number = number;}

    public Date getDate(){return date;}
    public void setDate(Date date){this.date = date;}

    public String getState(){return state;}
    public void setState(String state){this.state = state;}
}