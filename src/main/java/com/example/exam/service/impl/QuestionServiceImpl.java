package com.example.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.bean.Question;
import com.example.exam.dao.QuestionDao;
import com.example.exam.service.QuestionService;

/**
 * @author XBisA
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    private final QuestionDao questionDao;

    @Autowired
    public QuestionServiceImpl(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public List<Question> list() {
        return questionDao.find();
    }

    @Override
    public List<Question> search(String keyword) {
        return questionDao.search(keyword);
    }

    @Override
    public List<Question> listWithPage(int page,int limit)
    {
        return questionDao.findWithPage((page-1)*limit);
    }

    @Override
    public int total() {
        return questionDao.total();
    }
}
