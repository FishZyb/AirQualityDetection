package com.neu.common.handler;

import com.neu.common.execption.AQIException;
import com.neu.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 一只鱼zzz
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionandler {
  @ExceptionHandler(Exception.class)
  @ResponseBody
  public Result error(Exception e){
    e.printStackTrace();
    return Result.fail();
  }
  @ExceptionHandler(ArithmeticException.class)
  @ResponseBody
  public Result error(ArithmeticException e){
    e.printStackTrace();
    return Result.fail().message("执行了特定异常处理");
  }
//  @ExceptionHandler(AQIException.class)
//  @ResponseBody
//  public Result error(AQIException e){
//    e.printStackTrace();
//    return Result.fail().message(e.getMsg()).code(e.getCode());
//  }
}
