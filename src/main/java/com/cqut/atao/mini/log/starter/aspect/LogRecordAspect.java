package com.cqut.atao.mini.log.starter.aspect;

import com.cqut.atao.mini.log.starter.parse.Parser;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 日志记录切面
 */
@Aspect
public class LogRecordAspect {

    private Parser parser;

    @Pointcut("@annotation(com.cqut.atao.mini.log.starter.annotation.LogRecordAnnotaion)")
    public void logRecordPointcut() {

    }

    @Around("logRecordPointcut()")
    public Object doRecordLog(ProceedingJoinPoint joinPoint) throws NoSuchMethodException {
        // 获取注解目标类
        Class<?> targetClass = joinPoint.getTarget().getClass();
        // 注解目标方法
        Method targetClassMethode = targetClass.getMethod(joinPoint.getSignature().getName());
        // 操作人和方法解析
        Collection<Object> operations = new ArrayList<>();
        Map<String, String> functionNameAndReturnMap = new HashMap<>();
        //业务逻辑执行前的自定义函数解析
        try {

        }catch (Exception e) {

        }
        //方法执行
        try {

        }catch (Exception e) {

        }
        //
        return null;
    }

}
