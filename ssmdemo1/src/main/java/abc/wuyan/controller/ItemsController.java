package abc.wuyan.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import abc.wuyan.model.Items;
import abc.wuyan.service.IItemsService;


@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private IItemsService itemsService;

    @RequestMapping("list")
    public String list(Model model) {
        List<Items> itemsList = itemsService.findAllItems();
        model.addAttribute("itemsList", itemsList);
        return "items/list";
    }

    @RequestMapping("edit")
    public String edit(Integer id, Model model) {
        Items items = itemsService.findById(id);
        model.addAttribute("items", items);
        return "items/edit";
    }

    @RequestMapping("update")
    public String update(Items items) {
        items.setCreatetime(new Date());
        itemsService.update(items);
        return "redirect:list.do";
    }

    @RequestMapping("delete")
    public String delete(Integer id) {
        itemsService.delete(id);
        return "forward:list.do";
    }

    @RequestMapping("add")
    public String add() {
        return "items/add";
    }

    @RequestMapping("insert")
    public String insert(Items items) {
        items.setCreatetime(new Date());
        itemsService.insert(items);
        return "forward:list.do";
    }
}
