package abc.wuyan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import abc.wuyan.model.Items;


public interface IItemsService {

    List<Items> findAllItems();

    Items findById(int id);

    public void insert(Items items);

    public void update(Items items);

    public void delete(int id);
}
