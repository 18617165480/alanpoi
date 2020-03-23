package com.alanpoi.excel.imports;

import java.io.Serializable;

/**
 * 记录错误文件信息
 * @author zhuoxun.peng
 */
public class ErrorFile implements Serializable {


    /**对应的excel对象*/
    private String workbookId;
    /**文件所在的服务器地址*/
    private String ipAddress;
    /**文件所在的服务器地址的目录*/
    private String filePath;
    /**文件名*/
    private String fileName;

    public ErrorFile() {
    }

    public ErrorFile(String workbookId, String ipAddress, String filePath, String fileName) {
        this.workbookId = workbookId;
        this.ipAddress = ipAddress;
        this.filePath = filePath;
        this.fileName = fileName;
    }

    public String getWorkbookId() {
        return workbookId;
    }

    public void setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
