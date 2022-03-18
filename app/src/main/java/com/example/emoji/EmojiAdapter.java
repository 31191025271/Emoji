package com.example.emoji;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EmojiAdapter extends ArrayAdapter {
    public EmojiAdapter(@NonNull Context context, int resource, @NonNull List objects){
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View myView = super.getView(position, convertView, parent);
        return myView;
    }
}
