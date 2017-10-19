package com.example.android.miwok;

/**
 * Created by bruno on 13/10/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResId;
    private int mAudioResId;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    public Word(String defaultTranstalation, String miwokTranstalation) {
        this.mDefaultTranslation = defaultTranstalation;
        this.mMiwokTranslation = miwokTranstalation;
        this.mImageResId = NO_IMAGE_PROVIDED;
        this.mAudioResId = NO_AUDIO_PROVIDED;
    }

    public Word(String defaultTranstalation, String miwokTranstalation, int imageResId) {
        this.mDefaultTranslation = defaultTranstalation;
        this.mMiwokTranslation = miwokTranstalation;
        this.mImageResId = imageResId;
        mAudioResId = NO_AUDIO_PROVIDED;
    }

    public Word(String defaultTranstalation, String miwokTranstalation, int imageResId, int audioResId) {
        this.mDefaultTranslation = defaultTranstalation;
        this.mMiwokTranslation = miwokTranstalation;
        this.mImageResId = imageResId;
        this.mAudioResId = audioResId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() { return mImageResId; }

    public int getAudioResourceId() {
        return mAudioResId;
    }

    public boolean hasImage() {
        return mImageResId != NO_IMAGE_PROVIDED;
    }

    public boolean hasAudio() {
        return mAudioResId != NO_AUDIO_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResId=" + mImageResId +
                ", mAudioResId=" + mAudioResId +
                '}';
    }
}
