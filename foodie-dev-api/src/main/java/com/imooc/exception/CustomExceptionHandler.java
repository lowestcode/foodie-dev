package com.imooc.exception;

import com.imooc.utils.IMOOCJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * 拦截器
 */
@RestControllerAdvice
public class CustomExceptionHandler {


    /**
     * 上传文件超过500kb 捕获这个异常
     * @ExceptionHandler(MaxUploadSizeExceededException.class)  注解添加这个异常类 用于捕获该异常
     * @param exception
     * @return
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public IMOOCJSONResult handlerMaxUploadFile(MaxUploadSizeExceededException exception){
        return IMOOCJSONResult.errorMsg("文件上传大小不能超过500k");
    }

}
