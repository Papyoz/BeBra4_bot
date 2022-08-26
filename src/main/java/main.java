import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;

public class main {
    public static void main(String[] args){
        ApiContextInitializer.init();
        DefaultBotOptions botOptions= ApiContext.getInstance(DefaultBotOptions.class);

        botOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);
        botOptions.setProxyHost("localhot");
        botOptions.setProxyPort(9150);

        BeBra4_bot beBra4_bot =new BeBra4_bot(botOptions);
        TelegramBotsApi bostApi=new TelegramBotsApi();

        try{
            bostApi.registerBot(BeBra4_bot);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}