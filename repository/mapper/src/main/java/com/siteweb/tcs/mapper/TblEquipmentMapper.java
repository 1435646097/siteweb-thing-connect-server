package com.siteweb.tcs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.siteweb.tcs.bean.entity.TblEquipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TblEquipmentMapper extends BaseMapper<TblEquipment> {
    List<TblEquipment> findByConnectState(@Param("connectState") Integer connectState);
}
