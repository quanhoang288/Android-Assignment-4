package vn.hust.edu.gmaillistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    final ArrayList<CustomRowView> rows = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initializeData();

        CustomAdapter adapter = new CustomAdapter(this, rows);

        ListView mailListView = findViewById(R.id.mailListView);
        mailListView.setAdapter(adapter);
    }

    private void initializeData() {
        this.addRow(R.drawable.ic_launcher_foreground, "Edurila.com", "12:34 PM", "Test content");
        this.addRow(R.drawable.ic_launcher_foreground, "Chris Abad", "11:22 AM", "Test content 2");
        this.addRow(R.drawable.ic_launcher_foreground, "Tuto.com", "11:04 AM", "Test content 3");
        this.addRow(R.drawable.ic_launcher_foreground, "support", "10:26 AM", "Test content 4");
        this.addRow(R.drawable.ic_launcher_foreground, "Talent.com", "May 27", "Test content 5");
        this.addRow(R.drawable.ic_launcher_foreground, "Medium Daily Digest", "May 27", "Test content 6");
        this.addRow(R.drawable.ic_launcher_foreground, "Quan Hoang", "April 1", "Test content 7");
        this.addRow(R.drawable.ic_launcher_foreground, "Pio", "March 26", "Test content 9");
    }

    private void addRow(int avatarResourceId, String username, String time, String content) {
        rows.add(new CustomRowView(avatarResourceId, username, time, content));
    }
}