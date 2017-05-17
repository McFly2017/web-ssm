package com.mcfly.ssm.service;

import com.mcfly.ssm.model.Goods;

import java.util.List;

/**
 * Created by Notes on 2017/5/10.
 */
public interface GoodsService {

    Goods getGoodsById(Integer id);

    List<Goods> getAllGoods();
}
