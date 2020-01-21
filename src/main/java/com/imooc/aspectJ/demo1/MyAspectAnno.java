package com.imooc.aspectJ.demo1;

//切面类

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectAnno {

//    前置通知
    @Before(value="execution(* com.imooc.aspectJ.demo1.ProductDao.save*(..))")
    public void before(){
        System.out.println("前置通知=========");
    }

//    后置通知
    @AfterReturning(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.update(..))",returning = "result")
    public void afterReturing(Object result){
        System.out.println("后置通知========="+result);
    }

//    环绕通知
    @Around(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.delete(..)))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("环绕前通知=====");
        Object obj = joinPoint.proceed(); //执行目标方法
        System.out.println("环绕后通知=====");
        return obj;

    }

//    异常抛出通知
    @AfterThrowing(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.findOne(..))")
    public void afterThrowing(){

        System.out.println("异常抛出通知");

    }


//    最终通知(无论是否有异常，都会通知)
    @After(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.findAll(..))")
    public void after(){
        System.out.println("=====最终通知====");
    }

//    切点命名
    @Pointcut(value = "execution(* com.imooc.aspectJ.demo1.ProductDao.save*(..))")
    public void myPointcutSave(){

    }



}
