package com.wpp.devtools.controller;

import com.wpp.devtools.domain.annotation.AccessLimit;
import com.wpp.devtools.domain.pojo.Result;
import com.wpp.devtools.domain.vo.ResultVo;
import com.wpp.devtools.service.UnAuthService;
import com.wpp.devtools.util.WXUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/wx/")
@Api(tags = {"微信相关接口服务"})
public class WXController {


    @Autowired
    private HttpServletRequest request;

    @GetMapping("wxUrlTokenValid")
    public String wxUrlTokenValid() {
        return WXUtils.checkUrl(request);
    }

}
