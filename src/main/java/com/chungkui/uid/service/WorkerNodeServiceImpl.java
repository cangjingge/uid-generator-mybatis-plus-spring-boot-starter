package com.chungkui.uid.service;

import com.baidu.fsg.uid.worker.entity.WorkerNodeEntity;
import com.baidu.fsg.uid.worker.service.WorkerNodeEntityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chungkui.uid.entity.WorkerNode;
import com.chungkui.uid.mapper.WorkerNodeMapper;
import org.springframework.beans.BeanUtils;

public class WorkerNodeServiceImpl extends ServiceImpl<WorkerNodeMapper, WorkerNode>
        implements WorkerNodeService, WorkerNodeEntityService {
    @Override
    public Long save(WorkerNodeEntity workerNodeEntity) {
        WorkerNode workerNode= new WorkerNode();
        BeanUtils.copyProperties(workerNodeEntity,workerNode);
        this.save(workerNode);
        return workerNode.getId();
    }
}
