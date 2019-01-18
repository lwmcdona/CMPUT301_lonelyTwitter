package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalTweet extends Tweet {

    public NormalTweet(String text, Date date) throws TweetTooLongException {
        super(text, date);
    }

    public NormalTweet(String text) throws TweetTooLongException {
        super(text);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
