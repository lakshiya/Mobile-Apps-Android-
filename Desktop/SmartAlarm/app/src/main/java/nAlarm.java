import com.example.android.smartalarm.Data.AlarmContract;

import static android.R.attr.id;
import static android.R.attr.label;

/**
 * Created by priya on 7/9/17.
 */

public class Alarm {

    private String nId;

    private String nHour;

    private String nMinute;

    private String nLabel;

    private String nStatus;

    public nAlarm()
    {
        setnId(AlarmContract.AlarmEntry.COLUMN_ID);
        setnHour(AlarmContract.AlarmEntry.COLUMN_HOUR);
        setnMinute(AlarmContract.AlarmEntry.COLUMN_MINUTE);
        setnLabel(AlarmContract.AlarmEntry.COLUMN_LABEL);
        setnStatus(AlarmContract.AlarmEntry.COLUMN_STATUS);
    }

    public void setnId(String id)
    {
        nId=id;
    }
    public void setnHour(String hour)
    {
        nHour=hour;
    }
    public void setnMinute(String minute)
    {
        nMinute=minute;
    }
    public void setnLabel(String nlabel)
    {
        nLabel=nlabel;
    }
    public void setnStatus(String status)
    {
        nStatus=status;
    }
    public String getnId()
    {
        return nId;
    }

    public String getnTime() {return  nHour+nMinute; }

    public String getnLabel()
    {
        return nLabel;
    }

    public String getnStatus()
    {
        return nStatus;
    }


}



