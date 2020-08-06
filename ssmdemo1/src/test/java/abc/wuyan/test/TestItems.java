package abc.wuyan.test;

import abc.wuyan.model.Items;
import abc.wuyan.service.IItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestItems {
    @Autowired
    IItemsService itemsService;

    @Test
    public void list() {
        List<Items> itemsList = itemsService.findAllItems();
        Items items=itemsService.findById(3);
        System.out.println(items.toString());
        System.out.println(itemsList.toString());
    }
}
