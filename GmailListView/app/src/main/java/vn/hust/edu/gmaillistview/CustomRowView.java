package vn.hust.edu.gmaillistview;

public class CustomRowView {
    // the resource ID for the imageView
    private int imageViewResourceId;
    private String username;
    private String time;
    private String content;


    // create constructor to set the values for all the parameters of the each single view
    public CustomRowView(int imageViewResourceId, String username, String time, String content) {
        this.imageViewResourceId = imageViewResourceId;
        this.username = username;
        this.time = time;
        this.content = content;
    }

    // getter method for returning the ID of the imageview
    public int getImageViewResourceId() {
        return this.imageViewResourceId;
    }

    public String getUsername() {
        return this.username;
    }

    public String getTime() {
        return this.time;
    }

    public String getContent() {
        return this.content;
    }
}
