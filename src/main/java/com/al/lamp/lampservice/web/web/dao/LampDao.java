package com.al.lamp.lampservice.web.web.dao;

import com.al.lamp.lampservice.web.model.Lamp;
import org.springframework.data.repository.CrudRepository;

public interface LampDao extends CrudRepository<Lamp, Integer> {
/**    public void UpdateLamp(boolean state);
    public boolean getLampState();
**/}
/**
 package com.al.lamp.lampservice.web.web.dao;

 import com.al.lamp.lampservice.web.model.Lamp;
 import org.hibernate.Session;
 import org.hibernate.SessionFactory;
 import org.springframework.stereotype.Repository;

 import java.sql.Date;

 @Repository
 public class LampDaoImpl  implements LampDao{

 @Override
 public void UpdateLamp(boolean state) {
 long millis=System.currentTimeMillis();
 Date date = new Date(millis);
 Lamp lamp = new Lamp(false,date);
 }

 @Override
 public boolean getLampState() {
 return false;
 }
 }
**/