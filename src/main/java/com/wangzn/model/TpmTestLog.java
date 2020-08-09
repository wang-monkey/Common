package com.wangzn.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @TpmTestLog
 * @(TPM_TEST_LOG)
 * @version : Ver 1.0
 */
@Data
public class TpmTestLog implements Serializable {


    /**
     * @备注: 主键
     * @字段:LOG_UUID bigint
     */
    private Long logUuid;


    /**
     * @备注:
     * @字段:TESTMAIN_UUID CHAR(32)
     */
    private String testmainUuid;


    /**
     * @备注:
     * @字段:OPERATION VARCHAR(20)
     */
    private String operation;


    /**
     * @备注:
     * @字段:SYSCREATEDATE VARCHAR(25)
     */
    private String syscreatedate;

}
