package com.ly.admintemp.service.impl;

import com.ly.admintemp.dao.LoginDao;
import com.ly.admintemp.entity.User;
import com.ly.admintemp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;

    @Override
    public boolean checkUserInfo(User user) {
        if (user.getUsername() != null && !"".equals(user.getUsername())){
            User u = loginDao.selectUserByUsername(user.getUsername(),user.getPassword());
            if (u!=null){
                return true;
            }
        }
        return false;
    }
}
