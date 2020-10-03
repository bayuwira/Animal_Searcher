package com.example.submissiondicodingandroidpemula;


import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public Item() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.detail);
        dest.writeInt(this.photo);
    }

    protected Item (Parcel dest){
        name = dest.readString();
        detail = dest.readString();
        photo = dest.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>(){
        @Override
        public Item createFromParcel(Parcel source) {
            return new Item (source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
}
