package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements iTweetable {
    private String text;
    protected Date date;

    public Tweet(String text, Date date) throws TweetTooLongException {
        this.setDate(date);
        this.setText(text);
    }

    public Tweet(String text) throws TweetTooLongException {
        this.setText(text);
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws TweetTooLongException {
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new TweetTooLongException();
        }
    }

    public abstract Boolean isImportant();

    public String toString() {
        return date.toString() + " | " + text;
    }
}
