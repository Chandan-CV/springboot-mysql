package org.jobapplication.springbootapi.service;

import org.jobapplication.springbootapi.entity.UserInfo;
import org.jobapplication.springbootapi.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    public UserInfo registerUser(String email, String name) {
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail(email);
        userInfo.setName(name);
        return userInfoRepository.save(userInfo);
    }

    public List<UserInfo> getAllUsers() {
        return userInfoRepository.findAll();
    }
}
