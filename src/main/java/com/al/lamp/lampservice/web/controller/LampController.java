package com.al.lamp.lampservice.web.controller;

import com.al.lamp.lampservice.web.model.Lamp;
import com.al.lamp.lampservice.web.web.dao.LampDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.X11.XSystemTrayPeer;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class LampController {
    @Autowired
    public LampDao lampDao;

    @RequestMapping(value = "/Lamp",method = GET)
    public boolean getLamp(){
        Iterable<Lamp> all = lampDao.findAll();
        int id = 0;
        Date date ;
        boolean state = false;
        for (Lamp lamp : all) {
            if (id == 0) {
                id = lamp.getId();
                date = lamp.getUpdatetime();
                state = lamp.isState();
            } else {
                if (lamp.getId()>id){
                    id = lamp.getId();
                    date = lamp.getUpdatetime();
                    state = lamp.isState();
                }
            }
        }

        return state;
    }

    @RequestMapping(value = "/Lamp/{state}",method = POST)
    public void setLamp(@PathVariable String state){
        long millis=System.currentTimeMillis();
        Date date = new Date(millis);
        boolean s ;
        if(state.equals("true")){
            s = true;
        } else{
            s = false;
        }
        System.out.println(s);
        Lamp lamp = new Lamp(s,date);
        lampDao.save(lamp);
    }


}
