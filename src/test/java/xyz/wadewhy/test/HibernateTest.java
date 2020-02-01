package xyz.wadewhy.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import xyz.wadewhy.pojo.Customer;
import xyz.wadewhy.pojo.Dept;
import xyz.wadewhy.pojo.Emp;
import xyz.wadewhy.pojo.LinkMan;
import xyz.wadewhy.util.HibernateUtil;

public class HibernateTest {

    /**
     * 添加
     */
    @Test
    public void fun1() {
        Session session = HibernateUtil.openSession();
        Transaction tx = session.beginTransaction();
        Dept d = new Dept();
        d.setDname("腾讯");
        Emp e = new Emp();
        e.setEname("马化腾");
        // 表达一对多,部门下有多个职员
        d.getEmpset().add(e);
        // 表达对对对,员工属于哪个部门
        e.setDept(d);
        session.save(d);
        session.save(e);
        tx.commit();

    }

    /**
     * 添加
     */
    @Test
    public void fun2() {
        Session session = HibernateUtil.openSession();
        Transaction tx = session.beginTransaction();
        Dept d = session.get(Dept.class, 41);
        Emp e = new Emp();
        e.setEname("马化腾4");
        // 表达一对多,部门下有多个职员
        d.getEmpset().add(e);
        // 表达对对对,员工属于哪个部门
        e.setDept(d);
        session.save(e);
        tx.commit();
        session.close();
    }

    /**
     * 删除马化腾4的部门信息测试
     */
    @Test
    public void fun3() {
        Session session = HibernateUtil.openSession();
        Transaction tx = session.beginTransaction();
        // 获得部门编号为41的部门
        Dept d = session.get(Dept.class, 41);
        // 获得编号为7938的员工----马化腾4
        Emp e = session.get(Emp.class, 7938);
        // 将员工从数据移除
        d.getEmpset().remove(e);
        e.setDept(null);
        tx.commit();
        session.close();
    }

    @Test
    // 保存客户 以及客户 下的联系人
    public void fun() {
        Session session = HibernateUtil.openSession();
        Transaction tx = session.beginTransaction();
        // -------------------------------------------------
        Customer c = new Customer();
        c.setCust_name("阿里巴巴");

        LinkMan lm1 = new LinkMan();
        lm1.setLkm_name("马云");

        LinkMan lm2 = new LinkMan();
        lm2.setLkm_name("张勇");

        // 表达一对多,客户下有多个联系人
        c.getLinkMens().add(lm1);
        c.getLinkMens().add(lm2);

        // 表达对对对,联系人属于哪个客户
        lm1.setCustomer(c);
        lm2.setCustomer(c);

        session.save(c);
        session.save(lm1);
        session.save(lm2);

        // -------------------------------------------------
        tx.commit();
        session.close();
    }

}
