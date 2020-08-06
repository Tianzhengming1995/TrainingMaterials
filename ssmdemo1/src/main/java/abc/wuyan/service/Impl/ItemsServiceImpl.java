package abc.wuyan.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abc.wuyan.mapper.ItemsMapper;
import abc.wuyan.model.Items;
import abc.wuyan.service.IItemsService;

@Service
public class ItemsServiceImpl implements IItemsService {
    @Autowired
    ItemsMapper itemsMapper;

    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllItems();
    }

    @Override
    public Items findById(int id) {
        return itemsMapper.findById(id);
    }

    @Override
    public void insert(Items items) {
        if (items.getId() == null)
            itemsMapper.insert(items);
        else
            itemsMapper.update(items);
    }

    @Override
    public void update(Items items) {
        itemsMapper.update(items);
    }

    @Override
    public void delete(int id) {
        itemsMapper.deleteById(id);
    }

}
