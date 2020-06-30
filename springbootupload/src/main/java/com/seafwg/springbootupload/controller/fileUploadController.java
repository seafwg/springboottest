package com.seafwg.springbootupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/*
 * 文件上传
 */
@RestController
public class fileUploadController {
  @PostMapping("/fileUpload")
  // file 必须和前端name值相同
  public String fileUpload(MultipartFile file) throws Exception{
    System.out.println(file.getOriginalFilename());
    file.transferTo(new File("D:/"+file.getOriginalFilename()));
    return "ok";
  }
}
