package aa.bb.demolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
Button btnTable,btnGrid,btnFrame,btnRelative,btnConstrainty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTable=findViewById(R.id.btnTable);
        btnGrid=findViewById(R.id.btnGrid);
        btnFrame=findViewById(R.id.btnFrame);
        btnRelative=findViewById(R.id.btnRelative);
        btnConstrainty=findViewById(R.id.btnConstraint);
        btnTable.setOnClickListener(this);
        btnGrid.setOnClickListener(this);
        btnFrame.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnConstrainty.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent it=null;
        int id=view.getId();
        if (id==R.id.btnTable){
            it = new Intent(MainActivity.this, TableActivity.class);
        }
        else if (id==R.id.btnGrid){
            it = new Intent(MainActivity.this, GridActivity.class);
        }
        else if (id==R.id.btnFrame){
            it = new Intent(MainActivity.this, FrameActivity.class);
        }
        else if (id==R.id.btnRelative){
            it = new Intent(MainActivity.this, RelativeActivity.class);
        }
        else if (id==R.id.btnConstraint){
            it = new Intent(MainActivity.this, ConstraintActivity.class);
        }
        startActivity(it);
    }
}