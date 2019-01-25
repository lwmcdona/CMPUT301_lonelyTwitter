package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Defines a tweet
 *
 * @author lwmcdona
 * @version 1.0
 * @see ca.ualberta.cs.lonelytwitter.iTweetable
 */
public abstract class Tweet implements iTweetable {
    private String text;
    protected Date date;

    /**
     * Constructs a tweet with specified text and date
     *
     * @param text the text belonging to the tweet
     * @param date the date the tweet was posted
     * @throws TweetTooLongException occurs if tweet does not fit in the maximum character space
     */
    public Tweet(String text, Date date) throws TweetTooLongException {
        this.setDate(date);
        this.setText(text);
    }

    /**
     * Constructs a tweet with specified text and default date
     *
     * @param text the text belonging to the tweet
     * @throws TweetTooLongException occurs if tweet does not fit in the maximum character space
     */
    public Tweet(String text) throws TweetTooLongException {
        this.setText(text);
        this.date = new Date();
    }

    /**
     * Gets the date for the tweet
     *
     * @return date of the tweet
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date
     *
     * @param date date for the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the text for the tweet
     *
     * @return text field
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text
     *
     * @param text string type parameter
     * @throws TweetTooLongException occurs if tweet does not fit in the maximum character space
     */
    public void setText(String text) throws TweetTooLongException {
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns Boolean.TRUE if the tweet is important and Boolean.FALSE if it is not
     *
     * @return whether the tweet is important
     */
    public abstract Boolean isImportant();

    /**
     * Converts a Tweet to a String
     *
     * @return the text representing a Tweet object
     */
    public String toString() {
        return date.toString() + " | " + text;
    }
}
