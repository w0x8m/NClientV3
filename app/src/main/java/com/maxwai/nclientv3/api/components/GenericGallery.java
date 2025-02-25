package com.maxwai.nclientv3.api.components;

import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.maxwai.nclientv3.components.classes.Size;
import com.maxwai.nclientv3.files.GalleryFolder;
import com.maxwai.nclientv3.utility.Utility;

import java.util.Locale;

public abstract class GenericGallery implements Parcelable {

    public abstract int getId();

    public abstract Type getType();

    public abstract int getPageCount();

    public abstract boolean isValid();

    @NonNull
    public abstract String getTitle();

    public abstract Size getMaxSize();

    public abstract Size getMinSize();

    public abstract GalleryFolder getGalleryFolder();

    public String sharePageUrl(int i) {
        return String.format(Locale.US, "https://" + Utility.getHost() + "/g/%d/%d/", getId(), i + 1);
    }

    public boolean isLocal() {
        return getType() == Type.LOCAL;
    }

    public abstract boolean hasGalleryData();

    public abstract GalleryData getGalleryData();

    public enum Type {COMPLETE, LOCAL, SIMPLE}

}
