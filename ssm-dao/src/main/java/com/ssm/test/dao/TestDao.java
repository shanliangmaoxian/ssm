package com.ssm.test.dao;

import com.ssm.test.bean.TestBean;
import org.springframework.stereotype.Repository;

/**
 * @author saodiseng
 * @pachage com.ssm.test.dao.
 * @description {TODO}功能描述.
 * @date 16/7/21 下午1:04
 */
@Repository
public interface TestDao {

    Integer insert(TestBean tb);
}
