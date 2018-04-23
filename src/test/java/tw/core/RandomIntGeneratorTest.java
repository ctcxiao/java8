package tw.core;


import org.junit.Assert;
import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import static junit.framework.TestCase.fail;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {

    @Test
    public void test_generateNums(){
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        test_illegal_argument_generate_nums(randomIntGenerator);
        test_legal_argument_generate_nums(randomIntGenerator);
    }

    private void test_legal_argument_generate_nums(RandomIntGenerator randomIntGenerator) {
        try {
            randomIntGenerator.generateNums(9,4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private void test_illegal_argument_generate_nums(RandomIntGenerator randomIntGenerator) {
        try {
            randomIntGenerator.generateNums(4,9);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e){
            Assert.assertEquals("Can't ask for more numbers than are available", e.getMessage());
        }
    }
}