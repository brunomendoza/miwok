package com.example.android.miwok;

/**
 * Created by bruno on 13/10/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResId;

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
}
