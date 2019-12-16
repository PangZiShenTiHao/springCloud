package com.hxch.movie.dto;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName:QzShareBonus
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/13 0013 16:49
 **/

@Data
@Entity
@Table(name = "qz_share_bonus")
public class QzShareBonusDto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "share_day")
    private String shareDay;
    @Column(name = "share_money")
    private Double shareMoney;
    @Column(name = "share_quzubi")
    private Double shareQuzubi;
    @Column(name = "add_time")
    private String addTime;
    @Column(name = "share_time")
    private String shareTime;
    @Column(name = "is_share")
    private String isShare;
    @Column(name = "change_quzubi")
    private Double changeQuzubi;
    @Column(name = "change_ratio")
    private Double changeRatio;

    public QzShareBonusDto() {
    }

    public QzShareBonusDto(String shareDay, Double shareMoney, Double shareQuzubi, String addTime, String shareTime, String isShare, Double changeQuzubi, Double changeRatio) {
        this.shareDay = shareDay;
        this.shareMoney = shareMoney;
        this.shareQuzubi = shareQuzubi;
        this.addTime = addTime;
        this.shareTime = shareTime;
        this.isShare = isShare;
        this.changeQuzubi = changeQuzubi;
        this.changeRatio = changeRatio;
    }

    @Override
    public String toString() {
        return "QzShareBonus{" +
                "id=" + id +
                ", shareDay='" + shareDay + '\'' +
                ", shareMoney=" + shareMoney +
                ", shareQuzubi=" + shareQuzubi +
                ", addTime='" + addTime + '\'' +
                ", shareTime='" + shareTime + '\'' +
                ", isShare='" + isShare + '\'' +
                ", changeQuzubi=" + changeQuzubi +
                ", changeRatio=" + changeRatio +
                '}';
    }
}
