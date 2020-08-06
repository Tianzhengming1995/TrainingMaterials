package abc.wuyan.mapper;

import abc.wuyan.model.User;

import java.util.List;

public interface UserMapper {
    public User findUserById(int id);

    public List<User> findAll();

    public void save(User user);

    public void updateById(User user);

    public void deleteById(int id);

    public int count(String sex);

    public List<User> findLike(String keyword);
}
