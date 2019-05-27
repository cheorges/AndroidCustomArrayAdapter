package com.zotteljedi.listexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {

    private Context context;

    public ItemAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        }

        TextView myText = convertView.findViewById(R.id.myText);
        TextView mySubText = convertView.findViewById(R.id.mySubText);

        Item item = getItem(position);

        myText.setText(item.getText());
        mySubText.setText(item.getSubText());

        return convertView;
    }
}
