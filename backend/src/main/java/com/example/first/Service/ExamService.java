package com.example.first.Service;

import com.example.first.Model.Exam;
import com.example.first.Model.Question;
import com.example.first.Model.Result;
import com.example.first.Repository.ExamRepository;
import com.example.first.Repository.QuestionRepository;
import com.example.first.Repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ResultRepository resultRepository;


    // List Exam
    public List<Exam> getAllExams(){
        return examRepository.findAll();
    }

    // List Questions
    public List<Question> getQuestionsByExamId(Long examId){
        return questionRepository.findByExamId(examId);
    }

    // Data save
    // Exam
    public Exam saveExam(Exam exam)
    {
        return examRepository.save(exam);
    }
    // List of Questions
    public List<Question> saveQuestions(List<Question> questions){
        return questionRepository.saveAll(questions);
    }
    // Result
    public Result submitResult(Result result){
        return resultRepository.save(result);
    }

    public List<Result> getAllResults(){
        return resultRepository.findAll();
    }

    // Delete
    public boolean deleteExamById(Long id){
        if(examRepository.existsById(id)){
            examRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    public boolean deleteQuestionById(Long id){
        if(questionRepository.existsById(id)){
            questionRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    public List<Result> getResultsByStudent(String studentName) {
        return resultRepository.findByStudentName(studentName);
    }
}
