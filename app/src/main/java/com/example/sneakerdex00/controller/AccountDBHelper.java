package com.example.sneakerdex00.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AccountDBHelper extends SQLiteOpenHelper {


    public AccountDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    //onCreate() est appelée lors de la création de l'instance la première fois
    public void onCreate(SQLiteDatabase db) {
                 //code de création}

    }


    // onUpgrade() est appelée quand la base migre d'une version ancienne à une nouvelle version
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                // code de mise à jour
    }
}

