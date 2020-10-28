package org.jeecg.modules.wisemedical.devices.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 设备信息表
 * @Author: jeecg-boot
 * @Date:   2020-10-28
 * @Version: V1.0
 */
@Data
@TableName("T_DEVICES_INFO")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="T_DEVICES_INFO对象", description="设备信息表")
public class DeviceInfoModel {
    
	/**主键*/
	@TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
	private Integer id;
	/**设备名称*/
	@Excel(name = "设备名称", width = 15)
    @ApiModelProperty(value = "设备名称")
	private String deviceName;
	/**设备编号*/
	@Excel(name = "设备编号", width = 15)
    @ApiModelProperty(value = "设备编号")
	private String deviceCode;
	/**设备描述*/
	@Excel(name = "设备描述", width = 15)
    @ApiModelProperty(value = "设备描述")
	private String deviceDesc;
	/**入库时间*/
	@Excel(name = "入库时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "入库时间")
	private Date createTime;
	/**更新时间*/
	@Excel(name = "更新时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
	private Date updateTime;
	/**经手人*/
	@Excel(name = "经手人", width = 15)
    @ApiModelProperty(value = "经手人")
	private String updateBy;
}
