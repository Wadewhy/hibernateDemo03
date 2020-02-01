/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.pojo 
 * @author: wadewhy   
 * @date: 2020年2月1日 下午12:37:40 
 */
package xyz.wadewhy.pojo;

import java.util.Date;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月1日 下午12:37:40
* 类说明
*/
/**
 * @ClassName: Emp
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月1日 下午12:37:40
 */
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Integer sal;
    private Integer comm;

    private Dept dept;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getsal() {
        return sal;
    }

    public void setsal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
                + ", sal=" + sal + ", comm=" + comm + ", dept=" + dept + "]";
    }

}
