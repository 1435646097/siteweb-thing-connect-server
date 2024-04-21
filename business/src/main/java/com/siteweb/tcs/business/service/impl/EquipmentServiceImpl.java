package com.siteweb.tcs.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.siteweb.tcs.bean.entity.TblEquipment;
import com.siteweb.tcs.business.service.EquipmentService;
import com.siteweb.tcs.mapper.TblEquipmentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl extends ServiceImpl<TblEquipmentMapper, TblEquipment> implements EquipmentService {
    @Override
    public List<TblEquipment> findByConnectState(Integer connectState) {
        return baseMapper.findByConnectState(connectState);
    }
}
