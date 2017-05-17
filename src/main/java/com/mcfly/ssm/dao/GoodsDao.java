package com.mcfly.ssm.dao;

import com.mcfly.ssm.model.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Notes on 2017/5/10.
 */
@Repository
public interface GoodsDao {

    Goods selectById(@Param("id") Integer id);

    List<Goods> selectAllGoods();
}
