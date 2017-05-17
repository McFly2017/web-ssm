package com.mcfly.ssm.model;

/**
 * Created by Notes on 2017/5/10.
 */
public class Goods {
    private Integer id;
    private String goodsName;
    private String goodsInfo;
    private Double goodsPrice;

    public Integer getId(){ return id;}

    public void setId(Integer id){ this.id = id;}

    public String getName(){ return goodsName;}

    public void setName(String goodsName){ this.goodsName = goodsName;}

    public String getInfo(){ return goodsInfo;}

    public void setInfo(String goodsInfo){ this.goodsInfo = goodsInfo;}

    public Double getPrice(){ return goodsPrice;}

    public void setPrice(Double goodsPrice){ this.goodsPrice = goodsPrice;}
}
