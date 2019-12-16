package com.hxch.movie.controller;

import com.hxch.movie.dto.QzShareBonusDto;
import com.hxch.movie.service.QzShareBonusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:QzShareBonusController
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/13 0013 17:28
 **/
@Controller
@RequestMapping("/qz")
public class QzShareBonusController {

    @Resource
    private QzShareBonusService service;

    @RequestMapping("/save")
    public String save() {
        QzShareBonusDto dto1=new QzShareBonusDto("20171201",1.11, 1.11, "1512144000", "1512144000", "2",1.11, 1.11);
        QzShareBonusDto dto2=new QzShareBonusDto("20171202",2.22, 2.22, "1512144000", "1512144000", "2",2.22, 2.22);
        QzShareBonusDto dto3=new QzShareBonusDto("20171203",3.33, 3.33, "1512144000", "1512144000", "2",3.33, 3.33);
        List<QzShareBonusDto> users=new ArrayList<>();
        users.add(dto1);
        users.add(dto2);
        users.add(dto3);
        service.saveAll(users);
        return "保存成功";
    }

    @RequestMapping("/findByShareDay")
    public List<QzShareBonusDto> findByShareDay(String shareDay){
        return service.findByShareDay(shareDay);
    }
    @RequestMapping("/findByShareDayAndAddTime")
    public List<QzShareBonusDto> findByShareDayAndAddTime(String shareDay, String addTime){
        return service.findByShareDayAndAddTime(shareDay,addTime);
    }
    @RequestMapping("/findByShareDayLike")
    public List<QzShareBonusDto> findByShareDayLike(String shareDay){
        return service.findByShareDayLike(shareDay);
    }

    @RequestMapping("/queryListByShareDay")
    public String queryListByShareDay(String shareDay, Model model){
        List<QzShareBonusDto> list = service.findByShareDay(shareDay);
        model.addAttribute("list", list);
        return "queryQzShareBonus";
    }

    @RequestMapping("/addOne")
    public String addOne() throws Exception{
        return "addQzShareBonus";
    }

    @RequestMapping("/saveOne")
    @ResponseBody
    public String saveOne(QzShareBonusDto dto) throws Exception{
        service.saveOne(dto);
        return "新增成功";
    }
}
