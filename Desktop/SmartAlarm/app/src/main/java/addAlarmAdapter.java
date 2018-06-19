import android.app.Activity;
import android.app.PendingIntent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.smartalarm.R;

import java.util.ArrayList;

/**
 * Created by priya on 7/9/17.
 */

public class addAlarmAdapter extends ArrayAdapter<PendingIntent> {

    private static final String LOG_TAG = addAlarmAdapter.class.getSimpleName();

    public addAlarmAdapter(Activity context) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Alarm currentWord = 

        TextView TimeTextView = (TextView) listItemView.findViewById(R.id.Time);

        TimeTextView.setText(currentWord.getnTime());

        TextView labelTextView = (TextView) listItemView.findViewById(R.id.Label);

        labelTextView.setText(currentWord.getnLabel());

        TextView statusTextView = (TextView) listItemView.findViewById(R.id.Status);

        statusTextView.setText(currentWord.getnStatus());

        TextView idTextView = (TextView) listItemView.findViewById(R.id.alarmID);

        idTextView.setText(currentWord.getnId());


    }
}

