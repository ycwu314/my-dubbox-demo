package com.example.dubbox.filter;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class LogFilter implements Filter {

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        RpcContext ctx= RpcContext.getContext();
        System.out.println("**************************"+ctx.getUrl().toString());
        return invoker.invoke(invocation);
    }
}
