package vn.hust.edu.gmaillistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomRowView> {
    public CustomAdapter(@NonNull Context context, ArrayList<CustomRowView> rows) {
        super(context, 0, rows);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currentItemView = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview_item, parent, false);
        }

        CustomRowView currentRowItem = getItem(position);

        ImageView avatar = currentItemView.findViewById(R.id.avatar);
        assert currentRowItem != null;
        avatar.setImageResource(currentRowItem.getImageViewResourceId());

        TextView usernameTextView = currentItemView.findViewById(R.id.usernameTextView);
        usernameTextView.setText(currentRowItem.getUsername());

        TextView timeTextView= currentItemView.findViewById(R.id.timeTextView);
        timeTextView.setText(currentRowItem.getTime());

        TextView contentView = currentItemView.findViewById(R.id.contentTextView);
        contentView.setText(currentRowItem.getContent());

        // then return the recyclable view
        return currentItemView;
    }
}
