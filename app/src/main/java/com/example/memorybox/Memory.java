package com.example.memorybox;

import android.os.Parcel;
import android.os.Parcelable;

public class Memory implements Parcelable {

    private int rating;
    private String name;
    private String desc;
    private int imageResourceId;

    public Memory(int rating, String name, String desc, int imageResourceId){
        this.rating = rating;
        this.name = name;
        this.desc = desc;
        this.imageResourceId = 0;
    }
    public static final Parcelable.Creator<Memory> CREATOR = new
            Parcelable.Creator<Memory>() {

                @Override
                public Memory createFromParcel(Parcel parcel) {
                    return new Memory(parcel);
                }

                @Override
                public Memory[] newArray(int size) {return new Memory[0];
                }
            };

    public Memory(Parcel parcel){
        rating = parcel.readInt();
        name = parcel.readString();
        desc = parcel.readString();
        imageResourceId = parcel.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        // here we customize this code to match the object we are sending
        dest.writeInt(rating);
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeInt(imageResourceId);

    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
