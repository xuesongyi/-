package com.example.springweb.dao;

import com.example.springweb.pojo.Dorm;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("dormMapper")
public interface dormMapper {
    List<Dorm> queryAll();//查询所有宿舍信息，返回一个包含所有宿舍信息的List集合
    Dorm querySingle(String dormAddress,int dormNum);//根据宿舍地址和宿舍号查询单个宿舍信息，返回一个Dorm对象
    Dorm queryById(int dormId);
    int addDorm(Dorm dorm);
    int updateDorm(Dorm dorm);
    int deleteDorm(int dormId);
}
