package cn.haoke.dubbo.api.controller;

import cn.haoke.dubbo.api.service.PicUploadFileSystemService;
import cn.haoke.dubbo.api.service.PicUploadService;
import cn.haoke.dubbo.api.vo.PicUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("pic/upload")
@Controller
public class PicUploadController {

    @Autowired
    private PicUploadService picUploadService;

//    @Autowired
//    private PicUploadFileSystemService picUploadService;


    /**
     * @param uploadFile
     * @return
     * @throws Exception
     */
//    @PostMapping
//    @ResponseBody
//    public PicUploadResult upload(@RequestParam("file") MultipartFile uploadFile)
//            throws Exception {
//        return this.picUploadService.upload(uploadFile);
//    }



    /**
     * @param uploadFile
     * @return
     * @throws Exception
     */
    @PostMapping
    @ResponseBody
    public PicUploadResult upload(@RequestParam("file") MultipartFile uploadFile)
            throws Exception {
        return this.picUploadService.upload(uploadFile);
    }


}