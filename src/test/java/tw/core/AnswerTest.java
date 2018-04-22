package tw.core;

import org.junit.Assert;
import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.model.Record;

import static junit.framework.TestCase.fail;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {

    @Test
    public void test_validate(){
        Answer validate_answer = Answer.createAnswer("1 2 3 4");
        try{
            validate_answer.validate();
        }catch (OutOfRangeAnswerException e){
            System.out.println(e.getMessage());
        }

        Answer invalidate_answer = Answer.createAnswer("1 2 3 4 11");
        try{
            invalidate_answer.validate();
            fail("Expected an IndexOutOfBoundsException to be thrown");
        }catch (OutOfRangeAnswerException e){
            Assert.assertEquals("Answer format is incorrect", e.getMessage());
        }
    }

    @Test
    public void test_check(){
        Answer input_answer = Answer.createAnswer("1 5 3 6");
        Answer answer = Answer.createAnswer("1 2 3 4");

        Record record = new Record();
        record.increaseCurrentNum();
        record.increaseCurrentNum();

        Answer input_answer1 = Answer.createAnswer("1 3 5 6");
        Answer answer1 = Answer.createAnswer("1 2 3 4");

        Record record1 = new Record();
        record1.increaseCurrentNum();
        record1.increaseIncludeOnlyNum();

        Assert.assertArrayEquals(record1.getValue(), answer1.check(input_answer1).getValue());
        Assert.assertArrayEquals(record.getValue(), answer.check(input_answer).getValue());
    }


}