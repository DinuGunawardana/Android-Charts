package com.example.chartappfire;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
//import com.jjoe64.graphview.DefaultLabelFormatter;
//import com.jjoe64.graphview.GraphView;
//import com.jjoe64.graphview.series.DataPointInterface;
//import com.jjoe64.graphview.series.LineGraphSeries;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AndroidGraph extends AppCompatActivity {

    EditText yValue;
    Button btn_insert;

    FirebaseDatabase database;
    DatabaseReference reference;

    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//    GraphView graphView;
//    LineGraphSeries series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_graph);
        
//        yValue = findViewById(R.id.yaxis);
//        btn_insert = findViewById(R.id.btnInsert);
//        graphView = findViewById(R.id.graph);
//
//        database = FirebaseDatabase.getInstance();
//        reference = database.getReference("chartTable");
//
//        setListeners();
//
//        graphView.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter(){
//            @Override
//            public String formatLabel(double value, boolean isValueX) {
//
//                if (isValueX){
//                    return sdf.format(new Date((long) value));
//                }else{
//                    return super.formatLabel(value, isValueX);
//                }
//            }
//        });
    }

//    private void setListeners() {
//
//        btn_insert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String id = reference.push().getKey();
//                int x = (int) new Date().getTime();
//                int y = Integer.parseInt(yValue.getText().toString());
//
//                PointValue pointValue = new PointValue(x,y);
//
//                reference.child(id).setValue(pointValue);
//            }
//        });
//
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        reference.addValueEventListener(new ValueEventListener() {
//
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                DataPoint[] dp = new DataPoint[ (int) snapshot.getChildrenCount()];
//                int index=0;
//
//                for (DataSnapshot myDataSnapshot : snapshot.getChildren())
//                {
//                    PointValue pointValue = myDataSnapshot.getValue(PointValue.class);
//
//                    dp[index] = new DataPoint(pointValue.getxValue(), pointValue.getyValue());
//                    index++;
//                }
//
//                series.resetData((DataPointInterface[]) dp);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//
//    }
}