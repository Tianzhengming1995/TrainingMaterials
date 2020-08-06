package abc.wuyan.mapper;

import java.util.List;

import abc.wuyan.model.Items;

public interface ItemsMapper {
    List<Items> findAllItems();

    Items findById(int id);

    public void insert(Items items);

    public void update(Items items);

    public void deleteById(int id);
}
