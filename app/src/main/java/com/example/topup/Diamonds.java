package com.example.topup;

import android.os.Parcel;
import android.os.Parcelable;

public class Diamonds implements Parcelable {
    private String diamonds;
    private String bonus;
    private String harga;

    public Diamonds(String diamonds, String bonus, String harga) {
        this.diamonds = diamonds;
        this.bonus = bonus;
        this.harga = harga;
    }

    public String getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(String diamonds) {
        this.diamonds = diamonds;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.diamonds);
        dest.writeString(this.bonus);
        dest.writeString(this.harga);
    }

    public void readFromParcel(Parcel source) {
        this.diamonds = source.readString();
        this.bonus = source.readString();
        this.harga = source.readString();
    }

    protected Diamonds(Parcel in) {
        this.diamonds = in.readString();
        this.bonus = in.readString();
        this.harga = in.readString();
    }

    public static final Creator<Diamonds> CREATOR = new Creator<Diamonds>() {
        @Override
        public Diamonds createFromParcel(Parcel source) {
            return new Diamonds(source);
        }

        @Override
        public Diamonds[] newArray(int size) {
            return new Diamonds[size];
        }
    };
}
