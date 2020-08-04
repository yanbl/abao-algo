package com.fab.algo;



import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author fanfuqiang
 * @date 2019/9/18 4:07 下午
 * @vesion V1.0
 * @Description: 三方下单请求实体，公用4.0逻辑
 **/
public class PlaceTheOrderThirdPlatformReqDto implements Serializable {
    /** 油站编码 */
    private String gasId;
    /** 油枪号 */
    private Integer gunNo;
    /** 消费金额 */
    private BigDecimal amountGun;
    /** 优惠券id */
    private Integer couponId;
    /** 系统 */
    private String os;
    /** 三方订单号 */
    private String outerOrderID;
    /** 订单推送接口订单参数按照驼峰修改*/
    private String outerOrderId;

    public String getGasId() {
        return gasId;
    }

    public void setGasId(String gasId) {
        this.gasId = gasId;
    }

    public Integer getGunNo() {
        return gunNo;
    }

    public void setGunNo(Integer gunNo) {
        this.gunNo = gunNo;
    }

    public BigDecimal getAmountGun() {
        return amountGun;
    }

    public void setAmountGun(BigDecimal amountGun) {
        this.amountGun = amountGun;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOuterOrderID() {
        return outerOrderID;
    }

    public PlaceTheOrderThirdPlatformReqDto setOuterOrderID(String outerOrderID) {
        this.outerOrderID = outerOrderID;
        return this;
    }

    public String getOuterOrderId() {
        return outerOrderId;
    }

    public void setOuterOrderId(String outerOrderId) {
        this.outerOrderId = outerOrderId;
    }

    public void checkParam() {

        //为兼容以之前命名为准
        if(StringUtils.isNotBlank(this.outerOrderId) && StringUtils.isBlank(this.outerOrderID)){
            this.outerOrderID = this.outerOrderId;
        }

        if (StringUtils.isBlank(this.outerOrderID)) {

            System.out.println(outerOrderID);
        }

    }


}
