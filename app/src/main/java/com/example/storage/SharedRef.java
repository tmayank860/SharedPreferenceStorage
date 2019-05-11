package com.example.storage;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedRef {
    SharedPreferences sharedRef;

    public SharedRef(Context context){
         sharedRef = context.getSharedPreferences("MyRef",Context.MODE_PRIVATE);

    }
    public void Save(String Name,String Pass){
        SharedPreferences.Editor editor=sharedRef.edit();
        editor.putString("UserName",Name);
        editor.putString("Password",Pass);
        editor.commit();
    }

    public String Load(){
        String FileContent="UserName:"+sharedRef.getString("UserName","NoName");
        FileContent+="Password"+sharedRef.getString("Password","NoPassword");
        return FileContent;
    }
}
