package com.erp4j.ssm.service;

import com.erp4j.ssm.pojo.COrder;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/17 16:46
 * @Description:
 */

public interface OrderService {

    List<COrder> findRows();

    int findTotal();
}
