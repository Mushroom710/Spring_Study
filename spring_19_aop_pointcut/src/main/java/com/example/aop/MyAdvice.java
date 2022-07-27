package com.example.aop;

// @DATE 2022/7/27
// @TIME 9:14
// @AUTHOR zhangzhi
// @DESCRIPTION

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//通知类必须配置成Spring管理的bean
@Component
//设置当前类为切面类类
@Aspect
public class MyAdvice {
    //设置切入点，要求配置在方法上方
    //切入点表达式：
//    @Pointcut("execution(void com.example.dao.BookDao.update())")
//    @Pointcut("execution(void com.example.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.example.dao.impl.BookDaoImpl.update(*))")    //no
//    @Pointcut("execution(void com.*.*.*.update())")
//    @Pointcut("execution(* *..*(..))")
//    @Pointcut("execution(* *..*e(..))")
//    @Pointcut("execution(void com..*())")
//    @Pointcut("execution(* com.example.*.*Service.find*(..))")
    //执行com.example包下的任意包下的名称以Service结尾的类或接口中的save方法，参数任意，返回值任意
    @Pointcut("execution(void com.example.dao.BookDao.*())")
    private void pt(){}

    //设置在切入点pt()的前面运行当前操作（前置通知）
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}