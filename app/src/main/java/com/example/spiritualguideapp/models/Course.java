package com.example.spiritualguideapp.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Course implements Parcelable {
    private String id;
    private String title;
    private String description;
    private double fee;
    private String features;
    private String support;
    private String imageUrl;

    public Course() {}

    public Course(String id, String title, String description, double fee, String features, String support) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.fee = fee;
        this.features = features;
        this.support = support;
    }

    protected Course(Parcel in) {
        id = in.readString();
        title = in.readString();
        description = in.readString();
        fee = in.readDouble();
        features = in.readString();
        support = in.readString();
        imageUrl = in.readString();
    }

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel in) {
            return new Course(in);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }
    };

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }
    
    public String getFeatures() { return features; }
    public void setFeatures(String features) { this.features = features; }
    
    public String getSupport() { return support; }
    public void setSupport(String support) { this.support = support; }
    
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeDouble(fee);
        dest.writeString(features);
        dest.writeString(support);
        dest.writeString(imageUrl);
    }
}