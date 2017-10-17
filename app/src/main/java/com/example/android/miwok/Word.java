package com.example.android.miwok;

/**
 * Created by bruno on 13/10/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranstalation, String miwokTranstalation) {
        this.mDefaultTranslation = defaultTranstalation;
        this.mMiwokTranslation = miwokTranstalation;
        this.mImageResId = NO_IMAGE_PROVIDED;
    }

    public Word(String defaultTranstalation, String miwokTranstalation, int imageResId) {
        this.mDefaultTranslation = defaultTranstalation;
        this.mMiwokTranslation = miwokTranstalation;
        this.mImageResId = imageResId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() { return mImageResId; }

    public boolean hasImage() {
        return mImageResId != NO_IMAGE_PROVIDED;
    }
}
