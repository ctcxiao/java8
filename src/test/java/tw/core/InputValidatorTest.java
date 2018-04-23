package tw.core;

import org.junit.Assert;
import org.junit.Test;
import tw.validator.InputValidator;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {

    @Test
    public void test_validate(){
        InputValidator inputValidator = new InputValidator();
        String correct_input = "1 2 3 4";
        String incorrect_input = "11 2 3 4";
        String incorrect_input1 = "1 2 3 4 5";

        Assert.assertTrue(inputValidator.validate(correct_input));
        Assert.assertFalse(inputValidator.validate(incorrect_input));
        Assert.assertFalse(inputValidator.validate(incorrect_input1));
    }
}
