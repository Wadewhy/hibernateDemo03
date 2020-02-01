/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.pojo 
 * @author: wadewhy   
 * @date: 2020年2月1日 下午12:50:20 
 */
package xyz.wadewhy.pojo;

import java.util.HashSet;
import java.util.Set;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月1日 下午12:50:20
* 类说明
*/
/**
 * @ClassName: Dept
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月1日 下午12:50:20
 */

public class Dept {
    // 属性
    private Integer deptno;
    private String dname;
    private String loc;
    // 使用set集合，一对多
    private Set<Emp> empset = new HashSet<Emp>();

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Set<Emp> getEmpset() {
        return empset;
    }

    public void setEmpset(Set<Emp> empset) {
        this.empset = empset;
    }

    @Override
    public String toString() {
        return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", empset=" + empset + "]";
    }

}
