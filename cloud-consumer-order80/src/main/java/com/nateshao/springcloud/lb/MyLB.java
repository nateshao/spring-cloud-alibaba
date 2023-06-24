//package com.nateshao.springcloud.lb;
//
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//
///**
// * @Date Created by 邵桐杰 on 2023/6/24  10:10
// * @微信公众号 千羽的编程时光
// * @博客 https://nateshao.gitlab.io
// * @GitHub https://github.com/nateshao
// * @Gitee https://gitee.com/nateshao
// * Description:
// */
//@Component
//public class MyLB implements LoadBalancer {
//    private AtomicInteger atomicInteger = new AtomicInteger(0);
//
//    public final int getAndIncrement() {
//        int current;
//        int next;
//
//        do {
//            current = this.atomicInteger.get();
//            next = current >= 2147483647 ? 0 : current + 1;
//        } while (!this.atomicInteger.compareAndSet(current, next));
//        System.out.println("*****第几次访问，次数next: " + next);
//        return next;
//    }
//
//    //负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标  ，每次服务重启动后rest接口计数从1开始。
//    @Override
//    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
//        int index = getAndIncrement() % serviceInstances.size();
//
//        return serviceInstances.get(index);
//    }
//}
