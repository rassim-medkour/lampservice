package com.al.lamp.lampservice.web.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Lamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean state;
    private Date updatetime;

    public Lamp(){}
    public Lamp(boolean state,Date updatetime){
        this.setState(state);
        this.setUpdatetime(updatetime);
    }
    public Lamp(int id,boolean state,Date updatetime) {
        this.setId(id);
        this.setState(state);
        this.setUpdatetime(updatetime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date date) {
        this.updatetime = date;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }


}
