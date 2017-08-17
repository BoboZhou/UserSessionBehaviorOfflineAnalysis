package com.tosit.project.dao;

import com.tosit.project.domain.Task;

/**
 * 数据访问对象接口
 * <p>
 * Created by Bobo on 2017/3/11.
 * Copyright © Bobo SCU. All Rights Reserved
 */
public interface ITaskDAO {
    Task findById(long taskId);
}
