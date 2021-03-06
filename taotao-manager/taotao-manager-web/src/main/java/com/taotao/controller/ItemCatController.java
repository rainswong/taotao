package com.taotao.controller;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品分类管理controller
 * <p>Title: ItemCatController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p>
 *
 * @version 1.0
 * @author 入云龙
 * @date 2015年9月4日上午9:25:14
 */
@Controller
@RequestMapping( "/item/cat" )
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping( "/list" )
    @ResponseBody
    private List<EUTreeNode> getCatList(@RequestParam( value = "id", defaultValue = "0" ) Long parentId) {
        List<EUTreeNode> list = itemCatService.getCatList(parentId);
        return list;
    }
}
