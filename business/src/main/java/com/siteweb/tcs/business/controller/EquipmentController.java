package com.siteweb.tcs.business.controller;

import com.siteweb.tcs.bean.entity.TblEquipment;
import com.siteweb.tcs.business.service.EquipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    EquipmentService equipmentService;

    @GetMapping(params = "connectState")
    public List<TblEquipment> findByConnectState(Integer connectState) {
        return equipmentService.findByConnectState(connectState);
    }
}
