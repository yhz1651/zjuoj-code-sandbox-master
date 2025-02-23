package com.yhz.zjuojcodesandbox;


import com.yhz.zjuojcodesandbox.model.ExecuteCodeRequest;
import com.yhz.zjuojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
