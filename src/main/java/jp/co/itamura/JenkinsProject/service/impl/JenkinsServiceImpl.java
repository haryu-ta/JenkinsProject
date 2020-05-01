package jp.co.itamura.JenkinsProject.service.impl;

import jp.co.itamura.JenkinsProject.dto.JenkinsDto;
import jp.co.itamura.JenkinsProject.service.JenkinsService;
import org.springframework.stereotype.Service;

@Service
public class JenkinsServiceImpl implements JenkinsService {

    @Override
    public JenkinsDto testMethod(int flg) {

        JenkinsDto dto;

        if(flg == 1){
            dto = new JenkinsDto("板村 亮平",1982,false,"山口");
        }else{
            dto = new JenkinsDto("板村 佳奈",1983,false,"千葉");
        }

        return dto;


    }

}
