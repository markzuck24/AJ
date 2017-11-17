package com.example.markzuck.gpslocation;

import android.support.annotation.NonNull;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.telephony.SmsManager;
        import android.util.Log;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.markzuck.gpslocation.GPSTracker;


public class MainActivity extends AppCompatActivity {
    String vehno;
    TextView name,con1,con2,con3;
    String conn1,conn2,conn3,lg,lt;
    //FirebaseFirestore firestore;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        GPSTracker gp = new GPSTracker(getApplicationContext());
        long longi = (long) gp.getLongitude();
        lg= String.valueOf(longi);

        Log.v("AJ",lg);
        Log.v("AJ",lt);

        long lati = (long) gp.getLatitude();
        lt= String.valueOf(lati);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* vehno = getIntent().getStringExtra("vehino");
        name = (TextView)findViewById(R.id.name);
        con1 = (TextView)findViewById(R.id.con1);
        con2 = (TextView)findViewById(R.id.con2);
        con3 = (TextView)findViewById(R.id.con3);
        firestore = FirebaseFirestore.getInstance();
        firestore.collection(vehno+"prodata")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (DocumentSnapshot document : task.getResult()) {
                                Log.d("data", "=>" + document.getData() + document.get("name") + document.get("veh") + document.get("email"));
                                name.setText("Name :    "+document.get("name").toString());

                            }

                        } else {
                            Log.e("data", "error occured user main" + task.getException());
                        }

                    }
                });
        firestore.collection(vehno+"contacts")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (DocumentSnapshot document : task.getResult()) {
                                Log.d("data", "=>" + document.getData() + document.get("contact1") + document.get("contact2") + document.get("contact3"));
                                con1.setText("1. "+document.get("contact1"));
                                Log.v("tag",conn1 +"  "+conn2+"  "+conn3);

                                conn1 = ""+document.get("contact1");
                                Log.v("tag",conn1 +"  "+conn2+"  "+conn3);

                                con2.setText("2. "+document.get("contact2"));
                                conn2 = document.get("contact2").toString().trim();
                                con3.setText("3. "+document.get("contact3"));
                                Log.v("tag",conn1 +"  "+conn2+"  "+conn3);

                                conn3 = ""+document.get("contact3");

                            }

                        } else {
                            Log.e("data", "error occured user main" + task.getException());
                        }

                    }
                });

        */




    }

    public void notify(View v)
    {
//        int i = conn1.length();
//        conn1 = conn1.substring(i-10,i);
        int j = conn2.length();
        conn2 = conn2.substring(j-10,j);
//        int k = conn3.length();
//        conn3 = conn3.substring(k-10,k);
        Log.v("tag",conn1 +"  "+conn2+"  "+conn3);
        String r="9156556835";

        tv=(TextView) findViewById(R.id.tt);
        tv.setText(lt+ "  "+lg);
       // SmsManager smsManager = SmsManager.getDefault();
        //smsManager.sendTextMessage(conn2, null, "https://www.google.com/maps.google.com/?ll="+lt+","+
        //        lg, null, null);
        Toast.makeText(this, "Message sent successfully", Toast.LENGTH_SHORT).show();



    }
}

