package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Defines a normal tweet
 *
 * @author lwmcdona
 * @version 1.0
 * @see ca.ualberta.cs.lonelytwitter.iTweetable
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a tweet with specified text and date
     *
     * @param text the text belonging to the tweet
     * @param date the date the tweet was posted
     * @throws TweetTooLongException occurs if tweet does not fit in the maximum character space
     */
    public NormalTweet(String text, Date date) throws TweetTooLongException {
        super(text, date);
    }

    /**
     * Constructs a tweet with specified text and default date
     *
     * @param text the text belonging to the tweet
     * @throws TweetTooLongException occurs if tweet does not fit in the maximum character space
     */
    public NormalTweet(String text) throws TweetTooLongException {
        super(text);
    }

    /**
     * Returns whether or not the tweet is important
     *
     * @return      Boolean.FALSE indicating the tweet is not important
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
