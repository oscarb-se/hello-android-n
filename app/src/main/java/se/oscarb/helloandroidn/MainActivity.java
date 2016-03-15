package se.oscarb.helloandroidn;

import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
        Förbättra appen!
        Appen ska visa information om enheten och versionen av Android som körs.
        Använd klassen Build samt PackageManager till din hjälp.
        Undersök så mycket du kan och visa upp för användaren!
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hur undersöka vilken version av Android som körs?
        if(Build.VERSION.CODENAME.equals("N")) {
            String message = "You are using the latest Android";
            message += "SDK INT " + Build.VERSION.SDK_INT;

            // Snackbar snackbar
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        }

        // Stöder enheten vissa features?
        PackageManager manager = getPackageManager();
        boolean hasNfc;
        if(manager.hasSystemFeature(PackageManager.FEATURE_NFC)) {
            hasNfc = true;
        } else {
            hasNfc = false;
        }
        Toast.makeText(MainActivity.this, "NFC? " + hasNfc, Toast.LENGTH_SHORT).show();

    }
}
