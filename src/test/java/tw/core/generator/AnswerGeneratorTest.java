package tw.core.generator;

import org.junit.Test;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

import static junit.framework.TestCase.fail;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {

    @Test
    public void test_generate(){
        AnswerGenerator answerGenerator = new AnswerGenerator(new RandomIntGenerator());
        try {
            Answer answer = answerGenerator.generate();
        }catch (OutOfRangeAnswerException e){
            fail("out of range exception! generate answer failed!");
        }
    }
}

