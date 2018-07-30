package com.example.exam.service;

import java.util.List;

import com.example.exam.bean.Question;

/**
 * @author XBisA
 */
public interface QuestionService {

    /**
     * 获得所有问题
     * @return Question
     */
    List<Question> list();

    /**
     * 模糊查询所有关键词
     * @return Question
     */
    List<Question> search(String keyword);

    /**
     * 分页查询
     * @return Question
     */
    List<Question> listWithPage(int page,int limit);

    /**
     * 返回总数
     * @return int
     */
    int total();
}
