-- lvxile 2020/10/28
CREATE TABLE T_DEVICES_INFO(
  ID BIGINT(20) PRIMARY KEY NOT NULL COMMENT '主键',
  DEVICE_NAME VARCHAR(30) COMMENT '设备名称',
  DEVICE_CODE VARCHAR(10) COMMENT '设备编号',
  DEVICE_DESC VARCHAR(200) COMMENT '设备秒数',
  CREATE_TIME DATETIME(0) COMMENT '入库时间',
  UPDATE_TIME DATETIME(0) COMMENT '更新时间',
  UPDATE_BY VARCHAR(30) COMMENT '经手人'
);