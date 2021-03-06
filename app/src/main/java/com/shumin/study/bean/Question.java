package com.shumin.study.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Administrator on 2016/5/2 0002.
 */
@DatabaseTable(tableName = Question.TABLE_NAME)
public class Question {

    public static final String TABLE_NAME = "question";
    public static final String COLUMN_SUBJECT = "subject";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_OPTION1 = "option1";
    public static final String COLUMN_OPTION2 = "option2";
    public static final String COLUMN_OPTION3 = "option3";
    public static final String COLUMN_OPTION4 = "option4";
    public static final String COLUMN_IS_CORRECT = "is_correct";
    public static final String COLUMN_RIGHT_ANSWER = "right_answer";
    public static final String COLUMN_QUESTIONS_ID = "questions_id";

    public static final int TYPE_JUDGMENT = 1;
    public static final int TYPE_CHOICE = 2;

    @DatabaseField(generatedId = true, columnName = "id", unique = true)
    private long mId;
    @DatabaseField(columnName = COLUMN_SUBJECT)
    private String mSubject;
    @DatabaseField(columnName = COLUMN_TYPE)
    private int mType;
    @DatabaseField(columnName = COLUMN_OPTION1)
    private String mOption1;
    @DatabaseField(columnName = COLUMN_OPTION2)
    private String mOption2;
    @DatabaseField(columnName = COLUMN_OPTION3)
    private String mOption3;
    @DatabaseField(columnName = COLUMN_OPTION4)
    private String mOption4;
    @DatabaseField(columnName = COLUMN_IS_CORRECT)
    private boolean mIsCorrect;
    @DatabaseField(columnName = COLUMN_RIGHT_ANSWER)
    private int mRightAnswer;
    @DatabaseField(columnName = COLUMN_QUESTIONS_ID)
    private long mQuestionsId;

    public String getSubject() {
        return mSubject;
    }

    public void setSubject(String subject) {
        mSubject = subject;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        mType = type;
    }

    public String getOption1() {
        return mOption1;
    }

    public void setOption1(String option1) {
        mOption1 = option1;
    }

    public String getOption2() {
        return mOption2;
    }

    public void setOption2(String option2) {
        mOption2 = option2;
    }

    public String getOption3() {
        return mOption3;
    }

    public void setOption3(String option3) {
        mOption3 = option3;
    }

    public String getOption4() {
        return mOption4;
    }

    public void setOption4(String option4) {
        mOption4 = option4;
    }

    public boolean isCorrect() {
        return mIsCorrect;
    }

    public void setCorrect(boolean correct) {
        mIsCorrect = correct;
    }

    public int getRightAnswer() {
        return mRightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        mRightAnswer = rightAnswer;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public long getQuestionsId() {
        return mQuestionsId;
    }

    public void setQuestionsId(long questionsId) {
        mQuestionsId = questionsId;
    }
}
