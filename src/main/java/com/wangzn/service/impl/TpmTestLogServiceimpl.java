package com.wangzn.service.impl;

import com.wangzn.mapper.TpmTestLogMapper;
import com.wangzn.model.TpmTestLog;
import com.wangzn.service.TpmTestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @TpmTestLogServiceImpl
 * @ServiceImpl
 * @version : Ver 1.0
 */
@Service
@Transactional
class TpmTestLogServiceImpl implements TpmTestLogService {

    @Autowired
    private TpmTestLogMapper tpmTestLogMapper;

    @Override
    public Long ceshi(TpmTestLog tpmTestLog) {
        return tpmTestLogMapper.insert(tpmTestLog);
    }
}