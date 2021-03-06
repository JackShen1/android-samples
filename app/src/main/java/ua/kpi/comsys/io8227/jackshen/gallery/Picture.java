package ua.kpi.comsys.io8227.jackshen.gallery;

import java.io.Serializable;

public class Picture implements Serializable {

    /** ID of the image */
    private String mImageID;

    /** URL of the image */
    private String mImageUrl;

    /** Tags of the image */
    private String mImageTags;

    /** Width of the image */
    private String mImageWidth;

    /** Height of the image */
    private String mImageHeight;

    /** Number of image views */
    private String mImageViews;

    /** Number of image downloads */
    private String mImageDownloads;

    /** Number of image saves */
    private String mImageFavorites;

    /** Number of image likes */
    private String mImageLikes;

    /** User name */
    private String mUserName;

    /** User image */
    private String mUserImage;


    /**
     * Create picture object
     *
     * @param imageID        - ID of the image
     * @param imageUrl       - the URL of the image
     * @param imageTags      - tags of the image
     * @param imageWidth     - width of the image
     * @param imageHeight    - height of the image
     * @param imageViews     - number of image views
     * @param imageDownloads - number of image downloads
     * @param imageFavorites - number of image saves
     * @param imageLikes     - number of image likes
     * @param userName       - user name
     * @param userImage      - user image
     */
    Picture(String imageID, String imageUrl, String imageTags, String imageWidth, String imageHeight, String imageViews,
            String imageDownloads, String imageFavorites, String imageLikes, String userName,
            String userImage) {
        this.mImageID = imageID;
        this.mImageUrl = imageUrl;
        this.mImageTags = imageTags;
        this.mImageWidth = imageWidth;
        this.mImageHeight = imageHeight;
        this.mImageViews = imageViews;
        this.mImageDownloads = imageDownloads;
        this.mImageFavorites = imageFavorites;
        this.mImageLikes = imageLikes;
        this.mUserName = userName;
        this.mUserImage = userImage;

    }

    /** Return ID of the image */
    String getImageID() { return mImageID; }

    /** Return the URL of the image */
    String getImageUrl() { return mImageUrl; }

    /** Return tags of the image */
    String getImageTags() { return mImageTags; }

    /** Return width of the image */
    String getImageWidth() { return mImageWidth; }

    /** Return height of the image */
    String getImageHeight() { return mImageHeight; }

    /** Return number of image views */
    String getViews() { return mImageViews; }

    /** Return number of image downloads */
    String getDownloads() { return mImageDownloads; }

    /** Return number of image saves */
    String getFavorites() { return mImageFavorites; }

    /** Return number of image likes */
    String getLikes() { return mImageLikes; }

    /** Return user names */
    String getUser() { return mUserName; }

    /** Return user image */
    String getUserImage() { return mUserImage; }


}
