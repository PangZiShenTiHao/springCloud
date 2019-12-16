package com.hxch.movie.service;

import com.hxch.movie.dao.QzShareBonusRepository;
import com.hxch.movie.dto.QzShareBonusDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @ClassName:QzShareBonusService
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/13 0013 17:25
 **/

@Service
public class QzShareBonusService {

    @Resource
    private QzShareBonusRepository qzShareBonusRepository;

    @Transactional
    public void saveAll(List<QzShareBonusDto> qzShareBonusDtos) {
        qzShareBonusRepository.saveAll(qzShareBonusDtos);
    }

    public List<QzShareBonusDto> findByShareDay(String shareDay){
        return qzShareBonusRepository.findByShareDay(shareDay);
    }
    public List<QzShareBonusDto> findByShareDayAndAddTime(String shareDay, String addTime){
        return qzShareBonusRepository.findByShareDayAndAddTime(shareDay,addTime);
    }
    public List<QzShareBonusDto> findByShareDayLike(String shareDay){
        return qzShareBonusRepository.findByShareDayLike(shareDay);
    }

    @Transactional
    public void saveOne(QzShareBonusDto dto){
        qzShareBonusRepository.save(dto);
    }

}
