package tw.controllers;

import com.google.inject.Injector;
import org.junit.Test;
import tw.GuessNumberModule;
import tw.commands.GuessInputCommand;

import java.io.IOException;

import static com.google.inject.Guice.createInjector;
import static junit.framework.TestCase.fail;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {

    @Test
    public void test_play(){
        //how to test play with user input,i can not input anything when test running

        
//        Injector injector = createInjector(new GuessNumberModule());
//        GameController gameController = injector.getInstance(GameController.class);
//        try {
//            gameController.play(new GuessInputCommand());
//        } catch (IOException e){
//            fail("test fail!!IOException throw, game play fail");
//        }
    }
}