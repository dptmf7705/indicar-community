package com.indicar.indicar_community.model.vo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yeseul on 2018-03-26.
 */

public class FileDetailVO implements Parcelable{
    private String _id;
    private String atch_file_id;
    private int file_sn;
    private String file_stre_cours;
    private String stre_file_nm;
    private String orignl_file_nm;
    private String file_extsn;
    private String file_cn;
    private int file_size;
    private int __v;
    private String fileStoreUri;

    public FileDetailVO() {
    }

    protected FileDetailVO(Parcel in) {
        _id = in.readString();
        atch_file_id = in.readString();
        file_sn = in.readInt();
        file_stre_cours = in.readString();
        stre_file_nm = in.readString();
        orignl_file_nm = in.readString();
        file_extsn = in.readString();
        file_cn = in.readString();
        file_size = in.readInt();
        __v = in.readInt();
        fileStoreUri = in.readString();
    }

    public static Creator<FileDetailVO> getCREATOR() {
        return CREATOR;
    }

    public static final Creator<FileDetailVO> CREATOR = new Creator<FileDetailVO>() {
        @Override
        public FileDetailVO createFromParcel(Parcel in) {
            return new FileDetailVO(in);
        }

        @Override
        public FileDetailVO[] newArray(int size) {
            return new FileDetailVO[size];
        }
    };

    @Override
    public String toString() {
        return "FileDetailVO{" +
                "_id='" + _id + '\'' +
                ", atch_file_id='" + atch_file_id + '\'' +
                ", file_sn=" + file_sn +
                ", file_stre_cours='" + file_stre_cours + '\'' +
                ", stre_file_nm='" + stre_file_nm + '\'' +
                ", orignl_file_nm='" + orignl_file_nm + '\'' +
                ", file_extsn='" + file_extsn + '\'' +
                ", file_cn='" + file_cn + '\'' +
                ", file_size=" + file_size +
                ", __v=" + __v +
                '}';
    }

    public String getFileStoreUri() {
        return fileStoreUri;
    }

    public void setFileStoreUri(String fileStoreUri) {
        this.fileStoreUri = fileStoreUri;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAtch_file_id() {
        return atch_file_id;
    }

    public void setAtch_file_id(String atch_file_id) {
        this.atch_file_id = atch_file_id;
    }

    public int getFile_sn() {
        return file_sn;
    }

    public void setFile_sn(int file_sn) {
        this.file_sn = file_sn;
    }

    public String getFile_stre_cours() {
        return file_stre_cours;
    }

    public void setFile_stre_cours(String file_stre_cours) {
        this.file_stre_cours = file_stre_cours;
    }

    public String getStre_file_nm() {
        return stre_file_nm;
    }

    public void setStre_file_nm(String stre_file_nm) {
        this.stre_file_nm = stre_file_nm;
    }

    public String getOrignl_file_nm() {
        return orignl_file_nm;
    }

    public void setOrignl_file_nm(String orignl_file_nm) {
        this.orignl_file_nm = orignl_file_nm;
    }

    public String getFile_extsn() {
        return file_extsn;
    }

    public void setFile_extsn(String file_extsn) {
        this.file_extsn = file_extsn;
    }

    public String getFile_cn() {
        return file_cn;
    }

    public void setFile_cn(String file_cn) {
        this.file_cn = file_cn;
    }

    public int getFile_size() {
        return file_size;
    }

    public void setFile_size(int file_size) {
        this.file_size = file_size;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(_id);
        parcel.writeString(atch_file_id);
        parcel.writeInt(file_sn);
        parcel.writeString(file_stre_cours);
        parcel.writeString(stre_file_nm);
        parcel.writeString(orignl_file_nm);
        parcel.writeString(file_extsn);
        parcel.writeString(file_cn);
        parcel.writeInt(file_size);
        parcel.writeInt(__v);
        parcel.writeString(fileStoreUri);
    }
}