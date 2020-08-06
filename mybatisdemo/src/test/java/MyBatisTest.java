import abc.wuyan.mapper.UserMapper;
import abc.wuyan.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MyBatisTest {

    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private UserMapper userMapper;

    @Before
    public void before() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        session = factory.openSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    @Test
    public void testFindById() {
        User user1 = userMapper.findUserById(1);
        System.out.println(user1.toString());
    }

    @Test
    public void testFindAll() {
        List<User> userList = userMapper.findAll();
        System.out.println(userList.toString());
    }

    @Test
    public void testSave() {
        User user = new User("tt", "男", new Date(), "aaaaaaaa");
        userMapper.save(user);
        List<User> userList = userMapper.findAll();
        System.out.println(userList.toString());
    }

    @Test
    public void testUpdate() {
        User user = new User("yy", "男", new Date(), "bbbbbb");
        user.setId(1);
        userMapper.updateById(user);
        List<User> userList = userMapper.findAll();
        System.out.println(userList.toString());
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(1);
        List<User> userList = userMapper.findAll();
        System.out.println(userList.toString());
    }

    @Test
    public void testCount() {
        int count=userMapper.count("男");
        System.out.println(count);
    }

    @Test
    public void testFindLike() {
        List<User> userList = userMapper.findLike("王");
        System.out.println(userList.toString());
    }

    @After
    public void after()
    {
        session.close();
    }
}
