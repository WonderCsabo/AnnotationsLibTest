package a605152.example.com.myapplication;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.a605152.testlibrary.MyBean;
import com.example.a605152.testlibrary.test.MyOtherBean;
import com.example.a605152.testlibrary.test.MyThirdBean;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity{

    @Bean
    MyBean bean;
    @Bean
    MyOtherBean otherBean;
    @Bean
    MyThirdBean thirdBean;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
