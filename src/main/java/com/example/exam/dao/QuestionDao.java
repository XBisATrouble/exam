package com.example.exam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.exam.bean.Question;

/**
 * @author XBisA
 */
@Mapper
public interface QuestionDao {

    /**
     * 根据用户名称查询用户信息
     * @return Question
     */
    @Select("SELECT * FROM question")
    List<Question> find();

    /**
     * 模糊查询所有关键词
     * @return Question
     */
    @Select("select * from question where " + "questionContent like CONCAT(CONCAT('%', #{keyword}), '%') or "
            + "questionId like CONCAT(CONCAT('%', #{keyword}), '%') or "
            + "answerA like CONCAT(CONCAT('%', #{keyword}), '%') or "
            + "answerB like CONCAT(CONCAT('%', #{keyword}), '%') or "
            + "answerC like CONCAT(CONCAT('%', #{keyword}), '%') or "
            + "answerD like CONCAT(CONCAT('%', #{keyword}), '%') or "
            + "answer like CONCAT(CONCAT('%', #{keyword}), '%')")
    List<Question> search(String keyword);

    /**
     * 分页查询
     * @return Question
     */
    @Select("select * from question limit #{page},5")
    List<Question> findWithPage(int page);

    /**
     * 返回总个数
     * @return int
     */
    @Select("select count(*) from question")
    int total();
}
