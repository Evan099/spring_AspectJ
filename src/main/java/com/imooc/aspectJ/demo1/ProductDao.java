package com.imooc.aspectJ.demo1;

public class ProductDao {

    public void save(){
        System.out.println("保存商品");
    }

    public String update(){
        System.out.println("修改商品");
        return "hello";
    }

    public void delete(){
        System.out.println("删除商品");
    }

    public void findOne(){
        System.out.println("查询一条商品");
    }

    public void findAll(){
        System.out.println("查询所有商品");

    }




}
