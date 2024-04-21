package com.siteweb.tcs.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@TableName("TBL_Equipment")
@NoArgsConstructor
public class TblEquipment {
    /**
     * 局站ID
     */
    private Integer stationId;
    /**
     * 设备ID
     */

    @TableId(value = "equipmentId", type = IdType.INPUT)

    private Integer equipmentId;
    /**
     * 设备名
     */

    private String equipmentName;
    /**
     * 设备编码
     */

    private String equipmentNo;
    /**
     * 设备模块
     */

    private String equipmentModule;
    /**
     * 设备型号
     */

    private String equipmentStyle;
    /**
     * 资产状态
     */

    private Integer assetState;
    /**
     * 资产价格
     */
    private Double price;
    /**
     * 资产寿命
     */
    private Double usedLimit;
    /**
     * 启用时间
     */
    private LocalDateTime usedDate;
    /**
     * 购买日期
     */
    private LocalDateTime buyDate;
    /**
     * 设备厂商
     */
    private String vendor;
    /**
     * 设备单位
     */
    private String unit;
    /**
     * 设备类型（非标准）
     */

    private Integer equipmentCategory;
    /**
     * 设备分类（自诊断，虚拟设备等）
     */

    private Integer equipmentType;
    /**
     * 设备大类
     */

    private Integer equipmentClass;
    /**
     * 设备状态(用于电池)
     */

    private Integer equipmentState;
    /**
     * 告警抑制表达式
     */

    private String eventExpression;
    /**
     * 告警开始延时
     */
    private Double startDelay;
    /**
     * 告警结束延时
     */
    private Double endDelay;
    /**
     * 设备属性
     */
    private String property;
    /**
     * 描述信息
     */

    private String description;
    /**
     * 设备模板ID
     */

    private Integer equipmentTemplateId;
    /**
     * 局房ID
     */

    private Integer houseId;
    /**
     * 监控单元ID
     */

    private Integer monitorUnitId;
    /**
     * 监控主机ID
     */

    private Integer workStationId;
    /**
     * 采集单元ID
     */

    private Integer samplerUnitId;
    /**
     * 显示顺序
     */

    private Integer displayIndex;
    /**
     * 设备连接状态
     */

    private Integer connectState;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 父设备ID
     */
    private String parentEquipmentId;
    /**
     * 额定容量
     */
    private String ratedCapacity;

    private String installedModule;
    /**
     * 工程名
     */
    private String projectName;
    /**
     * 合同号
     */
    private String contractNo;
    /**
     * 安装时间
     */
    private LocalDateTime installTime;
    /**
     * 设备条码
     */
    private String equipmentSn;
    /**
     * 采集协议库
     */
    private String so;

    /**
     * 层级ID
     */
    private Integer resourceStructureId;
}
