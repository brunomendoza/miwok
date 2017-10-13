package com.example.android.miwok;

/**
 * Created by bruno on 13/10/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranstalation, String miwokTranstalation) {
        this.mDefaultTranslation = defaultTranstalation;
        this.mMiwokTranslation = miwokTranstalation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
