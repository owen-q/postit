package io.owen.postit.commands.notvalid;

import com.fasterxml.jackson.databind.JsonNode;
import io.owen.postit.commands.Command;
import io.owen.postit.commands.CommandHandler;
import io.owen.postit.commands.UserState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by owen_q on 2018. 7. 13..
 */
@Command(name = "아직 잘 모르겠어요", state = )
public class ExceptionState implements CommandHandler {
    private Logger logger = LoggerFactory.getLogger(ExceptionState.class);


    @Override
    public boolean isValidAction(UserState nextUserState) {
        return false;
    }

    @Override
    public JsonNode handle(String userKey, Map<String, Object> attrs) {
        return null;
    }

    @Override
    public JsonNode generateResponse() {
        return null;
    }
}
