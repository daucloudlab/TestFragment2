package kz.kazntu.lessons.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager manager = getSupportFragmentManager() ;
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragmentB) ;
        fragmentB.changeData(data);
    }
}
