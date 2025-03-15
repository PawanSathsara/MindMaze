package edu.icet.service.impl;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class ExamServiceImpl implements ExamService {
    @Override
    public void createExam(Exam exam) {
        log.info(exam.toString());
    }

    @Override
    public Exam getExamByCourseId(Integer integer) {
        return null;
    }

    @Override
    public List<Exam> getAll() {
        return null;
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer integer) {

    }
}
