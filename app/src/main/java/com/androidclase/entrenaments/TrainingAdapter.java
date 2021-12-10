package com.androidclase.entrenaments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class TrainingAdapter extends ArrayAdapter<EntrenamentUI> {

    private Context mContext;

    public TrainingAdapter(Context context, ArrayList<EntrenamentUI> entrenamentUI) {
        super(context, 0, entrenamentUI);
        mContext = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        EntrenamentUI entrenamentUI = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        ImageView trainingIco = (ImageView) convertView.findViewById(R.id.training_ico);
        TextView trainingText = (TextView) convertView.findViewById(R.id.training_text);

        trainingIco.setImageResource(entrenamentUI.getTrainingIco());
        trainingText.setText(entrenamentUI.getTrainingText());

        convertView.setTag(position);
        // Attach the click event handler
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer) view.getTag();
                EntrenamentUI entrenamentUI = getItem(position);
                Toast.makeText(mContext, entrenamentUI.getTrainingText(), Toast.LENGTH_SHORT).show();
                System.out.println(entrenamentUI.getTrainingText());
            }
        });

        return convertView;


    }
}
