package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Defines an interface to be implemented by all tweets
 *
 * @author lwmcdona
 * @version 1.0
 */
public interface iTweetable {

    /**
     * Returns the text contained in a tweet
     *
     * @return      the text in the tweet
     */
    public String getText();

    /**
     * Gets the date the tweet was created
     *
     * @return      the date the tweet was created
     */
    public Date getDate();
}
