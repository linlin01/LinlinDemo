package linlin.com.linlindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MyGridView extends AppCompatActivity {
    private GridView mgridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_grid_view);
        mgridview = (GridView)findViewById(R.id.gridview);
    }
}
