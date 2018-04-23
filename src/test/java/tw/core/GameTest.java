package tw.core;

import org.junit.Assert;
import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.generator.AnswerGenerator;
import tw.core.generator.RandomIntGenerator;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {

    @Test
    public void test_guess()throws OutOfRangeAnswerException{
        Answer answer = Answer.createAnswer("1 2 3 4");
        AnswerGenerator answerGenerator = new AnswerGenerator(new RandomIntGenerator());
        Game game = new Game(answerGenerator);
        Assert.assertTrue(game.guess(answer) != null);

    }

    @Test
    public void test_checkStatus() throws OutOfRangeAnswerException{
        Answer answer = Answer.createAnswer("1 2 3 4");
        AnswerGenerator answerGenerator = new AnswerGenerator(new RandomIntGenerator());
        Game game = new Game(answerGenerator);
        Assert.assertEquals("continue", game.checkStatus());


        for (int i = 0; i < 7; i++) {
            game.guess(answer);
        }
        Assert.assertEquals("fail", game.checkStatus());

        //how to test success, its inputAnswer is random?
//        Answer correct_answer = Answer.createAnswer("4 A 0 B");
//        Game game_corr = new Game(answerGenerator);
//        game_corr.guess(correct_answer);
//        Assert.assertEquals("success", game_corr.checkStatus());
    }
}
