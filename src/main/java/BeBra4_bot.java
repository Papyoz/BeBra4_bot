import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BeBra4_bot extends TelegramLongPollingBot {

    private static final String TOKEN="5472971106:AAEQid78UH5Z_x2jbF3g6wzfqy_ibC98xHc";
    private static final String USERNAME="BeBra4_bot ";
    public BeBra4_bot (DefaultBotOptions options) { super(options);}

    public String getBotToken() {return TOKEN;}
    public String getBotUsername() {return USERNAME;}

    public void onUpdateReceived(Update update) {
        if(update.getMessage()!=null && update.getMessage().hasText()) {
            long chat_id= update.getMessage().getChatId();
            try{
                execute(new SendMessage(chat_id,"Привет"+ update.getMessage().getText()));
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
    }
}
