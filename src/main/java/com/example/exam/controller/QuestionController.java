package com.example.exam.controller;

import java.util.List;

import com.example.exam.bean.Pagination;
import com.example.exam.tools.PaginationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.exam.bean.Msg;
import com.example.exam.bean.Question;
import com.example.exam.service.QuestionService;
import com.example.exam.tools.ResultUtil;

/**
 * @author XBisA
 */
@RestController
@RequestMapping(value = "/api")
public class QuestionController {
    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(
        value  = "/questions",
        method = RequestMethod.GET
    )
    public Msg index() {
        List<Question> lists = questionService.list();

        if (lists.isEmpty()) {
            return ResultUtil.error(500, "服务器错误");
        }

        return ResultUtil.success(questionService.list(),null);
    }

    @RequestMapping(
            value  = "/questions/{page}",
            method = RequestMethod.GET
    )
    public Msg indexPage(@PathVariable int page) {
        int limit = 5;
        List<Question> lists = questionService.listWithPage(page,limit);
        if (lists.isEmpty()) {
            return ResultUtil.error(500, "服务器错误");
        }
        return ResultUtil.success(lists,PaginationUtil.format(page,questionService.total(),limit));
    }

    @RequestMapping(
        value    = "/questions/search",
        method   = RequestMethod.POST
    )
    public Msg search(@RequestParam(
        value    = "keywords",
        required = true
    ) String keywords) {
        List<Question> result = questionService.search(keywords);

        if (result.isEmpty()) {
            return ResultUtil.error(404, "找不到相关结果");
        }

        return ResultUtil.success(result,null);
    }
}
