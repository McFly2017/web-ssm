package com.mcfly.ssm.controller;

import com.mcfly.ssm.service.GoodsService;
import com.mcfly.ssm.model.Goods;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
/**
 * Created by Notes on 2017/5/10.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @RequestMapping("/")
    public String showGoods(HttpServletRequest request, Model model){
        List<Goods> goodsList = goodsService.getAllGoods();
        Goods goods = goodsService.getGoodsById(2);
        model.addAttribute("goods",goods);
        model.addAttribute("goodsList",goodsList);
        return "showGoods";
    }
}
