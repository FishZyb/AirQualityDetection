package com.neu.common.execption;

import com.neu.result.ResultCodeEnum;
import lombok.Data;

/**
    自定义全局异常
 */
@Data
public class AQIException extends RuntimeException{

  private Integer code;

  private String message;

  /**
   * 通过状态码和错误消息创建异常对象
   * @param code
   * @param message
   */
  public AQIException(Integer code, String message) {
    super(message);
    this.code = code;
    this.message = message;
  }

  /**
   * 接收枚举类型对象
   * @param resultCodeEnum
   */
  public AQIException(ResultCodeEnum resultCodeEnum) {
    super(resultCodeEnum.getMessage());
    this.code = resultCodeEnum.getCode();
    this.message = resultCodeEnum.getMessage();
  }

  @Override
  public String toString() {
    return "GuliException{" +
      "code=" + code +
      ", message=" + this.getMessage() +
      '}';
  }
}
