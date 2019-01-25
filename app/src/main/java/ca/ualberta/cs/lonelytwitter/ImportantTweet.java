package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Defines an important tweet
 *
 * @author lwmcdona
 * @version 1.0
 * @see ca.ualberta.cs.lonelytwitter.iTweetable
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs a tweet with specified text and date
     *
     * @param tweet the text belonging to the tweet
     * @param date  the date the tweet was posted
     * @throws TweetTooLongException occurs if tweet does not fit in the maximum character space
     */
    public ImportantTweet(String tweet, Date date) throws TweetTooLongException {
        super(tweet, date);
    }

    /**
     * Constructs a tweet with specified text and default date
     *
     * @param tweet the text belonging to the tweet
     * @throws TweetTooLongException occurs if tweet does not fit in the maximum character space
     */
    public ImportantTweet(String tweet) throws TweetTooLongException {
        super(tweet);
    }

    /**
     * Returns whether or not the tweet is important
     *
     * @return      Boolean.TRUE indicating the tweet is important
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
