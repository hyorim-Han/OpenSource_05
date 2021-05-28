package com.cookandroid.project6_1;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.firestore.Exclude;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class FirebasePost {
    public String name;
    public double latitude;
    public double longitude;
    public int cnt_people;
    public String email;
    public String password;

    public FirebasePost(){}

    public FirebasePost(String name, String email, double latitude, double longitude, int cnt_people){
        this.name = name;
        this.email = email;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cnt_people = cnt_people;
        this.password = password;
    }

    @Exclude
    public HashMap<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("email", email);
        result.put("latitude", latitude);
        result.put("longitude", longitude);
        result.put("cnt_people", cnt_people);
        result.put("password", password);
        return result;
    }
}