package com.qizhidao.alanpoi.excel.handle;

import com.qizhidao.alanpoi.excel.ExcelSheetData;

import java.util.List;

/**
 * Excel消费接口
 * @author zhuoxun.peng
 * @since 2020-2-26
 */
public interface ExcelConsumeInterface {
    /**
     * when error will 调用
     *
     * @param excelError
     */
    void error(ExcelError excelError);

    /**
     * custom valid data
     *
     * @param workbookId
     * @param sheetDataList
     */
    void validData(String workbookId, List<ExcelSheetData> sheetDataList);

    /**
     *
     * @param sheetDataList return success data
     */
    void end(List<ExcelSheetData> sheetDataList);
}
