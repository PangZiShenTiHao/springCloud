package com.hxch.movie.dao;

import com.hxch.movie.dto.QzShareBonusDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName:QzShareBonusRepository
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/13 0013 17:19
 **/

public interface QzShareBonusRepository extends JpaRepository<QzShareBonusDto, Integer> {
    List<QzShareBonusDto> findByShareDay(String shareDay);
    List<QzShareBonusDto> findByShareDayAndAddTime(String shareDay, String addTime);
    List<QzShareBonusDto> findByShareDayLike(String shareDay);
}
