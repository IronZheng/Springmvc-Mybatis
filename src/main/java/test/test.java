package test;


import com.find.webapp.dao.userMapper;
import com.find.webapp.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * Created by User on 2017/3/1.
 */

public class test {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("WEB-INF/sqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession() {
        return sqlSessionFactory;
    }

    public void getUserByID() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            userMapper user = session
                    .getMapper(userMapper.class);
            List<User> id = user.getName();
            if (id != null) {
                System.out.println(id);
            }

        } finally {
            session.close();
        }
    }

    public static void main(String[] args) {
      test test = new test();
      test.getUserByID();
    }
}
