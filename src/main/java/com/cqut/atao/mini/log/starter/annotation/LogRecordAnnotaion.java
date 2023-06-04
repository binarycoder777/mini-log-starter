package com.cqut.atao.mini.log.starter.annotation;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LogRecordAnnotaion {

    /**
     * 操作日志的文本模板
     * @return
     */
    String success();

    /**
     * 操作日志失败的文本模板
     * @return
     */
    String fail() default "";

    /**
     * 操作人
     * @return
     */
    String operator() default "";

    /**
     * 操作对象标识
     * @return
     */
    String bizNo();

    /**
     * 日志类型
     * @return
     */
    String category() default "";

    /**
     * 拓展详情
     * @return
     */
    String detail() default "";

    /**
     * 记录条件
     * @return
     */
    String condition() default "";


}
