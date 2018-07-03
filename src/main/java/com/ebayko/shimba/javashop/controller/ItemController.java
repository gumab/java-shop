package com.ebayko.shimba.javashop.controller;

import com.ebayko.shimba.javashop.domain.Item;
import com.ebayko.shimba.javashop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public String itemList() {
        return "redirect:/items/0";
    }

    @GetMapping(path = "/{pageId}")
    public String itemList(@PathVariable(name = "pageId", required = false) int pageId,
                           ModelMap modelMap
    ) {
        PageRequest pageRequest = PageRequest.of(pageId, 5);//, Sort.Direction.DESC, "price");
        Page<Item> itemPage = itemService.getItems(pageRequest);
        modelMap.addAttribute("itemPage", itemPage);
        return "items/list";
    }
}
