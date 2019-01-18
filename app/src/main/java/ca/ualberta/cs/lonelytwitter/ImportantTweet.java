package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {

    public ImportantTweet(String tweet, Date date) throws TweetTooLongException {
        super(tweet, date);
    }

    public ImportantTweet(String tweet) throws TweetTooLongException {
        super(tweet);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
