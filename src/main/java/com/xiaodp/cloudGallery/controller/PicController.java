package com.xiaodp.cloudGallery.controller;

import com.xiaodp.cloudGallery.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author xiaodp
 * @date 2019/9/3 9:56
 */

@Controller
public class PicController {

    @Autowired
    FileUploadService fileUploadService;

    @RequestMapping(value = "/pic/upload" , method = RequestMethod.POST)
    @ResponseBody
    public Map fileUpload(@RequestParam("file") MultipartFile uploadFile) {
        return fileUploadService.picsUpload(uploadFile);
    }
//    @RequestMapping(value = "/")
//    public String index() {
//        return "test";
//    }

    @RequestMapping(value = "/")
    public ModelAndView index2() {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("test");
       return modelAndView;
    }




}
