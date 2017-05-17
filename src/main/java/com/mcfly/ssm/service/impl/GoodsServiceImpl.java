package com.mcfly.ssm.service.impl;

import com.mcfly.ssm.model.Goods;
import com.mcfly.ssm.dao.GoodsDao;
import com.mcfly.ssm.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Notes on 2017/5/10.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService{
    @Resource
    private GoodsDao goodsDao;

    public Goods getGoodsById(Integer id){return goodsDao.selectById(id);}

    public List<Goods> getAllGoods(){return goodsDao.selectAllGoods();}
}
