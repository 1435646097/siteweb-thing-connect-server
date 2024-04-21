package com.siteweb.tcs.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.siteweb.tcs.bean.entity.TblEquipment;

import java.util.List;

public interface EquipmentService extends IService<TblEquipment> {
    List<TblEquipment> findByConnectState(Integer connectState);
}
