package across.downloadimages;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
    }

    //https://www.google.com/imgres?imgurl=http%3A%2F%2Fcdn.ientry.com%2Fsites%2Fwebpronews%2Fpictures%2Fwikilogodroid_616.jpg&imgrefurl=https%3A%2F%2Fcodepen.io%2FDinuD%2Fpen%2Fnhbka.html&docid=jqJ5RYUUSo05fM&tbnid=cSy4NqmAnxj-gM%3A&vet=10ahUKEwiRhv6Iw9nfAhWPe30KHXGXCw8QMwhKKAwwDA..i&w=616&h=382&itg=1&bih=657&biw=1366&q=android%20wiki&ved=0ahUKEwiRhv6Iw9nfAhWPe30KHXGXCw8QMwhKKAwwDA&iact=mrc&uact=8

    public void Downalod(View view) {
        Log.i("this","wokign");
    }

    class Downlaodtask extends AsyncTask<String, Void,String>  {
        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }

}
