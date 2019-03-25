package com.itheima.controller;

import com.itheima.entity.User;
import com.itheima.service.IexcelService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private IexcelService service;
    @RequestMapping("download")
    public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<User> list = service.findAll();
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("用户表");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("id1");
        Cell cell1 = row.createCell(1);
        cell1.setCellValue("名字");
        Cell cell2 = row.createCell(2);
        cell2.setCellValue("性别");
        Cell cell3 = row.createCell(3);
        cell3.setCellValue("号码");
        Cell cell4 = row.createCell(4);
        cell4.setCellValue("地址");

        for (int i = 0; i < list.size(); i++) {
            Row row1 = sheet.createRow(i + 1);
            Cell row1Cell = row1.createCell(0, CellType.NUMERIC);
            row1Cell.setCellValue(list.get(0).getId());
            Cell row1Cell1 = row1.createCell(1, CellType.STRING);
            row1Cell1.setCellValue(list.get(0).getName());
            Cell row1Cell2 = row1.createCell(2, CellType.STRING);
            row1Cell2.setCellValue(list.get(0).getSex());
            Cell row1Cell3 = row1.createCell(3, CellType.NUMERIC);
            row1Cell3.setCellValue(list.get(0).getNumber());
            Cell row1Cell4 = row1.createCell(4, CellType.STRING);
            row1Cell4.setCellValue(list.get(0).getAddress());
        }

        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition","attachment;filename=用户.xls");
        ServletOutputStream outputStream = response.getOutputStream();
        book.write(outputStream);
        book.close();

    }
}
