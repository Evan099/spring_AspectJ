package com.imooc.aspectJ.demo2;

public class CustomerDaoImpl implements CustomerDao{


    public void save() {
        System.out.println("保存客户");
    }

    public void update() {
        System.out.println("修改客户");
    }

    public void delete() {
        System.out.println("删除客户");
    }

    public void findOne() {
        System.out.println("查找一个客户");
    }

    public void findAll() {
        System.out.println("查找所有客户");
    }
}
