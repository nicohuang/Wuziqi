package hwz.com.wuziqi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class mainActivity extends Activity
{

    GobangView gbv;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        int width = display.getWidth();
        Width.width= width;
        System.out.println(Width.width);
        System.out.println(width);

        gbv = (GobangView) this.findViewById(R.id.gobangview);
        gbv.setTextView((TextView) this.findViewById(R.id.text));
        Button button = (Button)findViewById(R.id.btn_restart);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                gbv.init();
                gbv.invalidate();
                gbv.mStatusTextView.setVisibility(View.INVISIBLE);
            }
        });


    }
}